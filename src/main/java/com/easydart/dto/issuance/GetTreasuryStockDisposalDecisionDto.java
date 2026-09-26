package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 자기주식 처분 결정 응답 DTO */
public class GetTreasuryStockDisposalDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("dppln_stk_ostk")
    private String dpplnStkOstkRaw;

    @JsonProperty("dppln_stk_estk")
    private String dpplnStkEstkRaw;

    @JsonProperty("dpstk_prc_ostk")
    private String dpstkPrcOstkRaw;

    @JsonProperty("dpstk_prc_estk")
    private String dpstkPrcEstkRaw;

    @JsonProperty("dppln_prc_ostk")
    private String dpplnPrcOstkRaw;

    @JsonProperty("dppln_prc_estk")
    private String dpplnPrcEstkRaw;

    @JsonProperty("dpprpd_bgd")
    private String dpprpdBgdRaw;

    @JsonProperty("dpprpd_edd")
    private String dpprpdEddRaw;

    @JsonProperty("dp_pp")
    private String dpPpRaw;

    @JsonProperty("dp_m_mkt")
    private String dpMMktRaw;

    @JsonProperty("dp_m_ovtm")
    private String dpMOvtmRaw;

    @JsonProperty("dp_m_otc")
    private String dpMOtcRaw;

    @JsonProperty("dp_m_etc")
    private String dpMEtcRaw;

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

    @JsonProperty("dp_dd")
    private String dpDdRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("d1_slodlm_ostk")
    private String d1SlodlmOstkRaw;

    @JsonProperty("d1_slodlm_estk")
    private String d1SlodlmEstkRaw;

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

    /** 처분예정주식(주)(보통주식) - 9999999999 */
    public String getDpplnStkOstk() { return DataPreprocessor.cleanString(dpplnStkOstkRaw); }
    public void setDpplnStkOstkRaw(String v) { this.dpplnStkOstkRaw = v; }

    /** 처분예정주식(주)(기타주식) - 9999999999 */
    public String getDpplnStkEstk() { return DataPreprocessor.cleanString(dpplnStkEstkRaw); }
    public void setDpplnStkEstkRaw(String v) { this.dpplnStkEstkRaw = v; }

    /** 처분 대상 주식가격(원)(보통주식) - 9999999999 */
    public String getDpstkPrcOstkRaw() { return dpstkPrcOstkRaw; }
    public BigDecimal getDpstkPrcOstk() { return DataPreprocessor.parseAmount(dpstkPrcOstkRaw); }
    public void setDpstkPrcOstkRaw(String v) { this.dpstkPrcOstkRaw = v; }

    /** 처분 대상 주식가격(원)(기타주식) - 9999999999 */
    public String getDpstkPrcEstkRaw() { return dpstkPrcEstkRaw; }
    public BigDecimal getDpstkPrcEstk() { return DataPreprocessor.parseAmount(dpstkPrcEstkRaw); }
    public void setDpstkPrcEstkRaw(String v) { this.dpstkPrcEstkRaw = v; }

    /** 처분예정금액(원)(보통주식) - 9999999999 */
    public String getDpplnPrcOstkRaw() { return dpplnPrcOstkRaw; }
    public BigDecimal getDpplnPrcOstk() { return DataPreprocessor.parseAmount(dpplnPrcOstkRaw); }
    public void setDpplnPrcOstkRaw(String v) { this.dpplnPrcOstkRaw = v; }

    /** 처분예정금액(원)(기타주식) - 9999999999 */
    public String getDpplnPrcEstkRaw() { return dpplnPrcEstkRaw; }
    public BigDecimal getDpplnPrcEstk() { return DataPreprocessor.parseAmount(dpplnPrcEstkRaw); }
    public void setDpplnPrcEstkRaw(String v) { this.dpplnPrcEstkRaw = v; }

    /** 처분예정기간(시작일) */
    public String getDpprpdBgd() { return DataPreprocessor.cleanString(dpprpdBgdRaw); }
    public void setDpprpdBgdRaw(String v) { this.dpprpdBgdRaw = v; }

    /** 처분예정기간(종료일) */
    public String getDpprpdEdd() { return DataPreprocessor.cleanString(dpprpdEddRaw); }
    public void setDpprpdEddRaw(String v) { this.dpprpdEddRaw = v; }

    /** 처분목적 */
    public String getDpPp() { return DataPreprocessor.cleanString(dpPpRaw); }
    public void setDpPpRaw(String v) { this.dpPpRaw = v; }

    /** 처분방법(시장을 통한 매도(주)) - 9999999999 */
    public String getDpMMkt() { return DataPreprocessor.cleanString(dpMMktRaw); }
    public void setDpMMktRaw(String v) { this.dpMMktRaw = v; }

    /** 처분방법(시간외대량매매(주)) - 9999999999 */
    public String getDpMOvtm() { return DataPreprocessor.cleanString(dpMOvtmRaw); }
    public void setDpMOvtmRaw(String v) { this.dpMOvtmRaw = v; }

    /** 처분방법(장외처분(주)) - 9999999999 */
    public String getDpMOtc() { return DataPreprocessor.cleanString(dpMOtcRaw); }
    public void setDpMOtcRaw(String v) { this.dpMOtcRaw = v; }

    /** 처분방법(기타(주)) - 9999999999 */
    public String getDpMEtc() { return DataPreprocessor.cleanString(dpMEtcRaw); }
    public void setDpMEtcRaw(String v) { this.dpMEtcRaw = v; }

    /** 위탁투자중개업자 */
    public String getCsIvBk() { return DataPreprocessor.cleanString(csIvBkRaw); }
    public void setCsIvBkRaw(String v) { this.csIvBkRaw = v; }

    /** 처분 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(보통주식)) - 9999999999 */
    public String getAqWtnDivOstk() { return DataPreprocessor.cleanString(aqWtnDivOstkRaw); }
    public void setAqWtnDivOstkRaw(String v) { this.aqWtnDivOstkRaw = v; }

    /** 처분 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivOstkRtRaw() { return aqWtnDivOstkRtRaw; }
    public BigDecimal getAqWtnDivOstkRt() { return DataPreprocessor.parseAmount(aqWtnDivOstkRtRaw); }
    public void setAqWtnDivOstkRtRaw(String v) { this.aqWtnDivOstkRtRaw = v; }

    /** 처분 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(기타주식)) - 9999999999 */
    public String getAqWtnDivEstk() { return DataPreprocessor.cleanString(aqWtnDivEstkRaw); }
    public void setAqWtnDivEstkRaw(String v) { this.aqWtnDivEstkRaw = v; }

    /** 처분 전 자기주식 보유현황(배당가능이익 범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivEstkRtRaw() { return aqWtnDivEstkRtRaw; }
    public BigDecimal getAqWtnDivEstkRt() { return DataPreprocessor.parseAmount(aqWtnDivEstkRtRaw); }
    public void setAqWtnDivEstkRtRaw(String v) { this.aqWtnDivEstkRtRaw = v; }

    /** 처분 전 자기주식 보유현황(기타취득(주)(보통주식)) - 9999999999 */
    public String getEaqOstk() { return DataPreprocessor.cleanString(eaqOstkRaw); }
    public void setEaqOstkRaw(String v) { this.eaqOstkRaw = v; }

    /** 처분 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqOstkRtRaw() { return eaqOstkRtRaw; }
    public BigDecimal getEaqOstkRt() { return DataPreprocessor.parseAmount(eaqOstkRtRaw); }
    public void setEaqOstkRtRaw(String v) { this.eaqOstkRtRaw = v; }

    /** 처분 전 자기주식 보유현황(기타취득(주)(기타주식)) - 9999999999 */
    public String getEaqEstk() { return DataPreprocessor.cleanString(eaqEstkRaw); }
    public void setEaqEstkRaw(String v) { this.eaqEstkRaw = v; }

    /** 처분 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqEstkRtRaw() { return eaqEstkRtRaw; }
    public BigDecimal getEaqEstkRt() { return DataPreprocessor.parseAmount(eaqEstkRtRaw); }
    public void setEaqEstkRtRaw(String v) { this.eaqEstkRtRaw = v; }

    /** 처분결정일 */
    public String getDpDdRaw() { return dpDdRaw; }
    public String getDpDd() { return DataPreprocessor.formatDate(dpDdRaw); }
    public void setDpDdRaw(String v) { this.dpDdRaw = v; }

    /** 사외이사참석여부(참석(명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사참석여부(불참(명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(사외이사가 아닌 감사위원)참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 1일 매도 주문수량 한도(보통주식) - 9999999999 */
    public String getD1SlodlmOstkRaw() { return d1SlodlmOstkRaw; }
    public BigDecimal getD1SlodlmOstk() { return DataPreprocessor.parseAmount(d1SlodlmOstkRaw); }
    public void setD1SlodlmOstkRaw(String v) { this.d1SlodlmOstkRaw = v; }

    /** 1일 매도 주문수량 한도(기타주식) - 9999999999 */
    public String getD1SlodlmEstkRaw() { return d1SlodlmEstkRaw; }
    public BigDecimal getD1SlodlmEstk() { return DataPreprocessor.parseAmount(d1SlodlmEstkRaw); }
    public void setD1SlodlmEstkRaw(String v) { this.d1SlodlmEstkRaw = v; }

}
