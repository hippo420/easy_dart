package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 주식의 총수 현황 응답 DTO */
public class GetStockTotalStatusDto {

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

    @JsonProperty("isu_stock_totqy")
    private String isuStockTotqyRaw;

    @JsonProperty("now_to_isu_stock_totqy")
    private String nowToIsuStockTotqyRaw;

    @JsonProperty("now_to_dcrs_stock_totqy")
    private String nowToDcrsStockTotqyRaw;

    @JsonProperty("redc")
    private String redcRaw;

    @JsonProperty("profit_incnr")
    private String profitIncnrRaw;

    @JsonProperty("rdmstk_repy")
    private String rdmstkRepyRaw;

    @JsonProperty("etc")
    private String etcRaw;

    @JsonProperty("istc_totqy")
    private String istcTotqyRaw;

    @JsonProperty("tesstk_co")
    private String tesstkCoRaw;

    @JsonProperty("distb_stock_co")
    private String distbStockCoRaw;

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

    /** 구분 - 구분(증권의종류, 합계, 비고) */
    public String getSe() { return DataPreprocessor.cleanString(seRaw); }
    public void setSeRaw(String v) { this.seRaw = v; }

    /** 발행할 주식의 총수 - Ⅰ. 발행할 주식의 총수, 9,999,999,999 */
    public String getIsuStockTotqyRaw() { return isuStockTotqyRaw; }
    public BigDecimal getIsuStockTotqy() { return DataPreprocessor.parseAmount(isuStockTotqyRaw); }
    public void setIsuStockTotqyRaw(String v) { this.isuStockTotqyRaw = v; }

    /** 현재까지 발행한 주식의 총수 - Ⅱ. 현재까지 발행한 주식의 총수, 9,999,999,999 */
    public String getNowToIsuStockTotqyRaw() { return nowToIsuStockTotqyRaw; }
    public BigDecimal getNowToIsuStockTotqy() { return DataPreprocessor.parseAmount(nowToIsuStockTotqyRaw); }
    public void setNowToIsuStockTotqyRaw(String v) { this.nowToIsuStockTotqyRaw = v; }

    /** 현재까지 감소한 주식의 총수 - Ⅲ. 현재까지 감소한 주식의 총수, 9,999,999,999 */
    public String getNowToDcrsStockTotqyRaw() { return nowToDcrsStockTotqyRaw; }
    public BigDecimal getNowToDcrsStockTotqy() { return DataPreprocessor.parseAmount(nowToDcrsStockTotqyRaw); }
    public void setNowToDcrsStockTotqyRaw(String v) { this.nowToDcrsStockTotqyRaw = v; }

    /** 감자 - Ⅲ. 현재까지 감소한 주식의 총수(1. 감자), 9,999,999,999 */
    public String getRedc() { return DataPreprocessor.cleanString(redcRaw); }
    public void setRedcRaw(String v) { this.redcRaw = v; }

    /** 이익소각 - Ⅲ. 현재까지 감소한 주식의 총수(2. 이익소각), 9,999,999,999 */
    public String getProfitIncnr() { return DataPreprocessor.cleanString(profitIncnrRaw); }
    public void setProfitIncnrRaw(String v) { this.profitIncnrRaw = v; }

    /** 상환주식의 상환 - Ⅲ. 현재까지 감소한 주식의 총수(3. 상환주식의 상환), 9,999,999,999 */
    public String getRdmstkRepy() { return DataPreprocessor.cleanString(rdmstkRepyRaw); }
    public void setRdmstkRepyRaw(String v) { this.rdmstkRepyRaw = v; }

    /** 기타 - Ⅲ. 현재까지 감소한 주식의 총수(4. 기타), 9,999,999,999 */
    public String getEtc() { return DataPreprocessor.cleanString(etcRaw); }
    public void setEtcRaw(String v) { this.etcRaw = v; }

    /** 발행주식의 총수 - Ⅳ. 발행주식의 총수 (Ⅱ-Ⅲ), 9,999,999,999 */
    public String getIstcTotqyRaw() { return istcTotqyRaw; }
    public BigDecimal getIstcTotqy() { return DataPreprocessor.parseAmount(istcTotqyRaw); }
    public void setIstcTotqyRaw(String v) { this.istcTotqyRaw = v; }

    /** 자기주식수 - Ⅴ. 자기주식수, 9,999,999,999 */
    public String getTesstkCoRaw() { return tesstkCoRaw; }
    public BigDecimal getTesstkCo() { return DataPreprocessor.parseAmount(tesstkCoRaw); }
    public void setTesstkCoRaw(String v) { this.tesstkCoRaw = v; }

    /** 유통주식수 - Ⅵ. 유통주식수 (Ⅳ-Ⅴ), 9,999,999,999 */
    public String getDistbStockCoRaw() { return distbStockCoRaw; }
    public BigDecimal getDistbStockCo() { return DataPreprocessor.parseAmount(distbStockCoRaw); }
    public void setDistbStockCoRaw(String v) { this.distbStockCoRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
