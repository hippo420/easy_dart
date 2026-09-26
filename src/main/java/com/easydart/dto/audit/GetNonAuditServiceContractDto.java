package com.easydart.dto.audit;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회계감사인과의 비감사용역 계약체결 현황 응답 DTO */
public class GetNonAuditServiceContractDto {

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

    @JsonProperty("cntrct_cncls_de")
    private String cntrctCnclsDeRaw;

    @JsonProperty("servc_cn")
    private String servcCnRaw;

    @JsonProperty("servc_exc_pd")
    private String servcExcPdRaw;

    @JsonProperty("servc_mendng")
    private String servcMendngRaw;

    @JsonProperty("rm")
    private String rmRaw;

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

    /** 계약체결일 */
    public String getCntrctCnclsDeRaw() { return cntrctCnclsDeRaw; }
    public String getCntrctCnclsDe() { return DataPreprocessor.formatDate(cntrctCnclsDeRaw); }
    public void setCntrctCnclsDeRaw(String v) { this.cntrctCnclsDeRaw = v; }

    /** 용역내용 */
    public String getServcCn() { return DataPreprocessor.cleanString(servcCnRaw); }
    public void setServcCnRaw(String v) { this.servcCnRaw = v; }

    /** 용역수행기간 */
    public String getServcExcPd() { return DataPreprocessor.cleanString(servcExcPdRaw); }
    public void setServcExcPdRaw(String v) { this.servcExcPdRaw = v; }

    /** 용역보수 */
    public String getServcMendngRaw() { return servcMendngRaw; }
    public BigDecimal getServcMendng() { return DataPreprocessor.parseAmount(servcMendngRaw); }
    public void setServcMendngRaw(String v) { this.servcMendngRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
