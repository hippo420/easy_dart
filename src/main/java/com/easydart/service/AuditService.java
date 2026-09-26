package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.audit.GetAuditServiceContractDto;
import com.easydart.dto.audit.GetAuditorInfoDto;
import com.easydart.dto.audit.GetNonAuditServiceContractDto;
import java.util.List;
import java.util.Map;

/** 감사 관련 API */
public class AuditService extends BaseService {

    private final DartHttpClient httpClient;

    public AuditService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 회계감사인의 명칭 및 감사의견 */
    public List<GetAuditorInfoDto> getAuditorInfo(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/accnutAdtorNmNdAdtOpinion.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetAuditorInfoDto>>(){}),
            "회계감사인의 명칭 및 감사의견");
    }

    /** 감사용역체결현황 */
    public List<GetAuditServiceContractDto> getAuditServiceContract(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/adtServcCnclsSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetAuditServiceContractDto>>(){}),
            "감사용역체결현황");
    }

    /** 회계감사인과의 비감사용역 계약체결 현황 */
    public List<GetNonAuditServiceContractDto> getNonAuditServiceContract(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/accnutAdtorNonAdtServcCnclsSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetNonAuditServiceContractDto>>(){}),
            "회계감사인과의 비감사용역 계약체결 현황");
    }

}
