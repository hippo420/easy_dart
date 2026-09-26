package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.crisis.GetAssetTransferPutbackOptionDto;
import com.easydart.dto.crisis.GetBusinessSuspensionDto;
import com.easydart.dto.crisis.GetCreditorBankManagementStartDto;
import com.easydart.dto.crisis.GetCreditorBankManagementStopDto;
import com.easydart.dto.crisis.GetDefaultOccurrenceDto;
import com.easydart.dto.crisis.GetDissolutionCauseDto;
import com.easydart.dto.crisis.GetLawsuitDto;
import com.easydart.dto.crisis.GetReorganizationApplicationDto;
import java.util.List;
import java.util.Map;

/** 기업 위기/이벤트 관련 API */
public class CorporateCrisisService extends BaseService {

    private final DartHttpClient httpClient;

    public CorporateCrisisService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 자산양수도(기타), 풋백옵션 */
    public List<GetAssetTransferPutbackOptionDto> getAssetTransferPutbackOption(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/astInhtrfEtcPtbkOpt.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetAssetTransferPutbackOptionDto>>(){}),
            "자산양수도(기타), 풋백옵션");
    }

    /** 부도발생 */
    public List<GetDefaultOccurrenceDto> getDefaultOccurrence(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/dfOcr.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDefaultOccurrenceDto>>(){}),
            "부도발생");
    }

    /** 영업정지 */
    public List<GetBusinessSuspensionDto> getBusinessSuspension(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bsnSp.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetBusinessSuspensionDto>>(){}),
            "영업정지");
    }

    /** 회생절차 개시신청 */
    public List<GetReorganizationApplicationDto> getReorganizationApplication(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/ctrcvsBgrq.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetReorganizationApplicationDto>>(){}),
            "회생절차 개시신청");
    }

    /** 해산사유 발생 */
    public List<GetDissolutionCauseDto> getDissolutionCause(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/dsRsOcr.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDissolutionCauseDto>>(){}),
            "해산사유 발생");
    }

    /** 채권은행 등의 관리절차 개시 */
    public List<GetCreditorBankManagementStartDto> getCreditorBankManagementStart(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bnkMngtPcbg.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCreditorBankManagementStartDto>>(){}),
            "채권은행 등의 관리절차 개시");
    }

    /** 채권은행 등의 관리절차 중단 */
    public List<GetCreditorBankManagementStopDto> getCreditorBankManagementStop(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/bnkMngtPcsp.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetCreditorBankManagementStopDto>>(){}),
            "채권은행 등의 관리절차 중단");
    }

    /** 소송 등의 제기 */
    public List<GetLawsuitDto> getLawsuit(String corp_code, String bgn_de, String end_de) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bgn_de", bgn_de);
        params.put("end_de", end_de);
        return extractList(httpClient.get(
            "/api/lwstLg.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetLawsuitDto>>(){}),
            "소송 등의 제기");
    }

}
