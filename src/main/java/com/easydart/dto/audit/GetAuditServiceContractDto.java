package com.easydart.dto.audit;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 감사용역체결현황 응답 DTO */
public class GetAuditServiceContractDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("bsns_year")
    private String bsnsYearRaw;

    @JsonProperty("adtor")
    private String adtorRaw;

    @JsonProperty("cn")
    private String cnRaw;

    @JsonProperty("mendng")
    private String mendngRaw;

    @JsonProperty("tot_reqre_time")
    private String totReqreTimeRaw;

    @JsonProperty("adt_cntrct_dtls_mendng")
    private String adtCntrctDtlsMendngRaw;

    @JsonProperty("adt_cntrct_dtls_time")
    private String adtCntrctDtlsTimeRaw;

    @JsonProperty("real_exc_dtls_mendng")
    private String realExcDtlsMendngRaw;

    @JsonProperty("real_exc_dtls_time")
    private String realExcDtlsTimeRaw;

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

    /** 사업연도 - 사업연도(당기, 전기, 전전기) */
    public String getBsnsYear() { return DataPreprocessor.cleanString(bsnsYearRaw); }
    public void setBsnsYearRaw(String v) { this.bsnsYearRaw = v; }

    /** 감사인 */
    public String getAdtor() { return DataPreprocessor.cleanString(adtorRaw); }
    public void setAdtorRaw(String v) { this.adtorRaw = v; }

    /** 내용 */
    public String getCn() { return DataPreprocessor.cleanString(cnRaw); }
    public void setCnRaw(String v) { this.cnRaw = v; }

    /** 보수 - 보수 ① 2020년 7월 5일까지 사용됨 */
    public String getMendngRaw() { return mendngRaw; }
    public BigDecimal getMendng() { return DataPreprocessor.parseAmount(mendngRaw); }
    public void setMendngRaw(String v) { this.mendngRaw = v; }

    /** 총소요시간 - 총소요시간 ① 2020년 7월 5일까지 사용됨 */
    public String getTotReqreTime() { return DataPreprocessor.cleanString(totReqreTimeRaw); }
    public void setTotReqreTimeRaw(String v) { this.totReqreTimeRaw = v; }

    /** 감사계약내역(보수) - 감사계약내역(보수) ② 2020년 7월 6일부터 추가됨 */
    public String getAdtCntrctDtlsMendngRaw() { return adtCntrctDtlsMendngRaw; }
    public BigDecimal getAdtCntrctDtlsMendng() { return DataPreprocessor.parseAmount(adtCntrctDtlsMendngRaw); }
    public void setAdtCntrctDtlsMendngRaw(String v) { this.adtCntrctDtlsMendngRaw = v; }

    /** 감사계약내역(시간) - 감사계약내역(시간) ② 2020년 7월 6일부터 추가됨 */
    public String getAdtCntrctDtlsTimeRaw() { return adtCntrctDtlsTimeRaw; }
    public BigDecimal getAdtCntrctDtlsTime() { return DataPreprocessor.parseAmount(adtCntrctDtlsTimeRaw); }
    public void setAdtCntrctDtlsTimeRaw(String v) { this.adtCntrctDtlsTimeRaw = v; }

    /** 실제수행내역(보수) - 실제수행내역(보수) ② 2020년 7월 6일부터 추가됨 */
    public String getRealExcDtlsMendngRaw() { return realExcDtlsMendngRaw; }
    public BigDecimal getRealExcDtlsMendng() { return DataPreprocessor.parseAmount(realExcDtlsMendngRaw); }
    public void setRealExcDtlsMendngRaw(String v) { this.realExcDtlsMendngRaw = v; }

    /** 실제수행내역(시간) - 실제수행내역(시간) ② 2020년 7월 6일부터 추가됨 */
    public String getRealExcDtlsTime() { return DataPreprocessor.cleanString(realExcDtlsTimeRaw); }
    public void setRealExcDtlsTimeRaw(String v) { this.realExcDtlsTimeRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
