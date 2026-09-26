package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.client.DartHttpClient;
import com.easydart.dto.common.DartResponse;
import com.easydart.dto.personnel.GetDirectorIndividualPayDto;
import com.easydart.dto.personnel.GetDirectorPayApprovalDto;
import com.easydart.dto.personnel.GetDirectorPayByTypeDto;
import com.easydart.dto.personnel.GetDirectorTotalPayDto;
import com.easydart.dto.personnel.GetEmployeeStatusDto;
import com.easydart.dto.personnel.GetExecutiveStatusDto;
import com.easydart.dto.personnel.GetOutsideDirectorStatusDto;
import com.easydart.dto.personnel.GetTopIndividualPayDto;
import com.easydart.dto.personnel.GetUnregisteredExecutivePayDto;
import java.util.List;
import java.util.Map;

/** 임원/직원 관련 API */
public class PersonnelService extends BaseService {

    private final DartHttpClient httpClient;

    public PersonnelService(DartHttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /** 임원 현황 */
    public List<GetExecutiveStatusDto> getExecutiveStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/exctvSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetExecutiveStatusDto>>(){}),
            "임원 현황");
    }

    /** 직원 현황 */
    public List<GetEmployeeStatusDto> getEmployeeStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/empSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetEmployeeStatusDto>>(){}),
            "직원 현황");
    }

    /** 이사·감사의 개인별 보수현황(5억원 이상) */
    public List<GetDirectorIndividualPayDto> getDirectorIndividualPay(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/hmvAuditIndvdlBySttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDirectorIndividualPayDto>>(){}),
            "이사·감사의 개인별 보수현황(5억원 이상)");
    }

    /** 이사·감사 전체의 보수현황(보수지급금액 - 이사·감사 전체) */
    public List<GetDirectorTotalPayDto> getDirectorTotalPay(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/hmvAuditAllSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDirectorTotalPayDto>>(){}),
            "이사·감사 전체의 보수현황(보수지급금액 - 이사·감사 전체)");
    }

    /** 개인별 보수지급 금액(5억이상 상위5인) */
    public List<GetTopIndividualPayDto> getTopIndividualPay(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/indvdlByPay.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetTopIndividualPayDto>>(){}),
            "개인별 보수지급 금액(5억이상 상위5인)");
    }

    /** 미등기임원 보수현황 */
    public List<GetUnregisteredExecutivePayDto> getUnregisteredExecutivePay(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/unrstExctvMendngSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetUnregisteredExecutivePayDto>>(){}),
            "미등기임원 보수현황");
    }

    /** 이사·감사 전체의 보수현황(주주총회 승인금액) */
    public List<GetDirectorPayApprovalDto> getDirectorPayApproval(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/drctrAdtAllMendngSttusGmtsckConfmAmount.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDirectorPayApprovalDto>>(){}),
            "이사·감사 전체의 보수현황(주주총회 승인금액)");
    }

    /** 이사·감사 전체의 보수현황(보수지급금액 - 유형별) */
    public List<GetDirectorPayByTypeDto> getDirectorPayByType(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/drctrAdtAllMendngSttusMendngPymntamtTyCl.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetDirectorPayByTypeDto>>(){}),
            "이사·감사 전체의 보수현황(보수지급금액 - 유형별)");
    }

    /** 사외이사 및 그 변동현황 */
    public List<GetOutsideDirectorStatusDto> getOutsideDirectorStatus(String corp_code, String bsns_year, String reprt_code) {
        Map<String, String> params = new java.util.LinkedHashMap<>();
        params.put("corp_code", corp_code);
        params.put("bsns_year", bsns_year);
        params.put("reprt_code", reprt_code);
        return extractList(httpClient.get(
            "/api/outcmpnyDrctrNdChangeSttus.json", params,
            new com.fasterxml.jackson.core.type.TypeReference<DartResponse<GetOutsideDirectorStatusDto>>(){}),
            "사외이사 및 그 변동현황");
    }

}
