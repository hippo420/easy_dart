package com.easydart.dto.overseas;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 해외 증권시장 주권등 상장 응답 DTO */
public class GetOverseasListingDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("lststk_ostk_cnt")
    private String lststkOstkCntRaw;

    @JsonProperty("lststk_estk_cnt")
    private String lststkEstkCntRaw;

    @JsonProperty("lstex_nt")
    private String lstexNtRaw;

    @JsonProperty("stk_cd")
    private String stkCdRaw;

    @JsonProperty("lstd")
    private String lstdRaw;

    @JsonProperty("cfd")
    private String cfdRaw;

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

    /** 상장주식 종류 및 수(보통주식(주)) - 9999999999 */
    public String getLststkOstkCntRaw() { return lststkOstkCntRaw; }
    public BigDecimal getLststkOstkCnt() { return DataPreprocessor.parseAmount(lststkOstkCntRaw); }
    public void setLststkOstkCntRaw(String v) { this.lststkOstkCntRaw = v; }

    /** 상장주식 종류 및 수(기타주식(주)) - 9999999999 */
    public String getLststkEstkCntRaw() { return lststkEstkCntRaw; }
    public BigDecimal getLststkEstkCnt() { return DataPreprocessor.parseAmount(lststkEstkCntRaw); }
    public void setLststkEstkCntRaw(String v) { this.lststkEstkCntRaw = v; }

    /** 상장거래소(소재국가) */
    public String getLstexNt() { return DataPreprocessor.cleanString(lstexNtRaw); }
    public void setLstexNtRaw(String v) { this.lstexNtRaw = v; }

    /** 종목 명 (code) */
    public String getStkCd() { return DataPreprocessor.cleanString(stkCdRaw); }
    public void setStkCdRaw(String v) { this.stkCdRaw = v; }

    /** 상장일자 */
    public String getLstdRaw() { return lstdRaw; }
    public String getLstd() { return DataPreprocessor.formatDate(lstdRaw); }
    public void setLstdRaw(String v) { this.lstdRaw = v; }

    /** 확인일자 */
    public String getCfd() { return DataPreprocessor.cleanString(cfdRaw); }
    public void setCfdRaw(String v) { this.cfdRaw = v; }

}
