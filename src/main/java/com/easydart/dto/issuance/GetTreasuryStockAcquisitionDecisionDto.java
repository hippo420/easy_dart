package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 자기주식 취득 결정 응답 DTO */
public class GetTreasuryStockAcquisitionDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("aqpln_stk_ostk")
    private String aqplnStkOstkRaw;

    @JsonProperty("aqpln_stk_estk")
    private String aqplnStkEstkRaw;

    @JsonProperty("aqpln_prc_ostk")
    private String aqplnPrcOstkRaw;

    @JsonProperty("aqpln_prc_estk")
    private String aqplnPrcEstkRaw;

    @JsonProperty("aqexpd_bgd")
    private String aqexpdBgdRaw;

    @JsonProperty("aqexpd_edd")
    private String aqexpdEddRaw;

    @JsonProperty("hdexpd_bgd")
    private String hdexpdBgdRaw;

    @JsonProperty("hdexpd_edd")
    private String hdexpdEddRaw;

    @JsonProperty("aq_pp")
    private String aqPpRaw;

    @JsonProperty("aq_mth")
    private String aqMthRaw;

    @JsonProperty("cs_iv_bk")
    private String csIvBkRaw;

    @JsonProperty("aq_wtn_div_ostk")
    private String aqWtnDivOstkRaw;

    @JsonProperty("aq_wtn_div_ostk_rt")
    private String aqWtnDivOstkRtRaw;

    @JsonProperty("aq_wtn_div_estk")
    private String aqWtnDivEstkRaw;

    @JsonProperty("aq_wtn_div_estk_rt")
    private String aqWtnDivEstkRtRaw;

    @JsonProperty("eaq_ostk")
    private String eaqOstkRaw;

    @JsonProperty("eaq_ostk_rt")
    private String eaqOstkRtRaw;

    @JsonProperty("eaq_estk")
    private String eaqEstkRaw;

    @JsonProperty("eaq_estk_rt")
    private String eaqEstkRtRaw;

    @JsonProperty("aq_dd")
    private String aqDdRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("d1_prodlm_ostk")
    private String d1ProdlmOstkRaw;

    @JsonProperty("d1_prodlm_estk")
    private String d1ProdlmEstkRaw;

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

    /** 취득예정주식(주)(보통주식) - 9999999999 */
    public String getAqplnStkOstk() { return DataPreprocessor.cleanString(aqplnStkOstkRaw); }
    public void setAqplnStkOstkRaw(String v) { this.aqplnStkOstkRaw = v; }

    /** 취득예정주식(주)(기타주식) - 9999999999 */
    public String getAqplnStkEstk() { return DataPreprocessor.cleanString(aqplnStkEstkRaw); }
    public void setAqplnStkEstkRaw(String v) { this.aqplnStkEstkRaw = v; }

    /** 취득예정금액(원)(보통주식) - 9999999999 */
    public String getAqplnPrcOstkRaw() { return aqplnPrcOstkRaw; }
    public BigDecimal getAqplnPrcOstk() { return DataPreprocessor.parseAmount(aqplnPrcOstkRaw); }
    public void setAqplnPrcOstkRaw(String v) { this.aqplnPrcOstkRaw = v; }

    /** 취득예정금액(원)(기타주식) - 9999999999 */
    public String getAqplnPrcEstkRaw() { return aqplnPrcEstkRaw; }
    public BigDecimal getAqplnPrcEstk() { return DataPreprocessor.parseAmount(aqplnPrcEstkRaw); }
    public void setAqplnPrcEstkRaw(String v) { this.aqplnPrcEstkRaw = v; }

    /** 취득예상기간(시작일) */
    public String getAqexpdBgdRaw() { return aqexpdBgdRaw; }
    public String getAqexpdBgd() { return DataPreprocessor.formatDate(aqexpdBgdRaw); }
    public void setAqexpdBgdRaw(String v) { this.aqexpdBgdRaw = v; }

    /** 취득예상기간(종료일) */
    public String getAqexpdEddRaw() { return aqexpdEddRaw; }
    public String getAqexpdEdd() { return DataPreprocessor.formatDate(aqexpdEddRaw); }
    public void setAqexpdEddRaw(String v) { this.aqexpdEddRaw = v; }

    /** 보유예상기간(시작일) */
    public String getHdexpdBgdRaw() { return hdexpdBgdRaw; }
    public String getHdexpdBgd() { return DataPreprocessor.formatDate(hdexpdBgdRaw); }
    public void setHdexpdBgdRaw(String v) { this.hdexpdBgdRaw = v; }

    /** 보유예상기간(종료일) */
    public String getHdexpdEddRaw() { return hdexpdEddRaw; }
    public String getHdexpdEdd() { return DataPreprocessor.formatDate(hdexpdEddRaw); }
    public void setHdexpdEddRaw(String v) { this.hdexpdEddRaw = v; }

    /** 취득목적 */
    public String getAqPp() { return DataPreprocessor.cleanString(aqPpRaw); }
    public void setAqPpRaw(String v) { this.aqPpRaw = v; }

    /** 취득방법 */
    public String getAqMth() { return DataPreprocessor.cleanString(aqMthRaw); }
    public void setAqMthRaw(String v) { this.aqMthRaw = v; }

    /** 위탁투자중개업자 */
    public String getCsIvBk() { return DataPreprocessor.cleanString(csIvBkRaw); }
    public void setCsIvBkRaw(String v) { this.csIvBkRaw = v; }

    /** 취득 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(보통주식)) - 9999999999 */
    public String getAqWtnDivOstk() { return DataPreprocessor.cleanString(aqWtnDivOstkRaw); }
    public void setAqWtnDivOstkRaw(String v) { this.aqWtnDivOstkRaw = v; }

    /** 취득 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivOstkRtRaw() { return aqWtnDivOstkRtRaw; }
    public BigDecimal getAqWtnDivOstkRt() { return DataPreprocessor.parseAmount(aqWtnDivOstkRtRaw); }
    public void setAqWtnDivOstkRtRaw(String v) { this.aqWtnDivOstkRtRaw = v; }

    /** 취득 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(기타주식)) - 9999999999 */
    public String getAqWtnDivEstk() { return DataPreprocessor.cleanString(aqWtnDivEstkRaw); }
    public void setAqWtnDivEstkRaw(String v) { this.aqWtnDivEstkRaw = v; }

    /** 취득 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivEstkRtRaw() { return aqWtnDivEstkRtRaw; }
    public BigDecimal getAqWtnDivEstkRt() { return DataPreprocessor.parseAmount(aqWtnDivEstkRtRaw); }
    public void setAqWtnDivEstkRtRaw(String v) { this.aqWtnDivEstkRtRaw = v; }

    /** 취득 전 자기주식 보유현황(기타취득(주)(보통주식)) - 9999999999 */
    public String getEaqOstk() { return DataPreprocessor.cleanString(eaqOstkRaw); }
    public void setEaqOstkRaw(String v) { this.eaqOstkRaw = v; }

    /** 취득 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqOstkRtRaw() { return eaqOstkRtRaw; }
    public BigDecimal getEaqOstkRt() { return DataPreprocessor.parseAmount(eaqOstkRtRaw); }
    public void setEaqOstkRtRaw(String v) { this.eaqOstkRtRaw = v; }

    /** 취득 전 자기주식 보유현황(기타취득(주)(기타주식)) - 9999999999 */
    public String getEaqEstk() { return DataPreprocessor.cleanString(eaqEstkRaw); }
    public void setEaqEstkRaw(String v) { this.eaqEstkRaw = v; }

    /** 취득 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqEstkRtRaw() { return eaqEstkRtRaw; }
    public BigDecimal getEaqEstkRt() { return DataPreprocessor.parseAmount(eaqEstkRtRaw); }
    public void setEaqEstkRtRaw(String v) { this.eaqEstkRtRaw = v; }

    /** 취득결정일 */
    public String getAqDdRaw() { return aqDdRaw; }
    public String getAqDd() { return DataPreprocessor.formatDate(aqDdRaw); }
    public void setAqDdRaw(String v) { this.aqDdRaw = v; }

    /** 사외이사참석여부(참석(명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사참석여부(불참(명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(사외이사가 아닌 감사위원)참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 1일 매수 주문수량 한도(보통주식) - 9999999999 */
    public String getD1ProdlmOstk() { return DataPreprocessor.cleanString(d1ProdlmOstkRaw); }
    public void setD1ProdlmOstkRaw(String v) { this.d1ProdlmOstkRaw = v; }

    /** 1일 매수 주문수량 한도(기타주식) - 9999999999 */
    public String getD1ProdlmEstk() { return DataPreprocessor.cleanString(d1ProdlmEstkRaw); }
    public void setD1ProdlmEstkRaw(String v) { this.d1ProdlmEstkRaw = v; }

}
