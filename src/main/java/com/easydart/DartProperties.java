package com.easydart;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * OpenDart API 설정 프로퍼티
 * application.properties: dart.api.key=발급받은인증키
 * application.yml:
 *   dart:
 *     api:
 *       key: 발급받은인증키
 */
@ConfigurationProperties(prefix = "dart.api")
public class DartProperties {

    /** OpenDart API 인증키 (40자리) */
    private String key;

    /** 요청 타임아웃 (초, 기본값 30) */
    private int timeoutSeconds = 30;

    /** 기본 API URL */
    private String baseUrl = "https://opendart.fss.or.kr/api";

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public int getTimeoutSeconds() { return timeoutSeconds; }
    public void setTimeoutSeconds(int timeoutSeconds) { this.timeoutSeconds = timeoutSeconds; }

    public String getBaseUrl() { return baseUrl; }
    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }
}
