package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 유무상증자 결정 응답 DTO */
public class GetMixedCapitalIncreaseDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("piic_nstk_ostk_cnt")
    private String piicNstkOstkCntRaw;

    @JsonProperty("piic_nstk_estk_cnt")
    private String piicNstkEstkCntRaw;

    @JsonProperty("piic_fv_ps")
    private String piicFvPsRaw;

    @JsonProperty("piic_bfic_tisstk_ostk")
    private String piicBficTisstkOstkRaw;

    @JsonProperty("piic_bfic_tisstk_estk")
    private String piicBficTisstkEstkRaw;

    @JsonProperty("piic_fdpp_fclt")
    private String piicFdppFcltRaw;

    @JsonProperty("piic_fdpp_bsninh")
    private String piicFdppBsninhRaw;

    @JsonProperty("piic_fdpp_op")
    private String piicFdppOpRaw;

    @JsonProperty("piic_fdpp_dtrp")
    private String piicFdppDtrpRaw;

    @JsonProperty("piic_fdpp_ocsa")
    private String piicFdppOcsaRaw;

    @JsonProperty("piic_fdpp_etc")
    private String piicFdppEtcRaw;

    @JsonProperty("piic_ic_mthn")
    private String piicIcMthnRaw;

    @JsonProperty("fric_nstk_ostk_cnt")
    private String fricNstkOstkCntRaw;

    @JsonProperty("fric_nstk_estk_cnt")
    private String fricNstkEstkCntRaw;

    @JsonProperty("fric_fv_ps")
    private String fricFvPsRaw;

    @JsonProperty("fric_bfic_tisstk_ostk")
    private String fricBficTisstkOstkRaw;

    @JsonProperty("fric_bfic_tisstk_estk")
    private String fricBficTisstkEstkRaw;

    @JsonProperty("fric_nstk_asstd")
    private String fricNstkAsstdRaw;

    @JsonProperty("fric_nstk_ascnt_ps_ostk")
    private String fricNstkAscntPsOstkRaw;

    @JsonProperty("fric_nstk_ascnt_ps_estk")
    private String fricNstkAscntPsEstkRaw;

    @JsonProperty("fric_nstk_dividrk")
    private String fricNstkDividrkRaw;

    @JsonProperty("fric_nstk_dlprd")
    private String fricNstkDlprdRaw;

    @JsonProperty("fric_nstk_lstprd")
    private String fricNstkLstprdRaw;

    @JsonProperty("fric_bddd")
    private String fricBdddRaw;

    @JsonProperty("fric_od_a_at_t")
    private String fricOdAAtTRaw;

    @JsonProperty("fric_od_a_at_b")
    private String fricOdAAtBRaw;

    @JsonProperty("fric_adt_a_atn")
    private String fricAdtAAtnRaw;

    @JsonProperty("ssl_at")
    private String sslAtRaw;

    @JsonProperty("ssl_bgd")
    private String sslBgdRaw;

    @JsonProperty("ssl_edd")
    private String sslEddRaw;

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

    /** 유상증자(신주의 종류와 수(보통주식 (주))) - 9999999999 */
    public String getPiicNstkOstkCntRaw() { return piicNstkOstkCntRaw; }
    public BigDecimal getPiicNstkOstkCnt() { return DataPreprocessor.parseAmount(piicNstkOstkCntRaw); }
    public void setPiicNstkOstkCntRaw(String v) { this.piicNstkOstkCntRaw = v; }

    /** 유상증자(신주의 종류와 수(기타주식 (주))) - 9999999999 */
    public String getPiicNstkEstkCntRaw() { return piicNstkEstkCntRaw; }
    public BigDecimal getPiicNstkEstkCnt() { return DataPreprocessor.parseAmount(piicNstkEstkCntRaw); }
    public void setPiicNstkEstkCntRaw(String v) { this.piicNstkEstkCntRaw = v; }

    /** 유상증자(1주당 액면가액 (원)) - 9999999999 */
    public String getPiicFvPs() { return DataPreprocessor.cleanString(piicFvPsRaw); }
    public void setPiicFvPsRaw(String v) { this.piicFvPsRaw = v; }

    /** 유상증자(증자전 발행주식총수 (주)(보통주식 (주))) - 9999999999 */
    public String getPiicBficTisstkOstkRaw() { return piicBficTisstkOstkRaw; }
    public BigDecimal getPiicBficTisstkOstk() { return DataPreprocessor.parseAmount(piicBficTisstkOstkRaw); }
    public void setPiicBficTisstkOstkRaw(String v) { this.piicBficTisstkOstkRaw = v; }

    /** 유상증자(증자전 발행주식총수 (주)(기타주식 (주))) - 9999999999 */
    public String getPiicBficTisstkEstkRaw() { return piicBficTisstkEstkRaw; }
    public BigDecimal getPiicBficTisstkEstk() { return DataPreprocessor.parseAmount(piicBficTisstkEstkRaw); }
    public void setPiicBficTisstkEstkRaw(String v) { this.piicBficTisstkEstkRaw = v; }

    /** 유상증자(자금조달의 목적(시설자금 (원))) - 9999999999 */
    public String getPiicFdppFclt() { return DataPreprocessor.cleanString(piicFdppFcltRaw); }
    public void setPiicFdppFcltRaw(String v) { this.piicFdppFcltRaw = v; }

    /** 유상증자(자금조달의 목적(영업양수자금 (원))) - 9,999,999,999 ① 2019년 12월 9일부터 추가됨 */
    public String getPiicFdppBsninh() { return DataPreprocessor.cleanString(piicFdppBsninhRaw); }
    public void setPiicFdppBsninhRaw(String v) { this.piicFdppBsninhRaw = v; }

    /** 유상증자(자금조달의 목적(운영자금 (원))) - 9999999999 */
    public String getPiicFdppOp() { return DataPreprocessor.cleanString(piicFdppOpRaw); }
    public void setPiicFdppOpRaw(String v) { this.piicFdppOpRaw = v; }

    /** 유상증자(자금조달의 목적(채무상환자금 (원))) - 9,999,999,999 ① 2019년 12월 9일부터 추가됨 */
    public String getPiicFdppDtrp() { return DataPreprocessor.cleanString(piicFdppDtrpRaw); }
    public void setPiicFdppDtrpRaw(String v) { this.piicFdppDtrpRaw = v; }

    /** 유상증자(자금조달의 목적(타법인 증권 취득자금 (원))) - 9999999999 */
    public String getPiicFdppOcsa() { return DataPreprocessor.cleanString(piicFdppOcsaRaw); }
    public void setPiicFdppOcsaRaw(String v) { this.piicFdppOcsaRaw = v; }

    /** 유상증자(자금조달의 목적(기타자금 (원))) - 9999999999 */
    public String getPiicFdppEtc() { return DataPreprocessor.cleanString(piicFdppEtcRaw); }
    public void setPiicFdppEtcRaw(String v) { this.piicFdppEtcRaw = v; }

    /** 유상증자(증자방식) */
    public String getPiicIcMthn() { return DataPreprocessor.cleanString(piicIcMthnRaw); }
    public void setPiicIcMthnRaw(String v) { this.piicIcMthnRaw = v; }

    /** 무상증자(신주의 종류와 수(보통주식 (주))) - 9999999999 */
    public String getFricNstkOstkCntRaw() { return fricNstkOstkCntRaw; }
    public BigDecimal getFricNstkOstkCnt() { return DataPreprocessor.parseAmount(fricNstkOstkCntRaw); }
    public void setFricNstkOstkCntRaw(String v) { this.fricNstkOstkCntRaw = v; }

    /** 무상증자(신주의 종류와 수(기타주식 (주))) - 9999999999 */
    public String getFricNstkEstkCntRaw() { return fricNstkEstkCntRaw; }
    public BigDecimal getFricNstkEstkCnt() { return DataPreprocessor.parseAmount(fricNstkEstkCntRaw); }
    public void setFricNstkEstkCntRaw(String v) { this.fricNstkEstkCntRaw = v; }

    /** 무상증자(1주당 액면가액 (원)) - 9999999999 */
    public String getFricFvPs() { return DataPreprocessor.cleanString(fricFvPsRaw); }
    public void setFricFvPsRaw(String v) { this.fricFvPsRaw = v; }

    /** 무상증자(증자전 발행주식총수(보통주식 (주))) - 9999999999 */
    public String getFricBficTisstkOstkRaw() { return fricBficTisstkOstkRaw; }
    public BigDecimal getFricBficTisstkOstk() { return DataPreprocessor.parseAmount(fricBficTisstkOstkRaw); }
    public void setFricBficTisstkOstkRaw(String v) { this.fricBficTisstkOstkRaw = v; }

    /** 무상증자(증자전 발행주식총수(기타주식 (주))) - 9999999999 */
    public String getFricBficTisstkEstkRaw() { return fricBficTisstkEstkRaw; }
    public BigDecimal getFricBficTisstkEstk() { return DataPreprocessor.parseAmount(fricBficTisstkEstkRaw); }
    public void setFricBficTisstkEstkRaw(String v) { this.fricBficTisstkEstkRaw = v; }

    /** 무상증자(신주배정기준일) */
    public String getFricNstkAsstd() { return DataPreprocessor.cleanString(fricNstkAsstdRaw); }
    public void setFricNstkAsstdRaw(String v) { this.fricNstkAsstdRaw = v; }

    /** 무상증자(1주당 신주배정 주식수(보통주식 (주))) - 9,999,999,999.9x (소수점 최대 20자리) */
    public String getFricNstkAscntPsOstkRaw() { return fricNstkAscntPsOstkRaw; }
    public BigDecimal getFricNstkAscntPsOstk() { return DataPreprocessor.parseAmount(fricNstkAscntPsOstkRaw); }
    public void setFricNstkAscntPsOstkRaw(String v) { this.fricNstkAscntPsOstkRaw = v; }

    /** 무상증자(1주당 신주배정 주식수(기타주식 (주))) - 9,999,999,999.9x (소수점 최대 20자리) */
    public String getFricNstkAscntPsEstkRaw() { return fricNstkAscntPsEstkRaw; }
    public BigDecimal getFricNstkAscntPsEstk() { return DataPreprocessor.parseAmount(fricNstkAscntPsEstkRaw); }
    public void setFricNstkAscntPsEstkRaw(String v) { this.fricNstkAscntPsEstkRaw = v; }

    /** 무상증자(신주의 배당기산일) */
    public String getFricNstkDividrk() { return DataPreprocessor.cleanString(fricNstkDividrkRaw); }
    public void setFricNstkDividrkRaw(String v) { this.fricNstkDividrkRaw = v; }

    /** 무상증자(신주권교부예정일) */
    public String getFricNstkDlprd() { return DataPreprocessor.cleanString(fricNstkDlprdRaw); }
    public void setFricNstkDlprdRaw(String v) { this.fricNstkDlprdRaw = v; }

    /** 무상증자(신주의 상장 예정일) */
    public String getFricNstkLstprd() { return DataPreprocessor.cleanString(fricNstkLstprdRaw); }
    public void setFricNstkLstprdRaw(String v) { this.fricNstkLstprdRaw = v; }

    /** 무상증자(이사회결의일(결정일)) */
    public String getFricBdddRaw() { return fricBdddRaw; }
    public String getFricBddd() { return DataPreprocessor.formatDate(fricBdddRaw); }
    public void setFricBdddRaw(String v) { this.fricBdddRaw = v; }

    /** 무상증자(사외이사 참석여부(참석(명))) - 9999999999 */
    public String getFricOdAAtT() { return DataPreprocessor.cleanString(fricOdAAtTRaw); }
    public void setFricOdAAtTRaw(String v) { this.fricOdAAtTRaw = v; }

    /** 무상증자(사외이사 참석여부(불참(명))) - 9999999999 */
    public String getFricOdAAtB() { return DataPreprocessor.cleanString(fricOdAAtBRaw); }
    public void setFricOdAAtBRaw(String v) { this.fricOdAAtBRaw = v; }

    /** 무상증자(감사(감사위원)참석 여부) */
    public String getFricAdtAAtn() { return DataPreprocessor.cleanString(fricAdtAAtnRaw); }
    public void setFricAdtAAtnRaw(String v) { this.fricAdtAAtnRaw = v; }

    /** 공매도 해당여부 */
    public String getSslAt() { return DataPreprocessor.cleanString(sslAtRaw); }
    public void setSslAtRaw(String v) { this.sslAtRaw = v; }

    /** 공매도 시작일 */
    public String getSslBgdRaw() { return sslBgdRaw; }
    public String getSslBgd() { return DataPreprocessor.formatDate(sslBgdRaw); }
    public void setSslBgdRaw(String v) { this.sslBgdRaw = v; }

    /** 공매도 종료일 */
    public String getSslEddRaw() { return sslEddRaw; }
    public String getSslEdd() { return DataPreprocessor.formatDate(sslEddRaw); }
    public void setSslEddRaw(String v) { this.sslEddRaw = v; }

}
