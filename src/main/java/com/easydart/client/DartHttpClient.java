package com.easydart.client;

import com.easydart.DartApiException;
import com.easydart.DartProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.StringJoiner;

public class DartHttpClient {

    private final DartProperties properties;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public DartHttpClient(DartProperties properties) {
        this.properties = properties;
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(properties.getTimeoutSeconds()))
                .build();
        this.objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /** API 인증키가 포함된 파라미터로 GET 요청 후 TypeReference로 역직렬화 */
    public <T> T get(String path, Map<String, String> params, TypeReference<T> typeRef) {
        params.put("crtfc_key", getApiKey());
        String url = buildUrl(path, params);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(properties.getTimeoutSeconds()))
                .GET()
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            if (response.statusCode() != 200) {
                throw new DartApiException("HTTP 오류: " + response.statusCode() + " (" + path + ")");
            }
            return objectMapper.readValue(response.body(), typeRef);
        } catch (IOException e) {
            throw new DartApiException("요청 실패: " + path, e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new DartApiException("요청 중단: " + path, e);
        }
    }

    private String getApiKey() {
        String key = properties.getKey();
        if (key == null || key.isBlank()) {
            throw new IllegalStateException(
                "OpenDart API 키가 설정되지 않았습니다. " +
                "application.properties에 dart.api.key=<인증키(40자리)> 를 추가하세요.");
        }
        return key;
    }

    private String buildUrl(String path, Map<String, String> params) {
        StringJoiner query = new StringJoiner("&");
        params.forEach((k, v) -> {
            if (v != null && !v.isBlank()) {
                query.add(encode(k) + "=" + encode(v));
            }
        });
        return properties.getBaseUrl() + path + "?" + query;
    }

    private String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
