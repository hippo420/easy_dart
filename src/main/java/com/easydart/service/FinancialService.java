package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.financial.GetMultiCompanyFinancialIndexDto;
import com.easydart.dto.financial.GetMultiCompanyKeyAccountsDto;
import com.easydart.dto.financial.GetSingleCompanyFinancialIndexDto;
import com.easydart.dto.financial.GetSingleCompanyFullFinancialsDto;
import com.easydart.dto.financial.GetSingleCompanyKeyAccountsDto;
import java.util.List;
import java.util.Map;

/** 재무제표 관련 API */
public class FinancialService extends BaseService {

    private final DartHttpClient httpClient;

    public FinancialService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 단일회사 주요계정 */
    public List<GetSingleCompanyKeyAccountsDto> getSingleCompanyKeyAccounts(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/fnlttSinglAcnt.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetSingleCompanyKeyAccountsDto>>(){}),
            "단일회사 주요계정");
    }

    /** 다중회사 주요계정 */
    public List<GetMultiCompanyKeyAccountsDto> getMultiCompanyKeyAccounts(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/fnlttMultiAcnt.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMultiCompanyKeyAccountsDto>>(){}),
            "다중회사 주요계정");
    }

    /** 단일회사 전체 재무제표 */
    public List<GetSingleCompanyFullFinancialsDto> getSingleCompanyFullFinancials(String corp_code, String bsns_year, String reprt_code, String fs_div) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        params.put("fs_div", fs_div);
        return extractList(httpClient.get(
            "/api/fnlttSinglAcntAll.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetSingleCompanyFullFinancialsDto>>(){}),
            "단일회사 전체 재무제표");
    }

    /** 단일회사 주요 재무지표 */
    public List<GetSingleCompanyFinancialIndexDto> getSingleCompanyFinancialIndex(String corp_code, String bsns_year, String reprt_code, String idx_cl_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        params.put("idx_cl_code", idx_cl_code);
        return extractList(httpClient.get(
            "/api/fnlttSinglIndx.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetSingleCompanyFinancialIndexDto>>(){}),
            "단일회사 주요 재무지표");
    }

    /** 다중회사 주요 재무지표 */
    public List<GetMultiCompanyFinancialIndexDto> getMultiCompanyFinancialIndex(String corp_code, String bsns_year, String reprt_code, String idx_cl_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        params.put("idx_cl_code", idx_cl_code);
        return extractList(httpClient.get(
            "/api/fnlttCmpnyIndx.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMultiCompanyFinancialIndexDto>>(){}),
            "다중회사 주요 재무지표");
    }

}
