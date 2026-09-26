package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.debt.GetCommercialPaperBalanceDto;
import com.easydart.dto.debt.GetConditionalCapitalBalanceDto;
import com.easydart.dto.debt.GetCorporateBondBalanceDto;
import com.easydart.dto.debt.GetDebtSecuritiesIssuanceDto;
import com.easydart.dto.debt.GetHybridCapitalBalanceDto;
import com.easydart.dto.debt.GetShortTermBondBalanceDto;
import java.util.List;
import java.util.Map;

/** 채무증권 관련 API */
public class DebtSecuritiesService extends BaseService {

    private final DartHttpClient httpClient;

    public DebtSecuritiesService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 채무증권 발행실적 */
    public List<GetDebtSecuritiesIssuanceDto> getDebtSecuritiesIssuance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/detScritsIsuAcmslt.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDebtSecuritiesIssuanceDto>>(){}),
            "채무증권 발행실적");
    }

    /** 기업어음증권 미상환 잔액 */
    public List<GetCommercialPaperBalanceDto> getCommercialPaperBalance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/entrprsBilScritsNrdmpBlce.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCommercialPaperBalanceDto>>(){}),
            "기업어음증권 미상환 잔액");
    }

    /** 단기사채 미상환 잔액 */
    public List<GetShortTermBondBalanceDto> getShortTermBondBalance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/srtpdPsndbtNrdmpBlce.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetShortTermBondBalanceDto>>(){}),
            "단기사채 미상환 잔액");
    }

    /** 회사채 미상환 잔액 */
    public List<GetCorporateBondBalanceDto> getCorporateBondBalance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/cprndNrdmpBlce.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCorporateBondBalanceDto>>(){}),
            "회사채 미상환 잔액");
    }

    /** 신종자본증권 미상환 잔액 */
    public List<GetHybridCapitalBalanceDto> getHybridCapitalBalance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/newCaplScritsNrdmpBlce.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetHybridCapitalBalanceDto>>(){}),
            "신종자본증권 미상환 잔액");
    }

    /** 조건부 자본증권 미상환 잔액 */
    public List<GetConditionalCapitalBalanceDto> getConditionalCapitalBalance(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/cndlCaplScritsNrdmpBlce.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetConditionalCapitalBalanceDto>>(){}),
            "조건부 자본증권 미상환 잔액");
    }

}
