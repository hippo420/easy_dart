package com.easydart.dto.personnel;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 이사·감사의 개인별 보수현황(5억원 이상) 응답 DTO */
public class GetDirectorIndividualPayDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("nm")
    private String nmRaw;

    @JsonProperty("ofcps")
    private String ofcpsRaw;

    @JsonProperty("mendng_totamt")
    private String mendngTotamtRaw;

    @JsonProperty("mendng_totamt_ct_incls_mendng")
    private String mendngTotamtCtInclsMendngRaw;

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

    /** 법인명 */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 이름 - 홍길동 */
    public String getNm() { return DataPreprocessor.cleanString(nmRaw); }
    public void setNmRaw(String v) { this.nmRaw = v; }

    /** 직위 - 이사, 대표이사 등 */
    public String getOfcps() { return DataPreprocessor.cleanString(ofcpsRaw); }
    public void setOfcpsRaw(String v) { this.ofcpsRaw = v; }

    /** 보수 총액 - 9999999999 */
    public String getMendngTotamtRaw() { return mendngTotamtRaw; }
    public BigDecimal getMendngTotamt() { return DataPreprocessor.parseAmount(mendngTotamtRaw); }
    public void setMendngTotamtRaw(String v) { this.mendngTotamtRaw = v; }

    /** 보수 총액 비 포함 보수 - 9999999999 */
    public String getMendngTotamtCtInclsMendngRaw() { return mendngTotamtCtInclsMendngRaw; }
    public BigDecimal getMendngTotamtCtInclsMendng() { return DataPreprocessor.parseAmount(mendngTotamtCtInclsMendngRaw); }
    public void setMendngTotamtCtInclsMendngRaw(String v) { this.mendngTotamtCtInclsMendngRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
