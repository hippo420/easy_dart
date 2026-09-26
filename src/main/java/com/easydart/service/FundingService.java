package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.funding.GetOtherCorpInvestmentDto;
import com.easydart.dto.funding.GetPrivatePlacementFundUsageDto;
import com.easydart.dto.funding.GetPublicOfferingFundUsageDto;
import java.util.List;
import java.util.Map;

/** 자금 조달/운용 관련 API */
public class FundingService extends BaseService {

    private final DartHttpClient httpClient;

    public FundingService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 타법인 출자현황 */
    public List<GetOtherCorpInvestmentDto> getOtherCorpInvestment(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/otrCprInvstmntSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOtherCorpInvestmentDto>>(){}),
            "타법인 출자현황");
    }

    /** 공모자금의 사용내역 */
    public List<GetPublicOfferingFundUsageDto> getPublicOfferingFundUsage(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/pssrpCptalUseDtls.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetPublicOfferingFundUsageDto>>(){}),
            "공모자금의 사용내역");
    }

    /** 사모자금의 사용내역 */
    public List<GetPrivatePlacementFundUsageDto> getPrivatePlacementFundUsage(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/prvsrpCptalUseDtls.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetPrivatePlacementFundUsageDto>>(){}),
            "사모자금의 사용내역");
    }

}
