package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 유상증자 결정 응답 DTO */
public class GetPaidCapitalIncreaseDecisionDto {

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

    @JsonProperty("fdpp_fclt")
    private String fdppFcltRaw;

    @JsonProperty("fdpp_bsninh")
    private String fdppBsninhRaw;

    @JsonProperty("fdpp_op")
    private String fdppOpRaw;

    @JsonProperty("fdpp_dtrp")
    private String fdppDtrpRaw;

    @JsonProperty("fdpp_ocsa")
    private String fdppOcsaRaw;

    @JsonProperty("fdpp_etc")
    private String fdppEtcRaw;

    @JsonProperty("ic_mthn")
    private String icMthnRaw;

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

    /** 자금조달의 목적(시설자금 (원)) - 9999999999 */
    public String getFdppFclt() { return DataPreprocessor.cleanString(fdppFcltRaw); }
    public void setFdppFcltRaw(String v) { this.fdppFcltRaw = v; }

    /** 자금조달의 목적(영업양수자금 (원)) - 9,999,999,999 ① 2019년 12월 9일부터 추가됨 */
    public String getFdppBsninh() { return DataPreprocessor.cleanString(fdppBsninhRaw); }
    public void setFdppBsninhRaw(String v) { this.fdppBsninhRaw = v; }

    /** 자금조달의 목적(운영자금 (원)) - 9999999999 */
    public String getFdppOp() { return DataPreprocessor.cleanString(fdppOpRaw); }
    public void setFdppOpRaw(String v) { this.fdppOpRaw = v; }

    /** 자금조달의 목적(채무상환자금 (원)) - 9,999,999,999 ① 2019년 12월 9일부터 추가됨 */
    public String getFdppDtrp() { return DataPreprocessor.cleanString(fdppDtrpRaw); }
    public void setFdppDtrpRaw(String v) { this.fdppDtrpRaw = v; }

    /** 자금조달의 목적(타법인 증권 취득자금 (원)) - 9999999999 */
    public String getFdppOcsa() { return DataPreprocessor.cleanString(fdppOcsaRaw); }
    public void setFdppOcsaRaw(String v) { this.fdppOcsaRaw = v; }

    /** 자금조달의 목적(기타자금 (원)) - 9999999999 */
    public String getFdppEtc() { return DataPreprocessor.cleanString(fdppEtcRaw); }
    public void setFdppEtcRaw(String v) { this.fdppEtcRaw = v; }

    /** 증자방식 */
    public String getIcMthn() { return DataPreprocessor.cleanString(icMthnRaw); }
    public void setIcMthnRaw(String v) { this.icMthnRaw = v; }

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
