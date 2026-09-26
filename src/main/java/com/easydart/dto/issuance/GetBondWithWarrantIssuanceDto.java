package com.easydart.dto.issuance;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 신주인수권부사채권 발행결정 응답 DTO */
public class GetBondWithWarrantIssuanceDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("bd_tm")
    private String bdTmRaw;

    @JsonProperty("bd_knd")
    private String bdKndRaw;

    @JsonProperty("bd_fta")
    private String bdFtaRaw;

    @JsonProperty("atcsc_rmislmt")
    private String atcscRmislmtRaw;

    @JsonProperty("ovis_fta")
    private String ovisFtaRaw;

    @JsonProperty("ovis_fta_crn")
    private String ovisFtaCrnRaw;

    @JsonProperty("ovis_ster")
    private String ovisSterRaw;

    @JsonProperty("ovis_isar")
    private String ovisIsarRaw;

    @JsonProperty("ovis_mktnm")
    private String ovisMktnmRaw;

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

    @JsonProperty("bd_intr_ex")
    private String bdIntrExRaw;

    @JsonProperty("bd_intr_sf")
    private String bdIntrSfRaw;

    @JsonProperty("bd_mtd")
    private String bdMtdRaw;

    @JsonProperty("bdis_mthn")
    private String bdisMthnRaw;

    @JsonProperty("ex_rt")
    private String exRtRaw;

    @JsonProperty("ex_prc")
    private String exPrcRaw;

    @JsonProperty("ex_prc_dmth")
    private String exPrcDmthRaw;

    @JsonProperty("bdwt_div_atn")
    private String bdwtDivAtnRaw;

    @JsonProperty("nstk_pym_mth")
    private String nstkPymMthRaw;

    @JsonProperty("nstk_isstk_knd")
    private String nstkIsstkKndRaw;

    @JsonProperty("nstk_isstk_cnt")
    private String nstkIsstkCntRaw;

    @JsonProperty("nstk_isstk_tisstk_vs")
    private String nstkIsstkTisstkVsRaw;

    @JsonProperty("expd_bgd")
    private String expdBgdRaw;

    @JsonProperty("expd_edd")
    private String expdEddRaw;

    @JsonProperty("act_mktprcfl_cvprc_lwtrsprc")
    private String actMktprcflCvprcLwtrsprcRaw;

    @JsonProperty("act_mktprcfl_cvprc_lwtrsprc_bs")
    private String actMktprcflCvprcLwtrsprcBsRaw;

    @JsonProperty("rmislmt_lt70p")
    private String rmislmtLt70PRaw;

    @JsonProperty("abmg")
    private String abmgRaw;

    @JsonProperty("sbd")
    private String sbdRaw;

    @JsonProperty("pymd")
    private String pymdRaw;

    @JsonProperty("rpmcmp")
    private String rpmcmpRaw;

    @JsonProperty("grint")
    private String grintRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("rs_sm_atn")
    private String rsSmAtnRaw;

    @JsonProperty("ex_sm_r")
    private String exSmRRaw;

    @JsonProperty("ovis_ltdtl")
    private String ovisLtdtlRaw;

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

    /** 사채의 종류(회차) */
    public String getBdTm() { return DataPreprocessor.cleanString(bdTmRaw); }
    public void setBdTmRaw(String v) { this.bdTmRaw = v; }

    /** 사채의 종류(종류) */
    public String getBdKnd() { return DataPreprocessor.cleanString(bdKndRaw); }
    public void setBdKndRaw(String v) { this.bdKndRaw = v; }

    /** 사채의 권면(전자등록)총액 (원) - 9999999999 */
    public String getBdFtaRaw() { return bdFtaRaw; }
    public BigDecimal getBdFta() { return DataPreprocessor.parseAmount(bdFtaRaw); }
    public void setBdFtaRaw(String v) { this.bdFtaRaw = v; }

    /** 정관상 잔여 발행한도 (원) - 9,999,999,999 ② 2020년 7월 6일부터 추가됨 */
    public String getAtcscRmislmt() { return DataPreprocessor.cleanString(atcscRmislmtRaw); }
    public void setAtcscRmislmtRaw(String v) { this.atcscRmislmtRaw = v; }

    /** 해외발행(권면(전자등록)총액) - 9999999999 */
    public String getOvisFtaRaw() { return ovisFtaRaw; }
    public BigDecimal getOvisFta() { return DataPreprocessor.parseAmount(ovisFtaRaw); }
    public void setOvisFtaRaw(String v) { this.ovisFtaRaw = v; }

    /** 해외발행(권면(전자등록)총액(통화단위)) */
    public String getOvisFtaCrnRaw() { return ovisFtaCrnRaw; }
    public BigDecimal getOvisFtaCrn() { return DataPreprocessor.parseAmount(ovisFtaCrnRaw); }
    public void setOvisFtaCrnRaw(String v) { this.ovisFtaCrnRaw = v; }

    /** 해외발행(기준환율등) */
    public String getOvisSter() { return DataPreprocessor.cleanString(ovisSterRaw); }
    public void setOvisSterRaw(String v) { this.ovisSterRaw = v; }

    /** 해외발행(발행지역) */
    public String getOvisIsar() { return DataPreprocessor.cleanString(ovisIsarRaw); }
    public void setOvisIsarRaw(String v) { this.ovisIsarRaw = v; }

    /** 해외발행(해외상장시 시장의 명칭) */
    public String getOvisMktnm() { return DataPreprocessor.cleanString(ovisMktnmRaw); }
    public void setOvisMktnmRaw(String v) { this.ovisMktnmRaw = v; }

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

    /** 사채의 이율(표면이자율 (%)) */
    public String getBdIntrEx() { return DataPreprocessor.cleanString(bdIntrExRaw); }
    public void setBdIntrExRaw(String v) { this.bdIntrExRaw = v; }

    /** 사채의 이율(만기이자율 (%)) */
    public String getBdIntrSf() { return DataPreprocessor.cleanString(bdIntrSfRaw); }
    public void setBdIntrSfRaw(String v) { this.bdIntrSfRaw = v; }

    /** 사채만기일 */
    public String getBdMtd() { return DataPreprocessor.cleanString(bdMtdRaw); }
    public void setBdMtdRaw(String v) { this.bdMtdRaw = v; }

    /** 사채발행방법 */
    public String getBdisMthn() { return DataPreprocessor.cleanString(bdisMthnRaw); }
    public void setBdisMthnRaw(String v) { this.bdisMthnRaw = v; }

    /** 신주인수권에 관한 사항(행사비율 (%)) */
    public String getExRtRaw() { return exRtRaw; }
    public BigDecimal getExRt() { return DataPreprocessor.parseAmount(exRtRaw); }
    public void setExRtRaw(String v) { this.exRtRaw = v; }

    /** 신주인수권에 관한 사항(행사가액 (원/주)) - 9999999999 */
    public String getExPrcRaw() { return exPrcRaw; }
    public BigDecimal getExPrc() { return DataPreprocessor.parseAmount(exPrcRaw); }
    public void setExPrcRaw(String v) { this.exPrcRaw = v; }

    /** 신주인수권에 관한 사항(행사가액 결정방법) */
    public String getExPrcDmthRaw() { return exPrcDmthRaw; }
    public BigDecimal getExPrcDmth() { return DataPreprocessor.parseAmount(exPrcDmthRaw); }
    public void setExPrcDmthRaw(String v) { this.exPrcDmthRaw = v; }

    /** 신주인수권에 관한 사항(사채와 인수권의 분리여부) */
    public String getBdwtDivAtn() { return DataPreprocessor.cleanString(bdwtDivAtnRaw); }
    public void setBdwtDivAtnRaw(String v) { this.bdwtDivAtnRaw = v; }

    /** 신주인수권에 관한 사항(신주대금 납입방법) */
    public String getNstkPymMth() { return DataPreprocessor.cleanString(nstkPymMthRaw); }
    public void setNstkPymMthRaw(String v) { this.nstkPymMthRaw = v; }

    /** 신주인수권에 관한 사항(신주인수권 행사에 따라 발행할 주식(종류)) */
    public String getNstkIsstkKnd() { return DataPreprocessor.cleanString(nstkIsstkKndRaw); }
    public void setNstkIsstkKndRaw(String v) { this.nstkIsstkKndRaw = v; }

    /** 신주인수권에 관한 사항(신주인수권 행사에 따라 발행할 주식(주식수)) - 9999999999 */
    public String getNstkIsstkCntRaw() { return nstkIsstkCntRaw; }
    public BigDecimal getNstkIsstkCnt() { return DataPreprocessor.parseAmount(nstkIsstkCntRaw); }
    public void setNstkIsstkCntRaw(String v) { this.nstkIsstkCntRaw = v; }

    /** 신주인수권에 관한 사항(신주인수권 행사에 따라 발행할 주식(주식총수 대비 비율(%))) */
    public String getNstkIsstkTisstkVsRaw() { return nstkIsstkTisstkVsRaw; }
    public BigDecimal getNstkIsstkTisstkVs() { return DataPreprocessor.parseAmount(nstkIsstkTisstkVsRaw); }
    public void setNstkIsstkTisstkVsRaw(String v) { this.nstkIsstkTisstkVsRaw = v; }

    /** 신주인수권에 관한 사항(권리행사기간(시작일)) */
    public String getExpdBgd() { return DataPreprocessor.cleanString(expdBgdRaw); }
    public void setExpdBgdRaw(String v) { this.expdBgdRaw = v; }

    /** 신주인수권에 관한 사항(권리행사기간(종료일)) */
    public String getExpdEdd() { return DataPreprocessor.cleanString(expdEddRaw); }
    public void setExpdEddRaw(String v) { this.expdEddRaw = v; }

    /** 신주인수권에 관한 사항(시가하락에 따른 행사가액 조정(최저 조정가액 (원))) - 9,999,999,999 ② 2020년 7월 6일부터 추가됨 */
    public String getActMktprcflCvprcLwtrsprcRaw() { return actMktprcflCvprcLwtrsprcRaw; }
    public BigDecimal getActMktprcflCvprcLwtrsprc() { return DataPreprocessor.parseAmount(actMktprcflCvprcLwtrsprcRaw); }
    public void setActMktprcflCvprcLwtrsprcRaw(String v) { this.actMktprcflCvprcLwtrsprcRaw = v; }

    /** 신주인수권에 관한 사항(시가하락에 따른 행사가액 조정(최저 조정가액 근거)) - 신주인수권에 관한 사항(시가하락에 따른 행사가액 조정(최저 조정가액 근거)) ② 2020년 7월 6일부터 추 */
    public String getActMktprcflCvprcLwtrsprcBsRaw() { return actMktprcflCvprcLwtrsprcBsRaw; }
    public BigDecimal getActMktprcflCvprcLwtrsprcBs() { return DataPreprocessor.parseAmount(actMktprcflCvprcLwtrsprcBsRaw); }
    public void setActMktprcflCvprcLwtrsprcBsRaw(String v) { this.actMktprcflCvprcLwtrsprcBsRaw = v; }

    /** 신주인수권에 관한 사항(시가하락에 따른 행사가액 조정(발행당시 행사가액의 70% 미만으로 조정가능한 잔여 발행한도 (원))) - 9,999,999,999 ② 2020년 7월 6일부터 추가됨 */
    public String getRmislmtLt70P() { return DataPreprocessor.cleanString(rmislmtLt70PRaw); }
    public void setRmislmtLt70PRaw(String v) { this.rmislmtLt70PRaw = v; }

    /** 합병 관련 사항 */
    public String getAbmg() { return DataPreprocessor.cleanString(abmgRaw); }
    public void setAbmgRaw(String v) { this.abmgRaw = v; }

    /** 청약일 */
    public String getSbd() { return DataPreprocessor.cleanString(sbdRaw); }
    public void setSbdRaw(String v) { this.sbdRaw = v; }

    /** 납입일 */
    public String getPymd() { return DataPreprocessor.cleanString(pymdRaw); }
    public void setPymdRaw(String v) { this.pymdRaw = v; }

    /** 대표주관회사 */
    public String getRpmcmp() { return DataPreprocessor.cleanString(rpmcmpRaw); }
    public void setRpmcmpRaw(String v) { this.rpmcmpRaw = v; }

    /** 보증기관 */
    public String getGrint() { return DataPreprocessor.cleanString(grintRaw); }
    public void setGrintRaw(String v) { this.grintRaw = v; }

    /** 이사회결의일(결정일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사 참석여부(참석 (명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사 참석여부(불참 (명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(감사위원) 참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 증권신고서 제출대상 여부 */
    public String getRsSmAtn() { return DataPreprocessor.cleanString(rsSmAtnRaw); }
    public void setRsSmAtnRaw(String v) { this.rsSmAtnRaw = v; }

    /** 제출을 면제받은 경우 그 사유 */
    public String getExSmR() { return DataPreprocessor.cleanString(exSmRRaw); }
    public void setExSmRRaw(String v) { this.exSmRRaw = v; }

    /** 당해 사채의 해외발행과 연계된 대차거래 내역 */
    public String getOvisLtdtl() { return DataPreprocessor.cleanString(ovisLtdtlRaw); }
    public void setOvisLtdtlRaw(String v) { this.ovisLtdtlRaw = v; }

    /** 공정거래위원회 신고대상 여부 */
    public String getFtcSttAtn() { return DataPreprocessor.cleanString(ftcSttAtnRaw); }
    public void setFtcSttAtnRaw(String v) { this.ftcSttAtnRaw = v; }

}
