package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 무상증자 결정 응답 DTO */
public class GetFreeCapitalIncreaseDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("nstk_ostk_cnt")
    private String nstkOstkCntRaw;

    @JsonProperty("nstk_estk_cnt")
    private String nstkEstkCntRaw;

    @JsonProperty("fv_ps")
    private String fvPsRaw;

    @JsonProperty("bfic_tisstk_ostk")
    private String bficTisstkOstkRaw;

    @JsonProperty("bfic_tisstk_estk")
    private String bficTisstkEstkRaw;

    @JsonProperty("nstk_asstd")
    private String nstkAsstdRaw;

    @JsonProperty("nstk_ascnt_ps_ostk")
    private String nstkAscntPsOstkRaw;

    @JsonProperty("nstk_ascnt_ps_estk")
    private String nstkAscntPsEstkRaw;

    @JsonProperty("nstk_dividrk")
    private String nstkDividrkRaw;

    @JsonProperty("nstk_dlprd")
    private String nstkDlprdRaw;

    @JsonProperty("nstk_lstprd")
    private String nstkLstprdRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

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

    /** 신주의 종류와 수(보통주식 (주)) - 9999999999 */
    public String getNstkOstkCntRaw() { return nstkOstkCntRaw; }
    public BigDecimal getNstkOstkCnt() { return DataPreprocessor.parseAmount(nstkOstkCntRaw); }
    public void setNstkOstkCntRaw(String v) { this.nstkOstkCntRaw = v; }

    /** 신주의 종류와 수(기타주식 (주)) - 9999999999 */
    public String getNstkEstkCntRaw() { return nstkEstkCntRaw; }
    public BigDecimal getNstkEstkCnt() { return DataPreprocessor.parseAmount(nstkEstkCntRaw); }
    public void setNstkEstkCntRaw(String v) { this.nstkEstkCntRaw = v; }

    /** 1주당 액면가액 (원) - 9999999999 */
    public String getFvPs() { return DataPreprocessor.cleanString(fvPsRaw); }
    public void setFvPsRaw(String v) { this.fvPsRaw = v; }

    /** 증자전 발행주식총수 (주)(보통주식 (주)) - 9999999999 */
    public String getBficTisstkOstkRaw() { return bficTisstkOstkRaw; }
    public BigDecimal getBficTisstkOstk() { return DataPreprocessor.parseAmount(bficTisstkOstkRaw); }
    public void setBficTisstkOstkRaw(String v) { this.bficTisstkOstkRaw = v; }

    /** 증자전 발행주식총수 (주)(기타주식 (주)) - 9999999999 */
    public String getBficTisstkEstkRaw() { return bficTisstkEstkRaw; }
    public BigDecimal getBficTisstkEstk() { return DataPreprocessor.parseAmount(bficTisstkEstkRaw); }
    public void setBficTisstkEstkRaw(String v) { this.bficTisstkEstkRaw = v; }

    /** 신주배정기준일 */
    public String getNstkAsstd() { return DataPreprocessor.cleanString(nstkAsstdRaw); }
    public void setNstkAsstdRaw(String v) { this.nstkAsstdRaw = v; }

    /** 1주당 신주배정 주식수(보통주식 (주)) - 9,999,999,999.9x (소수점 최대 20자리) */
    public String getNstkAscntPsOstkRaw() { return nstkAscntPsOstkRaw; }
    public BigDecimal getNstkAscntPsOstk() { return DataPreprocessor.parseAmount(nstkAscntPsOstkRaw); }
    public void setNstkAscntPsOstkRaw(String v) { this.nstkAscntPsOstkRaw = v; }

    /** 1주당 신주배정 주식수(기타주식 (주)) - 9,999,999,999.9x (소수점 최대 20자리) */
    public String getNstkAscntPsEstkRaw() { return nstkAscntPsEstkRaw; }
    public BigDecimal getNstkAscntPsEstk() { return DataPreprocessor.parseAmount(nstkAscntPsEstkRaw); }
    public void setNstkAscntPsEstkRaw(String v) { this.nstkAscntPsEstkRaw = v; }

    /** 신주의 배당기산일 */
    public String getNstkDividrk() { return DataPreprocessor.cleanString(nstkDividrkRaw); }
    public void setNstkDividrkRaw(String v) { this.nstkDividrkRaw = v; }

    /** 신주권교부예정일 */
    public String getNstkDlprd() { return DataPreprocessor.cleanString(nstkDlprdRaw); }
    public void setNstkDlprdRaw(String v) { this.nstkDlprdRaw = v; }

    /** 신주의 상장 예정일 */
    public String getNstkLstprd() { return DataPreprocessor.cleanString(nstkLstprdRaw); }
    public void setNstkLstprdRaw(String v) { this.nstkLstprdRaw = v; }

    /** 이사회결의일(결정일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사 참석여부(참석(명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사 참석여부(불참(명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(감사위원)참석 여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

}
