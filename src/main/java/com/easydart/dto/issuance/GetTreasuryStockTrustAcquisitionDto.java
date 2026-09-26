package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 자기주식취득 신탁계약 체결 결정 응답 DTO */
public class GetTreasuryStockTrustAcquisitionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("ctr_prc")
    private String ctrPrcRaw;

    @JsonProperty("ctr_pd_bgd")
    private String ctrPdBgdRaw;

    @JsonProperty("ctr_pd_edd")
    private String ctrPdEddRaw;

    @JsonProperty("ctr_pp")
    private String ctrPpRaw;

    @JsonProperty("ctr_cns_int")
    private String ctrCnsIntRaw;

    @JsonProperty("ctr_cns_prd")
    private String ctrCnsPrdRaw;

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

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("cs_iv_bk")
    private String csIvBkRaw;

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

    /** 계약금액(원) - 9999999999 */
    public String getCtrPrcRaw() { return ctrPrcRaw; }
    public BigDecimal getCtrPrc() { return DataPreprocessor.parseAmount(ctrPrcRaw); }
    public void setCtrPrcRaw(String v) { this.ctrPrcRaw = v; }

    /** 계약기간(시작일) */
    public String getCtrPdBgdRaw() { return ctrPdBgdRaw; }
    public String getCtrPdBgd() { return DataPreprocessor.formatDate(ctrPdBgdRaw); }
    public void setCtrPdBgdRaw(String v) { this.ctrPdBgdRaw = v; }

    /** 계약기간(종료일) */
    public String getCtrPdEddRaw() { return ctrPdEddRaw; }
    public String getCtrPdEdd() { return DataPreprocessor.formatDate(ctrPdEddRaw); }
    public void setCtrPdEddRaw(String v) { this.ctrPdEddRaw = v; }

    /** 계약목적 */
    public String getCtrPp() { return DataPreprocessor.cleanString(ctrPpRaw); }
    public void setCtrPpRaw(String v) { this.ctrPpRaw = v; }

    /** 계약체결기관 */
    public String getCtrCnsInt() { return DataPreprocessor.cleanString(ctrCnsIntRaw); }
    public void setCtrCnsIntRaw(String v) { this.ctrCnsIntRaw = v; }

    /** 계약체결 예정일자 */
    public String getCtrCnsPrdRaw() { return ctrCnsPrdRaw; }
    public String getCtrCnsPrd() { return DataPreprocessor.formatDate(ctrCnsPrdRaw); }
    public void setCtrCnsPrdRaw(String v) { this.ctrCnsPrdRaw = v; }

    /** 계약 전 자기주식 보유현황(배당가능범위 내 취득(주)(보통주식)) - 9999999999 */
    public String getAqWtnDivOstk() { return DataPreprocessor.cleanString(aqWtnDivOstkRaw); }
    public void setAqWtnDivOstkRaw(String v) { this.aqWtnDivOstkRaw = v; }

    /** 계약 전 자기주식 보유현황(배당가능범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivOstkRtRaw() { return aqWtnDivOstkRtRaw; }
    public BigDecimal getAqWtnDivOstkRt() { return DataPreprocessor.parseAmount(aqWtnDivOstkRtRaw); }
    public void setAqWtnDivOstkRtRaw(String v) { this.aqWtnDivOstkRtRaw = v; }

    /** 계약 전 자기주식 보유현황(배당가능범위 내 취득(주)(기타주식)) - 9999999999 */
    public String getAqWtnDivEstk() { return DataPreprocessor.cleanString(aqWtnDivEstkRaw); }
    public void setAqWtnDivEstkRaw(String v) { this.aqWtnDivEstkRaw = v; }

    /** 계약 전 자기주식 보유현황(배당가능범위 내 취득(주)(비율(%))) */
    public String getAqWtnDivEstkRtRaw() { return aqWtnDivEstkRtRaw; }
    public BigDecimal getAqWtnDivEstkRt() { return DataPreprocessor.parseAmount(aqWtnDivEstkRtRaw); }
    public void setAqWtnDivEstkRtRaw(String v) { this.aqWtnDivEstkRtRaw = v; }

    /** 계약 전 자기주식 보유현황(기타취득(주)(보통주식)) - 9999999999 */
    public String getEaqOstk() { return DataPreprocessor.cleanString(eaqOstkRaw); }
    public void setEaqOstkRaw(String v) { this.eaqOstkRaw = v; }

    /** 계약 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqOstkRtRaw() { return eaqOstkRtRaw; }
    public BigDecimal getEaqOstkRt() { return DataPreprocessor.parseAmount(eaqOstkRtRaw); }
    public void setEaqOstkRtRaw(String v) { this.eaqOstkRtRaw = v; }

    /** 계약 전 자기주식 보유현황(기타취득(주)(기타주식)) - 9999999999 */
    public String getEaqEstk() { return DataPreprocessor.cleanString(eaqEstkRaw); }
    public void setEaqEstkRaw(String v) { this.eaqEstkRaw = v; }

    /** 계약 전 자기주식 보유현황(기타취득(주)(비율(%))) */
    public String getEaqEstkRtRaw() { return eaqEstkRtRaw; }
    public BigDecimal getEaqEstkRt() { return DataPreprocessor.parseAmount(eaqEstkRtRaw); }
    public void setEaqEstkRtRaw(String v) { this.eaqEstkRtRaw = v; }

    /** 이사회결의일(결정일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사참석여부(참석(명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사참석여부(불참(명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(사외이사가 아닌 감사위원)참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 위탁투자중개업자 */
    public String getCsIvBk() { return DataPreprocessor.cleanString(csIvBkRaw); }
    public void setCsIvBkRaw(String v) { this.csIvBkRaw = v; }

}
