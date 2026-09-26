package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.restructure.GetBusinessAcquisitionDecisionDto;
import com.easydart.dto.restructure.GetBusinessTransferDecisionDto;
import com.easydart.dto.restructure.GetMergerDecisionDto;
import com.easydart.dto.restructure.GetMergerSpinOffDecisionDto;
import com.easydart.dto.restructure.GetOtherCorpStockAcquisitionDto;
import com.easydart.dto.restructure.GetOtherCorpStockTransferDto;
import com.easydart.dto.restructure.GetSpinOffDecisionDto;
import com.easydart.dto.restructure.GetStockExchangeTransferDecisionDto;
import com.easydart.dto.restructure.GetStockRelatedBondAcquisitionDto;
import com.easydart.dto.restructure.GetStockRelatedBondTransferDto;
import com.easydart.dto.restructure.GetTangibleAssetAcquisitionDto;
import com.easydart.dto.restructure.GetTangibleAssetTransferDto;
import java.util.List;
import java.util.Map;

/** 주요사항보고 - 기업구조 변경 API */
public class CorporateRestructureService extends BaseService {

    private final DartHttpClient httpClient;

    public CorporateRestructureService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 영업양수 결정 */
    public List<GetBusinessAcquisitionDecisionDto> getBusinessAcquisitionDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bsnInhDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetBusinessAcquisitionDecisionDto>>(){}),
            "영업양수 결정");
    }

    /** 영업양도 결정 */
    public List<GetBusinessTransferDecisionDto> getBusinessTransferDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bsnTrfDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetBusinessTransferDecisionDto>>(){}),
            "영업양도 결정");
    }

    /** 유형자산 양수 결정 */
    public List<GetTangibleAssetAcquisitionDto> getTangibleAssetAcquisition(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tgastInhDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTangibleAssetAcquisitionDto>>(){}),
            "유형자산 양수 결정");
    }

    /** 유형자산 양도 결정 */
    public List<GetTangibleAssetTransferDto> getTangibleAssetTransfer(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/tgastTrfDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTangibleAssetTransferDto>>(){}),
            "유형자산 양도 결정");
    }

    /** 타법인 주식 및 출자증권 양수결정 */
    public List<GetOtherCorpStockAcquisitionDto> getOtherCorpStockAcquisition(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/otcprStkInvscrInhDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOtherCorpStockAcquisitionDto>>(){}),
            "타법인 주식 및 출자증권 양수결정");
    }

    /** 타법인 주식 및 출자증권 양도결정 */
    public List<GetOtherCorpStockTransferDto> getOtherCorpStockTransfer(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/otcprStkInvscrTrfDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOtherCorpStockTransferDto>>(){}),
            "타법인 주식 및 출자증권 양도결정");
    }

    /** 주권 관련 사채권 양수 결정 */
    public List<GetStockRelatedBondAcquisitionDto> getStockRelatedBondAcquisition(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/stkrtbdInhDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetStockRelatedBondAcquisitionDto>>(){}),
            "주권 관련 사채권 양수 결정");
    }

    /** 주권 관련 사채권 양도 결정 */
    public List<GetStockRelatedBondTransferDto> getStockRelatedBondTransfer(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/stkrtbdTrfDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetStockRelatedBondTransferDto>>(){}),
            "주권 관련 사채권 양도 결정");
    }

    /** 회사합병 결정 */
    public List<GetMergerDecisionDto> getMergerDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/cmpMgDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMergerDecisionDto>>(){}),
            "회사합병 결정");
    }

    /** 회사분할 결정 */
    public List<GetSpinOffDecisionDto> getSpinOffDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/cmpDvDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetSpinOffDecisionDto>>(){}),
            "회사분할 결정");
    }

    /** 회사분할합병 결정 */
    public List<GetMergerSpinOffDecisionDto> getMergerSpinOffDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/cmpDvmgDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetMergerSpinOffDecisionDto>>(){}),
            "회사분할합병 결정");
    }

    /** 주식교환·이전 결정 */
    public List<GetStockExchangeTransferDecisionDto> getStockExchangeTransferDecision(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/stkExtrDecsn.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetStockExchangeTransferDecisionDto>>(){}),
            "주식교환·이전 결정");
    }

}
