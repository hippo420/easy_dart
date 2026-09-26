package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.issuance.GetBondWithWarrantIssuanceDto;
import com.easydart.dto.issuance.GetCapitalReductionDecisionDto;
import com.easydart.dto.issuance.GetConvertibleBondIssuanceDto;
import com.easydart.dto.issuance.GetExchangeableBondIssuanceDto;
import com.easydart.dto.issuance.GetFreeCapitalIncreaseDecisionDto;
import com.easydart.dto.issuance.GetMixedCapitalIncreaseDecisionDto;
import com.easydart.dto.issuance.GetPaidCapitalIncreaseDecisionDto;
import com.easydart.dto.issuance.GetTreasuryStockAcquisitionDecisionDto;
import com.easydart.dto.issuance.GetTreasuryStockDisposalDecisionDto;
import com.easydart.dto.issuance.GetTreasuryStockTrustAcquisitionDto;
import com.easydart.dto.issuance.GetTreasuryStockTrustTerminationDto;
import com.easydart.dto.issuance.GetWriteDownCocobondIssuanceDto;
import java.util.List;
import java.util.Map;

/** 주요사항보고 - 증권 발행 결정 API */
public class SecuritiesIssuanceService extends BaseService {

    private final DartHttpClient httpClient;

    public SecuritiesIssuanceService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 유상증자 결정 */
    public List<GetPaidCapitalIncreaseDecisionDto> getPaidCapitalIncreaseDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/piicDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetPaidCapitalIncreaseDecisionDto>>(){}),
            "유상증자 결정");
    }

    /** 무상증자 결정 */
    public List<GetFreeCapitalIncreaseDecisionDto> getFreeCapitalIncreaseDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/fricDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetFreeCapitalIncreaseDecisionDto>>(){}),
            "무상증자 결정");
    }

    /** 유무상증자 결정 */
    public List<GetMixedCapitalIncreaseDecisionDto> getMixedCapitalIncreaseDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/pifricDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMixedCapitalIncreaseDecisionDto>>(){}),
            "유무상증자 결정");
    }

    /** 감자 결정 */
    public List<GetCapitalReductionDecisionDto> getCapitalReductionDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/crDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCapitalReductionDecisionDto>>(){}),
            "감자 결정");
    }

    /** 전환사채권 발행결정 */
    public List<GetConvertibleBondIssuanceDto> getConvertibleBondIssuance(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/cvbdIsDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetConvertibleBondIssuanceDto>>(){}),
            "전환사채권 발행결정");
    }

    /** 신주인수권부사채권 발행결정 */
    public List<GetBondWithWarrantIssuanceDto> getBondWithWarrantIssuance(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bdwtIsDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetBondWithWarrantIssuanceDto>>(){}),
            "신주인수권부사채권 발행결정");
    }

    /** 교환사채권 발행결정 */
    public List<GetExchangeableBondIssuanceDto> getExchangeableBondIssuance(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/exbdIsDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetExchangeableBondIssuanceDto>>(){}),
            "교환사채권 발행결정");
    }

    /** 상각형 조건부자본증권 발행결정 */
    public List<GetWriteDownCocobondIssuanceDto> getWriteDownCocobondIssuance(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/wdCocobdIsDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetWriteDownCocobondIssuanceDto>>(){}),
            "상각형 조건부자본증권 발행결정");
    }

    /** 자기주식 취득 결정 */
    public List<GetTreasuryStockAcquisitionDecisionDto> getTreasuryStockAcquisitionDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tsstkAqDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTreasuryStockAcquisitionDecisionDto>>(){}),
            "자기주식 취득 결정");
    }

    /** 자기주식 처분 결정 */
    public List<GetTreasuryStockDisposalDecisionDto> getTreasuryStockDisposalDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tsstkDpDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTreasuryStockDisposalDecisionDto>>(){}),
            "자기주식 처분 결정");
    }

    /** 자기주식취득 신탁계약 체결 결정 */
    public List<GetTreasuryStockTrustAcquisitionDto> getTreasuryStockTrustAcquisition(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tsstkAqTrctrCnsDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTreasuryStockTrustAcquisitionDto>>(){}),
            "자기주식취득 신탁계약 체결 결정");
    }

    /** 자기주식취득 신탁계약 해지 결정 */
    public List<GetTreasuryStockTrustTerminationDto> getTreasuryStockTrustTermination(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tsstkAqTrctrCcDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTreasuryStockTrustTerminationDto>>(){}),
            "자기주식취득 신탁계약 해지 결정");
    }

}
