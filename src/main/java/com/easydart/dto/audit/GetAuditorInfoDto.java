package com.easydart.dto.audit;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회계감사인의 명칭 및 감사의견 응답 DTO */
public class GetAuditorInfoDto {

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

    @JsonProperty("adt_opinion")
    private String adtOpinionRaw;

    @JsonProperty("adt_reprt_spcmnt_matter")
    private String adtReprtSpcmntMatterRaw;

    @JsonProperty("emphs_matter")
    private String emphsMatterRaw;

    @JsonProperty("core_adt_matter")
    private String coreAdtMatterRaw;

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

    /** 감사의견 */
    public String getAdtOpinion() { return DataPreprocessor.cleanString(adtOpinionRaw); }
    public void setAdtOpinionRaw(String v) { this.adtOpinionRaw = v; }

    /** 감사보고서 특기사항 - 감사보고서 특기사항 ① 2019년 12월 8일까지 사용됨 */
    public String getAdtReprtSpcmntMatter() { return DataPreprocessor.cleanString(adtReprtSpcmntMatterRaw); }
    public void setAdtReprtSpcmntMatterRaw(String v) { this.adtReprtSpcmntMatterRaw = v; }

    /** 강조사항 등 - 강조사항 등 ② 2019년 12월 9일부터 추가됨 */
    public String getEmphsMatter() { return DataPreprocessor.cleanString(emphsMatterRaw); }
    public void setEmphsMatterRaw(String v) { this.emphsMatterRaw = v; }

    /** 핵심감사사항 - 핵심감사사항 ② 2019년 12월 9일부터 추가됨 */
    public String getCoreAdtMatterRaw() { return coreAdtMatterRaw; }
    public BigDecimal getCoreAdtMatter() { return DataPreprocessor.parseAmount(coreAdtMatterRaw); }
    public void setCoreAdtMatterRaw(String v) { this.coreAdtMatterRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
