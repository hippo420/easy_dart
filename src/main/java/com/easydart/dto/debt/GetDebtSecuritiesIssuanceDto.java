package com.easydart.dto.debt;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 채무증권 발행실적 응답 DTO */
public class GetDebtSecuritiesIssuanceDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("isu_cmpny")
    private String isuCmpnyRaw;

    @JsonProperty("scrits_knd_nm")
    private String scritsKndNmRaw;

    @JsonProperty("isu_mth_nm")
    private String isuMthNmRaw;

    @JsonProperty("isu_de")
    private String isuDeRaw;

    @JsonProperty("facvalu_totamt")
    private String facvaluTotamtRaw;

    @JsonProperty("intrt")
    private String intrtRaw;

    @JsonProperty("evl_grad_instt")
    private String evlGradInsttRaw;

    @JsonProperty("mtd")
    private String mtdRaw;

    @JsonProperty("repy_at")
    private String repyAtRaw;

    @JsonProperty("mngt_cmpny")
    private String mngtCmpnyRaw;

    @JsonProperty("stlm_dt")
    private String stlmDtRaw;

    // === 전처리된 접근자 ===

    /** 접수번호 - 접수번호(14자리) ※ 공시뷰어 연결에 이용예시 - PC용 : https://dart.fss.or.kr/ds */
    public String getRceptNo() { return DataPreprocessor.cleanString(rceptNoRaw); }
    public void setRceptNoRaw(String v) { this.rceptNoRaw = v; }

    /** 법인구분 - 법인구분 : Y(유가), K(코스닥), N(코넥스), E(기타) */
    public String getCorpClsRaw() { return corpClsRaw; }
    public String getCorpCls() { return DataPreprocessor.resolveCorpCls(corpClsRaw); }
    public void setCorpClsRaw(String v) { this.corpClsRaw = v; }

    /** 고유번호 - 공시대상회사의 고유번호(8자리) */
    public String getCorpCodeRaw() { return corpCodeRaw; }
    public BigDecimal getCorpCode() { return DataPreprocessor.parseAmount(corpCodeRaw); }
    public void setCorpCodeRaw(String v) { this.corpCodeRaw = v; }

    /** 회사명 - 공시대상회사명 */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 발행회사 */
    public String getIsuCmpny() { return DataPreprocessor.cleanString(isuCmpnyRaw); }
    public void setIsuCmpnyRaw(String v) { this.isuCmpnyRaw = v; }

    /** 증권종류 */
    public String getScritsKndNm() { return DataPreprocessor.cleanString(scritsKndNmRaw); }
    public void setScritsKndNmRaw(String v) { this.scritsKndNmRaw = v; }

    /** 발행방법 */
    public String getIsuMthNm() { return DataPreprocessor.cleanString(isuMthNmRaw); }
    public void setIsuMthNmRaw(String v) { this.isuMthNmRaw = v; }

    /** 발행일자 - 발행일자(YYYYMMDD) */
    public String getIsuDeRaw() { return isuDeRaw; }
    public String getIsuDe() { return DataPreprocessor.formatDate(isuDeRaw); }
    public void setIsuDeRaw(String v) { this.isuDeRaw = v; }

    /** 권면(전자등록)총액 - 9999999999 */
    public String getFacvaluTotamtRaw() { return facvaluTotamtRaw; }
    public BigDecimal getFacvaluTotamt() { return DataPreprocessor.parseAmount(facvaluTotamtRaw); }
    public void setFacvaluTotamtRaw(String v) { this.facvaluTotamtRaw = v; }

    /** 이자율 */
    public String getIntrtRaw() { return intrtRaw; }
    public BigDecimal getIntrt() { return DataPreprocessor.parseAmount(intrtRaw); }
    public void setIntrtRaw(String v) { this.intrtRaw = v; }

    /** 평가등급(평가기관) */
    public String getEvlGradInstt() { return DataPreprocessor.cleanString(evlGradInsttRaw); }
    public void setEvlGradInsttRaw(String v) { this.evlGradInsttRaw = v; }

    /** 만기일 - 만기일(YYYYMMDD) */
    public String getMtd() { return DataPreprocessor.cleanString(mtdRaw); }
    public void setMtdRaw(String v) { this.mtdRaw = v; }

    /** 상환여부 */
    public String getRepyAt() { return DataPreprocessor.cleanString(repyAtRaw); }
    public void setRepyAtRaw(String v) { this.repyAtRaw = v; }

    /** 주관회사 */
    public String getMngtCmpny() { return DataPreprocessor.cleanString(mngtCmpnyRaw); }
    public void setMngtCmpnyRaw(String v) { this.mngtCmpnyRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
