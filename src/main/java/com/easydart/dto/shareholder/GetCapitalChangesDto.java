package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 증자(감자) 현황 응답 DTO */
public class GetCapitalChangesDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("isu_dcrs_de")
    private String isuDcrsDeRaw;

    @JsonProperty("isu_dcrs_stle")
    private String isuDcrsStleRaw;

    @JsonProperty("isu_dcrs_stock_knd")
    private String isuDcrsStockKndRaw;

    @JsonProperty("isu_dcrs_qy")
    private String isuDcrsQyRaw;

    @JsonProperty("isu_dcrs_mstvdv_fval_amount")
    private String isuDcrsMstvdvFvalAmountRaw;

    @JsonProperty("isu_dcrs_mstvdv_amount")
    private String isuDcrsMstvdvAmountRaw;

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

    /** 주식발행 감소일자 */
    public String getIsuDcrsDeRaw() { return isuDcrsDeRaw; }
    public String getIsuDcrsDe() { return DataPreprocessor.formatDate(isuDcrsDeRaw); }
    public void setIsuDcrsDeRaw(String v) { this.isuDcrsDeRaw = v; }

    /** 발행 감소 형태 */
    public String getIsuDcrsStle() { return DataPreprocessor.cleanString(isuDcrsStleRaw); }
    public void setIsuDcrsStleRaw(String v) { this.isuDcrsStleRaw = v; }

    /** 발행 감소 주식 종류 */
    public String getIsuDcrsStockKnd() { return DataPreprocessor.cleanString(isuDcrsStockKndRaw); }
    public void setIsuDcrsStockKndRaw(String v) { this.isuDcrsStockKndRaw = v; }

    /** 발행 감소 수량 - 9999999999 */
    public String getIsuDcrsQyRaw() { return isuDcrsQyRaw; }
    public BigDecimal getIsuDcrsQy() { return DataPreprocessor.parseAmount(isuDcrsQyRaw); }
    public void setIsuDcrsQyRaw(String v) { this.isuDcrsQyRaw = v; }

    /** 발행 감소 주당 액면 가액 - 9999999999 */
    public String getIsuDcrsMstvdvFvalAmountRaw() { return isuDcrsMstvdvFvalAmountRaw; }
    public BigDecimal getIsuDcrsMstvdvFvalAmount() { return DataPreprocessor.parseAmount(isuDcrsMstvdvFvalAmountRaw); }
    public void setIsuDcrsMstvdvFvalAmountRaw(String v) { this.isuDcrsMstvdvFvalAmountRaw = v; }

    /** 발행 감소 주당 가액 - 9999999999 */
    public String getIsuDcrsMstvdvAmountRaw() { return isuDcrsMstvdvAmountRaw; }
    public BigDecimal getIsuDcrsMstvdvAmount() { return DataPreprocessor.parseAmount(isuDcrsMstvdvAmountRaw); }
    public void setIsuDcrsMstvdvAmountRaw(String v) { this.isuDcrsMstvdvAmountRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
