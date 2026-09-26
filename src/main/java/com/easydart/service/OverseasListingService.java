package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.overseas.GetOverseasDelistingDecisionDto;
import com.easydart.dto.overseas.GetOverseasDelistingDto;
import com.easydart.dto.overseas.GetOverseasListingDecisionDto;
import com.easydart.dto.overseas.GetOverseasListingDto;
import java.util.List;
import java.util.Map;

/** 해외 증권시장 상장 관련 API */
public class OverseasListingService extends BaseService {

    private final DartHttpClient httpClient;

    public OverseasListingService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 해외 증권시장 주권등 상장 결정 */
    public List<GetOverseasListingDecisionDto> getOverseasListingDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/ovLstDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOverseasListingDecisionDto>>(){}),
            "해외 증권시장 주권등 상장 결정");
    }

    /** 해외 증권시장 주권등 상장폐지 결정 */
    public List<GetOverseasDelistingDecisionDto> getOverseasDelistingDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/ovDlstDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOverseasDelistingDecisionDto>>(){}),
            "해외 증권시장 주권등 상장폐지 결정");
    }

    /** 해외 증권시장 주권등 상장 */
    public List<GetOverseasListingDto> getOverseasListing(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/ovLst.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOverseasListingDto>>(){}),
            "해외 증권시장 주권등 상장");
    }

    /** 해외 증권시장 주권등 상장폐지 */
    public List<GetOverseasDelistingDto> getOverseasDelisting(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/ovDlst.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOverseasDelistingDto>>(){}),
            "해외 증권시장 주권등 상장폐지");
    }

}
