package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.registration.GetDebtSecuritiesRegistrationDto;
import com.easydart.dto.registration.GetDepositaryReceiptRegistrationDto;
import com.easydart.dto.registration.GetEquitySecuritiesRegistrationDto;
import com.easydart.dto.registration.GetMergerRegistrationDto;
import com.easydart.dto.registration.GetSpinOffRegistrationDto;
import com.easydart.dto.registration.GetStockExchangeRegistrationDto;
import java.util.List;
import java.util.Map;

/** 증권신고서 관련 API */
public class SecuritiesRegistrationService extends BaseService {

    private final DartHttpClient httpClient;

    public SecuritiesRegistrationService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 지분증권 */
    public List<GetEquitySecuritiesRegistrationDto> getEquitySecuritiesRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/estkRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetEquitySecuritiesRegistrationDto>>(){}),
            "지분증권");
    }

    /** 채무증권 */
    public List<GetDebtSecuritiesRegistrationDto> getDebtSecuritiesRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bdRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDebtSecuritiesRegistrationDto>>(){}),
            "채무증권");
    }

    /** 증권예탁증권 */
    public List<GetDepositaryReceiptRegistrationDto> getDepositaryReceiptRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/stkdpRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDepositaryReceiptRegistrationDto>>(){}),
            "증권예탁증권");
    }

    /** 합병 */
    public List<GetMergerRegistrationDto> getMergerRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/mgRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMergerRegistrationDto>>(){}),
            "합병");
    }

    /** 주식의포괄적교환·이전 */
    public List<GetStockExchangeRegistrationDto> getStockExchangeRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/extrRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetStockExchangeRegistrationDto>>(){}),
            "주식의포괄적교환·이전");
    }

    /** 분할 */
    public List<GetSpinOffRegistrationDto> getSpinOffRegistration(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/dvRs.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetSpinOffRegistrationDto>>(){}),
            "분할");
    }

}
