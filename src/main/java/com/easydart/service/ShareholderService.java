package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.shareholder.GetCapitalChangesDto;
import com.easydart.dto.shareholder.GetDividendInfoDto;
import com.easydart.dto.shareholder.GetExecutiveStockOwnershipDto;
import com.easydart.dto.shareholder.GetMajorShareholderChangesDto;
import com.easydart.dto.shareholder.GetMajorShareholderStatusDto;
import com.easydart.dto.shareholder.GetMajorStockHoldingDto;
import com.easydart.dto.shareholder.GetMinorShareholderStatusDto;
import com.easydart.dto.shareholder.GetStockTotalStatusDto;
import com.easydart.dto.shareholder.GetTreasuryStockStatusDto;
import java.util.List;
import java.util.Map;

/** 주주/지분 관련 API */
public class ShareholderService extends BaseService {

    private final DartHttpClient httpClient;

    public ShareholderService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 증자(감자) 현황 */
    public List<GetCapitalChangesDto> getCapitalChanges(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/irdsSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCapitalChangesDto>>(){}),
            "증자(감자) 현황");
    }

    /** 배당에 관한 사항 */
    public List<GetDividendInfoDto> getDividendInfo(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/alotMatter.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDividendInfoDto>>(){}),
            "배당에 관한 사항");
    }

    /** 자기주식 취득 및 처분 현황 */
    public List<GetTreasuryStockStatusDto> getTreasuryStockStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/tesstkAcqsDspsSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTreasuryStockStatusDto>>(){}),
            "자기주식 취득 및 처분 현황");
    }

    /** 최대주주 현황 */
    public List<GetMajorShareholderStatusDto> getMajorShareholderStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/hyslrSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMajorShareholderStatusDto>>(){}),
            "최대주주 현황");
    }

    /** 최대주주 변동현황 */
    public List<GetMajorShareholderChangesDto> getMajorShareholderChanges(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/hyslrChgSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMajorShareholderChangesDto>>(){}),
            "최대주주 변동현황");
    }

    /** 소액주주 현황 */
    public List<GetMinorShareholderStatusDto> getMinorShareholderStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/mrhlSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMinorShareholderStatusDto>>(){}),
            "소액주주 현황");
    }

    /** 주식의 총수 현황 */
    public List<GetStockTotalStatusDto> getStockTotalStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/stockTotqySttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetStockTotalStatusDto>>(){}),
            "주식의 총수 현황");
    }

    /** 대량보유 상황보고 */
    public List<GetMajorStockHoldingDto> getMajorStockHolding(String corp_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        return extractList(httpClient.get(
            "/api/majorstock.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMajorStockHoldingDto>>(){}),
            "대량보유 상황보고");
    }

    /** 임원ㆍ주요주주 소유보고 */
    public List<GetExecutiveStockOwnershipDto> getExecutiveStockOwnership(String corp_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        return extractList(httpClient.get(
            "/api/elestock.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetExecutiveStockOwnershipDto>>(){}),
            "임원ㆍ주요주주 소유보고");
    }

}
