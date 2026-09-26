package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 배당에 관한 사항 응답 DTO */
public class GetDividendInfoDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("se")
    private String seRaw;

    @JsonProperty("stock_knd")
    private String stockKndRaw;

    @JsonProperty("thstrm")
    private String thstrmRaw;

    @JsonProperty("frmtrm")
    private String frmtrmRaw;

    @JsonProperty("lwfr")
    private String lwfrRaw;

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

    /** 구분 - 유상증자(주주배정), 전환권행사 등 */
    public String getSe() { return DataPreprocessor.cleanString(seRaw); }
    public void setSeRaw(String v) { this.seRaw = v; }

    /** 주식 종류 - 보통주 등 */
    public String getStockKnd() { return DataPreprocessor.cleanString(stockKndRaw); }
    public void setStockKndRaw(String v) { this.stockKndRaw = v; }

    /** 당기 - 9999999999 */
    public String getThstrm() { return DataPreprocessor.cleanString(thstrmRaw); }
    public void setThstrmRaw(String v) { this.thstrmRaw = v; }

    /** 전기 - 9999999999 */
    public String getFrmtrm() { return DataPreprocessor.cleanString(frmtrmRaw); }
    public void setFrmtrmRaw(String v) { this.frmtrmRaw = v; }

    /** 전전기 - 9999999999 */
    public String getLwfr() { return DataPreprocessor.cleanString(lwfrRaw); }
    public void setLwfrRaw(String v) { this.lwfrRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
