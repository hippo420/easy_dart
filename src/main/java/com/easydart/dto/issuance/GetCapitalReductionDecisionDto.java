package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 감자 결정 응답 DTO */
public class GetCapitalReductionDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("crstk_ostk_cnt")
    private String crstkOstkCntRaw;

    @JsonProperty("crstk_estk_cnt")
    private String crstkEstkCntRaw;

    @JsonProperty("fv_ps")
    private String fvPsRaw;

    @JsonProperty("bfcr_cpt")
    private String bfcrCptRaw;

    @JsonProperty("atcr_cpt")
    private String atcrCptRaw;

    @JsonProperty("bfcr_tisstk_ostk")
    private String bfcrTisstkOstkRaw;

    @JsonProperty("atcr_tisstk_ostk")
    private String atcrTisstkOstkRaw;

    @JsonProperty("bfcr_tisstk_estk")
    private String bfcrTisstkEstkRaw;

    @JsonProperty("atcr_tisstk_estk")
    private String atcrTisstkEstkRaw;

    @JsonProperty("cr_rt_ostk")
    private String crRtOstkRaw;

    @JsonProperty("cr_rt_estk")
    private String crRtEstkRaw;

    @JsonProperty("cr_std")
    private String crStdRaw;

    @JsonProperty("cr_mth")
    private String crMthRaw;

    @JsonProperty("cr_rs")
    private String crRsRaw;

    @JsonProperty("crsc_gmtsck_prd")
    private String crscGmtsckPrdRaw;

    @JsonProperty("crsc_trnmsppd")
    private String crscTrnmsppdRaw;

    @JsonProperty("crsc_osprpd")
    private String crscOsprpdRaw;

    @JsonProperty("crsc_trspprpd")
    private String crscTrspprpdRaw;

    @JsonProperty("crsc_osprpd_bgd")
    private String crscOsprpdBgdRaw;

    @JsonProperty("crsc_osprpd_edd")
    private String crscOsprpdEddRaw;

    @JsonProperty("crsc_trspprpd_bgd")
    private String crscTrspprpdBgdRaw;

    @JsonProperty("crsc_trspprpd_edd")
    private String crscTrspprpdEddRaw;

    @JsonProperty("crsc_nstkdlprd")
    private String crscNstkdlprdRaw;

    @JsonProperty("crsc_nstklstprd")
    private String crscNstklstprdRaw;

    @JsonProperty("cdobprpd_bgd")
    private String cdobprpdBgdRaw;

    @JsonProperty("cdobprpd_edd")
    private String cdobprpdEddRaw;

    @JsonProperty("ospr_nstkdl_pl")
    private String osprNstkdlPlRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("ftc_stt_atn")
    private String ftcSttAtnRaw;

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

    /** 감자주식의 종류와 수(보통주식 (주)) - 9999999999 */
    public String getCrstkOstkCntRaw() { return crstkOstkCntRaw; }
    public BigDecimal getCrstkOstkCnt() { return DataPreprocessor.parseAmount(crstkOstkCntRaw); }
    public void setCrstkOstkCntRaw(String v) { this.crstkOstkCntRaw = v; }

    /** 감자주식의 종류와 수(기타주식 (주)) - 9999999999 */
    public String getCrstkEstkCntRaw() { return crstkEstkCntRaw; }
    public BigDecimal getCrstkEstkCnt() { return DataPreprocessor.parseAmount(crstkEstkCntRaw); }
    public void setCrstkEstkCntRaw(String v) { this.crstkEstkCntRaw = v; }

    /** 1주당 액면가액 (원) - 9999999999 */
    public String getFvPs() { return DataPreprocessor.cleanString(fvPsRaw); }
    public void setFvPsRaw(String v) { this.fvPsRaw = v; }

    /** 감자전후 자본금(감자전 (원)) - 9999999999 */
    public String getBfcrCptRaw() { return bfcrCptRaw; }
    public BigDecimal getBfcrCpt() { return DataPreprocessor.parseAmount(bfcrCptRaw); }
    public void setBfcrCptRaw(String v) { this.bfcrCptRaw = v; }

    /** 감자전후 자본금(감자후 (원)) - 9999999999 */
    public String getAtcrCptRaw() { return atcrCptRaw; }
    public BigDecimal getAtcrCpt() { return DataPreprocessor.parseAmount(atcrCptRaw); }
    public void setAtcrCptRaw(String v) { this.atcrCptRaw = v; }

    /** 감자전후 발행주식수(보통주식 (주)(감자전 (원))) - 9999999999 */
    public String getBfcrTisstkOstkRaw() { return bfcrTisstkOstkRaw; }
    public BigDecimal getBfcrTisstkOstk() { return DataPreprocessor.parseAmount(bfcrTisstkOstkRaw); }
    public void setBfcrTisstkOstkRaw(String v) { this.bfcrTisstkOstkRaw = v; }

    /** 감자전후 발행주식수(보통주식 (주)(감자후 (원))) - 9999999999 */
    public String getAtcrTisstkOstkRaw() { return atcrTisstkOstkRaw; }
    public BigDecimal getAtcrTisstkOstk() { return DataPreprocessor.parseAmount(atcrTisstkOstkRaw); }
    public void setAtcrTisstkOstkRaw(String v) { this.atcrTisstkOstkRaw = v; }

    /** 감자전후 발행주식수(기타주식 (주)(감자전 (원))) - 9999999999 */
    public String getBfcrTisstkEstkRaw() { return bfcrTisstkEstkRaw; }
    public BigDecimal getBfcrTisstkEstk() { return DataPreprocessor.parseAmount(bfcrTisstkEstkRaw); }
    public void setBfcrTisstkEstkRaw(String v) { this.bfcrTisstkEstkRaw = v; }

    /** 감자전후 발행주식수(기타주식 (주)(감자후 (원))) - 9999999999 */
    public String getAtcrTisstkEstkRaw() { return atcrTisstkEstkRaw; }
    public BigDecimal getAtcrTisstkEstk() { return DataPreprocessor.parseAmount(atcrTisstkEstkRaw); }
    public void setAtcrTisstkEstkRaw(String v) { this.atcrTisstkEstkRaw = v; }

    /** 감자비율(보통주식 (%)) */
    public String getCrRtOstkRaw() { return crRtOstkRaw; }
    public BigDecimal getCrRtOstk() { return DataPreprocessor.parseAmount(crRtOstkRaw); }
    public void setCrRtOstkRaw(String v) { this.crRtOstkRaw = v; }

    /** 감자비율(기타주식 (%)) */
    public String getCrRtEstkRaw() { return crRtEstkRaw; }
    public BigDecimal getCrRtEstk() { return DataPreprocessor.parseAmount(crRtEstkRaw); }
    public void setCrRtEstkRaw(String v) { this.crRtEstkRaw = v; }

    /** 감자기준일 */
    public String getCrStd() { return DataPreprocessor.cleanString(crStdRaw); }
    public void setCrStdRaw(String v) { this.crStdRaw = v; }

    /** 감자방법 */
    public String getCrMth() { return DataPreprocessor.cleanString(crMthRaw); }
    public void setCrMthRaw(String v) { this.crMthRaw = v; }

    /** 감자사유 */
    public String getCrRs() { return DataPreprocessor.cleanString(crRsRaw); }
    public void setCrRsRaw(String v) { this.crRsRaw = v; }

    /** 감자일정(주주총회 예정일) */
    public String getCrscGmtsckPrdRaw() { return crscGmtsckPrdRaw; }
    public String getCrscGmtsckPrd() { return DataPreprocessor.formatDate(crscGmtsckPrdRaw); }
    public void setCrscGmtsckPrdRaw(String v) { this.crscGmtsckPrdRaw = v; }

    /** 감자일정(명의개서정지기간) */
    public String getCrscTrnmsppd() { return DataPreprocessor.cleanString(crscTrnmsppdRaw); }
    public void setCrscTrnmsppdRaw(String v) { this.crscTrnmsppdRaw = v; }

    /** 감자일정(구주권 제출기간) - 감자일정(구주권 제출기간) ① 2019년 12월 8일까지 사용됨 */
    public String getCrscOsprpd() { return DataPreprocessor.cleanString(crscOsprpdRaw); }
    public void setCrscOsprpdRaw(String v) { this.crscOsprpdRaw = v; }

    /** 감자일정(매매거래 정지예정기간) - 감자일정(매매거래 정지예정기간) ① 2019년 12월 8일까지 사용됨 */
    public String getCrscTrspprpd() { return DataPreprocessor.cleanString(crscTrspprpdRaw); }
    public void setCrscTrspprpdRaw(String v) { this.crscTrspprpdRaw = v; }

    /** 감자일정(구주권 제출기간(시작일)) - 감자일정(구주권 제출기간(시작일)) ② 2019년 12월 9일부터 추가됨 */
    public String getCrscOsprpdBgd() { return DataPreprocessor.cleanString(crscOsprpdBgdRaw); }
    public void setCrscOsprpdBgdRaw(String v) { this.crscOsprpdBgdRaw = v; }

    /** 감자일정(구주권 제출기간(종료일)) - 감자일정(구주권 제출기간(종료일)) ② 2019년 12월 9일부터 추가됨 */
    public String getCrscOsprpdEdd() { return DataPreprocessor.cleanString(crscOsprpdEddRaw); }
    public void setCrscOsprpdEddRaw(String v) { this.crscOsprpdEddRaw = v; }

    /** 감자일정(매매거래 정지예정기간(시작일)) - 감자일정(매매거래 정지예정기간(시작일)) ② 2019년 12월 9일부터 추가됨 */
    public String getCrscTrspprpdBgd() { return DataPreprocessor.cleanString(crscTrspprpdBgdRaw); }
    public void setCrscTrspprpdBgdRaw(String v) { this.crscTrspprpdBgdRaw = v; }

    /** 감자일정(매매거래 정지예정기간(종료일)) - 감자일정(매매거래 정지예정기간(종료일)) ② 2019년 12월 9일부터 추가됨 */
    public String getCrscTrspprpdEdd() { return DataPreprocessor.cleanString(crscTrspprpdEddRaw); }
    public void setCrscTrspprpdEddRaw(String v) { this.crscTrspprpdEddRaw = v; }

    /** 감자일정(신주권교부예정일) */
    public String getCrscNstkdlprd() { return DataPreprocessor.cleanString(crscNstkdlprdRaw); }
    public void setCrscNstkdlprdRaw(String v) { this.crscNstkdlprdRaw = v; }

    /** 감자일정(신주상장예정일) */
    public String getCrscNstklstprd() { return DataPreprocessor.cleanString(crscNstklstprdRaw); }
    public void setCrscNstklstprdRaw(String v) { this.crscNstklstprdRaw = v; }

    /** 채권자 이의제출기간(시작일) */
    public String getCdobprpdBgd() { return DataPreprocessor.cleanString(cdobprpdBgdRaw); }
    public void setCdobprpdBgdRaw(String v) { this.cdobprpdBgdRaw = v; }

    /** 채권자 이의제출기간(종료일) */
    public String getCdobprpdEdd() { return DataPreprocessor.cleanString(cdobprpdEddRaw); }
    public void setCdobprpdEddRaw(String v) { this.cdobprpdEddRaw = v; }

    /** 구주권제출 및 신주권교부장소 */
    public String getOsprNstkdlPl() { return DataPreprocessor.cleanString(osprNstkdlPlRaw); }
    public void setOsprNstkdlPlRaw(String v) { this.osprNstkdlPlRaw = v; }

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

    /** 감사(감사위원) 참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 공정거래위원회 신고대상 여부 */
    public String getFtcSttAtn() { return DataPreprocessor.cleanString(ftcSttAtnRaw); }
    public void setFtcSttAtnRaw(String v) { this.ftcSttAtnRaw = v; }

}
