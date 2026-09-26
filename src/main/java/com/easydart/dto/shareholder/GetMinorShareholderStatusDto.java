package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 소액주주 현황 응답 DTO */
public class GetMinorShareholderStatusDto {

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

    @JsonProperty("shrholdr_co")
    private String shrholdrCoRaw;

    @JsonProperty("shrholdr_tot_co")
    private String shrholdrTotCoRaw;

    @JsonProperty("shrholdr_rate")
    private String shrholdrRateRaw;

    @JsonProperty("hold_stock_co")
    private String holdStockCoRaw;

    @JsonProperty("stock_tot_co")
    private String stockTotCoRaw;

    @JsonProperty("hold_stock_rate")
    private String holdStockRateRaw;

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

    /** 구분 - 소액주주 */
    public String getSe() { return DataPreprocessor.cleanString(seRaw); }
    public void setSeRaw(String v) { this.seRaw = v; }

    /** 주주수 - 9999999999 */
    public String getShrholdrCoRaw() { return shrholdrCoRaw; }
    public BigDecimal getShrholdrCo() { return DataPreprocessor.parseAmount(shrholdrCoRaw); }
    public void setShrholdrCoRaw(String v) { this.shrholdrCoRaw = v; }

    /** 전체 주주수 - 9999999999 */
    public String getShrholdrTotCoRaw() { return shrholdrTotCoRaw; }
    public BigDecimal getShrholdrTotCo() { return DataPreprocessor.parseAmount(shrholdrTotCoRaw); }
    public void setShrholdrTotCoRaw(String v) { this.shrholdrTotCoRaw = v; }

    /** 주주 비율 */
    public String getShrholdrRateRaw() { return shrholdrRateRaw; }
    public BigDecimal getShrholdrRate() { return DataPreprocessor.parseAmount(shrholdrRateRaw); }
    public void setShrholdrRateRaw(String v) { this.shrholdrRateRaw = v; }

    /** 보유 주식수 - 9999999999 */
    public String getHoldStockCoRaw() { return holdStockCoRaw; }
    public BigDecimal getHoldStockCo() { return DataPreprocessor.parseAmount(holdStockCoRaw); }
    public void setHoldStockCoRaw(String v) { this.holdStockCoRaw = v; }

    /** 총발행 주식수 - 9999999999 */
    public String getStockTotCoRaw() { return stockTotCoRaw; }
    public BigDecimal getStockTotCo() { return DataPreprocessor.parseAmount(stockTotCoRaw); }
    public void setStockTotCoRaw(String v) { this.stockTotCoRaw = v; }

    /** 보유 주식 비율 */
    public String getHoldStockRateRaw() { return holdStockRateRaw; }
    public BigDecimal getHoldStockRate() { return DataPreprocessor.parseAmount(holdStockRateRaw); }
    public void setHoldStockRateRaw(String v) { this.holdStockRateRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
