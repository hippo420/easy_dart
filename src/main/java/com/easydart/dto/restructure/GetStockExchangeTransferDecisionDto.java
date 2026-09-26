package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 주식교환·이전 결정 응답 DTO */
public class GetStockExchangeTransferDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("extr_sen")
    private String extrSenRaw;

    @JsonProperty("extr_stn")
    private String extrStnRaw;

    @JsonProperty("extr_tgcmp_cmpnm")
    private String extrTgcmpCmpnmRaw;

    @JsonProperty("extr_tgcmp_rp")
    private String extrTgcmpRpRaw;

    @JsonProperty("extr_tgcmp_mbsn")
    private String extrTgcmpMbsnRaw;

    @JsonProperty("extr_tgcmp_rl_cmpn")
    private String extrTgcmpRlCmpnRaw;

    @JsonProperty("extr_tgcmp_tisstk_ostk")
    private String extrTgcmpTisstkOstkRaw;

    @JsonProperty("extr_tgcmp_tisstk_cstk")
    private String extrTgcmpTisstkCstkRaw;

    @JsonProperty("rbsnfdtl_tast")
    private String rbsnfdtlTastRaw;

    @JsonProperty("rbsnfdtl_tdbt")
    private String rbsnfdtlTdbtRaw;

    @JsonProperty("rbsnfdtl_teqt")
    private String rbsnfdtlTeqtRaw;

    @JsonProperty("rbsnfdtl_cpt")
    private String rbsnfdtlCptRaw;

    @JsonProperty("extr_rt")
    private String extrRtRaw;

    @JsonProperty("extr_rt_bs")
    private String extrRtBsRaw;

    @JsonProperty("exevl_atn")
    private String exevlAtnRaw;

    @JsonProperty("exevl_bs_rs")
    private String exevlBsRsRaw;

    @JsonProperty("exevl_intn")
    private String exevlIntnRaw;

    @JsonProperty("exevl_pd")
    private String exevlPdRaw;

    @JsonProperty("exevl_op")
    private String exevlOpRaw;

    @JsonProperty("extr_pp")
    private String extrPpRaw;

    @JsonProperty("extrsc_extrctrd")
    private String extrscExtrctrdRaw;

    @JsonProperty("extrsc_shddstd")
    private String extrscShddstdRaw;

    @JsonProperty("extrsc_shclspd_bgd")
    private String extrscShclspdBgdRaw;

    @JsonProperty("extrsc_shclspd_edd")
    private String extrscShclspdEddRaw;

    @JsonProperty("extrsc_extrop_rcpd_bgd")
    private String extrscExtropRcpdBgdRaw;

    @JsonProperty("extrsc_extrop_rcpd_edd")
    private String extrscExtropRcpdEddRaw;

    @JsonProperty("extrsc_gmtsck_prd")
    private String extrscGmtsckPrdRaw;

    @JsonProperty("extrsc_aprskh_expd_bgd")
    private String extrscAprskhExpdBgdRaw;

    @JsonProperty("extrsc_aprskh_expd_edd")
    private String extrscAprskhExpdEddRaw;

    @JsonProperty("extrsc_osprpd_bgd")
    private String extrscOsprpdBgdRaw;

    @JsonProperty("extrsc_osprpd_edd")
    private String extrscOsprpdEddRaw;

    @JsonProperty("extrsc_trspprpd")
    private String extrscTrspprpdRaw;

    @JsonProperty("extrsc_trspprpd_bgd")
    private String extrscTrspprpdBgdRaw;

    @JsonProperty("extrsc_trspprpd_edd")
    private String extrscTrspprpdEddRaw;

    @JsonProperty("extrsc_extrdt")
    private String extrscExtrdtRaw;

    @JsonProperty("extrsc_nstkdlprd")
    private String extrscNstkdlprdRaw;

    @JsonProperty("extrsc_nstklstprd")
    private String extrscNstklstprdRaw;

    @JsonProperty("atextr_cpcmpnm")
    private String atextrCpcmpnmRaw;

    @JsonProperty("aprskh_plnprc")
    private String aprskhPlnprcRaw;

    @JsonProperty("aprskh_pym_plpd_mth")
    private String aprskhPymPlpdMthRaw;

    @JsonProperty("aprskh_lmt")
    private String aprskhLmtRaw;

    @JsonProperty("aprskh_ctref")
    private String aprskhCtrefRaw;

    @JsonProperty("bdlst_atn")
    private String bdlstAtnRaw;

    @JsonProperty("otcpr_bdlst_sf_atn")
    private String otcprBdlstSfAtnRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("popt_ctr_atn")
    private String poptCtrAtnRaw;

    @JsonProperty("popt_ctr_cn")
    private String poptCtrCnRaw;

    @JsonProperty("rs_sm_atn")
    private String rsSmAtnRaw;

    @JsonProperty("ex_sm_r")
    private String exSmRRaw;

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

    /** 구분 */
    public String getExtrSen() { return DataPreprocessor.cleanString(extrSenRaw); }
    public void setExtrSenRaw(String v) { this.extrSenRaw = v; }

    /** 교환ㆍ이전 형태 */
    public String getExtrStn() { return DataPreprocessor.cleanString(extrStnRaw); }
    public void setExtrStnRaw(String v) { this.extrStnRaw = v; }

    /** 교환ㆍ이전 대상법인(회사명) */
    public String getExtrTgcmpCmpnm() { return DataPreprocessor.cleanString(extrTgcmpCmpnmRaw); }
    public void setExtrTgcmpCmpnmRaw(String v) { this.extrTgcmpCmpnmRaw = v; }

    /** 교환ㆍ이전 대상법인(대표자) */
    public String getExtrTgcmpRp() { return DataPreprocessor.cleanString(extrTgcmpRpRaw); }
    public void setExtrTgcmpRpRaw(String v) { this.extrTgcmpRpRaw = v; }

    /** 교환ㆍ이전 대상법인(주요사업) */
    public String getExtrTgcmpMbsn() { return DataPreprocessor.cleanString(extrTgcmpMbsnRaw); }
    public void setExtrTgcmpMbsnRaw(String v) { this.extrTgcmpMbsnRaw = v; }

    /** 교환ㆍ이전 대상법인(회사와의 관계) */
    public String getExtrTgcmpRlCmpn() { return DataPreprocessor.cleanString(extrTgcmpRlCmpnRaw); }
    public void setExtrTgcmpRlCmpnRaw(String v) { this.extrTgcmpRlCmpnRaw = v; }

    /** 교환ㆍ이전 대상법인(발행주식총수(주)(보통주식)) - 9999999999 */
    public String getExtrTgcmpTisstkOstkRaw() { return extrTgcmpTisstkOstkRaw; }
    public BigDecimal getExtrTgcmpTisstkOstk() { return DataPreprocessor.parseAmount(extrTgcmpTisstkOstkRaw); }
    public void setExtrTgcmpTisstkOstkRaw(String v) { this.extrTgcmpTisstkOstkRaw = v; }

    /** 교환ㆍ이전 대상법인(발행주식총수(주)(종류주식)) - 9999999999 */
    public String getExtrTgcmpTisstkCstkRaw() { return extrTgcmpTisstkCstkRaw; }
    public BigDecimal getExtrTgcmpTisstkCstk() { return DataPreprocessor.parseAmount(extrTgcmpTisstkCstkRaw); }
    public void setExtrTgcmpTisstkCstkRaw(String v) { this.extrTgcmpTisstkCstkRaw = v; }

    /** 교환ㆍ이전 대상법인(최근 사업연도 요약재무내용(원)(자산총계)) - 9999999999 */
    public String getRbsnfdtlTastRaw() { return rbsnfdtlTastRaw; }
    public BigDecimal getRbsnfdtlTast() { return DataPreprocessor.parseAmount(rbsnfdtlTastRaw); }
    public void setRbsnfdtlTastRaw(String v) { this.rbsnfdtlTastRaw = v; }

    /** 교환ㆍ이전 대상법인(최근 사업연도 요약재무내용(원)(부채총계)) - 9999999999 */
    public String getRbsnfdtlTdbtRaw() { return rbsnfdtlTdbtRaw; }
    public BigDecimal getRbsnfdtlTdbt() { return DataPreprocessor.parseAmount(rbsnfdtlTdbtRaw); }
    public void setRbsnfdtlTdbtRaw(String v) { this.rbsnfdtlTdbtRaw = v; }

    /** 교환ㆍ이전 대상법인(최근 사업연도 요약재무내용(원)(자본총계)) - 9999999999 */
    public String getRbsnfdtlTeqtRaw() { return rbsnfdtlTeqtRaw; }
    public BigDecimal getRbsnfdtlTeqt() { return DataPreprocessor.parseAmount(rbsnfdtlTeqtRaw); }
    public void setRbsnfdtlTeqtRaw(String v) { this.rbsnfdtlTeqtRaw = v; }

    /** 교환ㆍ이전 대상법인(최근 사업연도 요약재무내용(원)(자본금)) - 9999999999 */
    public String getRbsnfdtlCptRaw() { return rbsnfdtlCptRaw; }
    public BigDecimal getRbsnfdtlCpt() { return DataPreprocessor.parseAmount(rbsnfdtlCptRaw); }
    public void setRbsnfdtlCptRaw(String v) { this.rbsnfdtlCptRaw = v; }

    /** 교환ㆍ이전 비율 */
    public String getExtrRtRaw() { return extrRtRaw; }
    public BigDecimal getExtrRt() { return DataPreprocessor.parseAmount(extrRtRaw); }
    public void setExtrRtRaw(String v) { this.extrRtRaw = v; }

    /** 교환ㆍ이전 비율 산출근거 */
    public String getExtrRtBsRaw() { return extrRtBsRaw; }
    public BigDecimal getExtrRtBs() { return DataPreprocessor.parseAmount(extrRtBsRaw); }
    public void setExtrRtBsRaw(String v) { this.extrRtBsRaw = v; }

    /** 외부평가에 관한 사항(외부평가 여부) */
    public String getExevlAtn() { return DataPreprocessor.cleanString(exevlAtnRaw); }
    public void setExevlAtnRaw(String v) { this.exevlAtnRaw = v; }

    /** 외부평가에 관한 사항(근거 및 사유) */
    public String getExevlBsRs() { return DataPreprocessor.cleanString(exevlBsRsRaw); }
    public void setExevlBsRsRaw(String v) { this.exevlBsRsRaw = v; }

    /** 외부평가에 관한 사항(외부평가기관의 명칭) */
    public String getExevlIntn() { return DataPreprocessor.cleanString(exevlIntnRaw); }
    public void setExevlIntnRaw(String v) { this.exevlIntnRaw = v; }

    /** 외부평가에 관한 사항(외부평가 기간) */
    public String getExevlPd() { return DataPreprocessor.cleanString(exevlPdRaw); }
    public void setExevlPdRaw(String v) { this.exevlPdRaw = v; }

    /** 외부평가에 관한 사항(외부평가 의견) */
    public String getExevlOp() { return DataPreprocessor.cleanString(exevlOpRaw); }
    public void setExevlOpRaw(String v) { this.exevlOpRaw = v; }

    /** 교환ㆍ이전 목적 */
    public String getExtrPp() { return DataPreprocessor.cleanString(extrPpRaw); }
    public void setExtrPpRaw(String v) { this.extrPpRaw = v; }

    /** 교환ㆍ이전일정(교환ㆍ이전계약일) */
    public String getExtrscExtrctrd() { return DataPreprocessor.cleanString(extrscExtrctrdRaw); }
    public void setExtrscExtrctrdRaw(String v) { this.extrscExtrctrdRaw = v; }

    /** 교환ㆍ이전일정(주주확정기준일) */
    public String getExtrscShddstd() { return DataPreprocessor.cleanString(extrscShddstdRaw); }
    public void setExtrscShddstdRaw(String v) { this.extrscShddstdRaw = v; }

    /** 교환ㆍ이전일정(주주명부 폐쇄기간(시작일)) */
    public String getExtrscShclspdBgd() { return DataPreprocessor.cleanString(extrscShclspdBgdRaw); }
    public void setExtrscShclspdBgdRaw(String v) { this.extrscShclspdBgdRaw = v; }

    /** 교환ㆍ이전일정(주주명부 폐쇄기간(종료일)) */
    public String getExtrscShclspdEdd() { return DataPreprocessor.cleanString(extrscShclspdEddRaw); }
    public void setExtrscShclspdEddRaw(String v) { this.extrscShclspdEddRaw = v; }

    /** 교환ㆍ이전일정(주식교환ㆍ이전 반대의사 통지접수기간(시작일)) */
    public String getExtrscExtropRcpdBgd() { return DataPreprocessor.cleanString(extrscExtropRcpdBgdRaw); }
    public void setExtrscExtropRcpdBgdRaw(String v) { this.extrscExtropRcpdBgdRaw = v; }

    /** 교환ㆍ이전일정(주식교환ㆍ이전 반대의사 통지접수기간(종료일)) */
    public String getExtrscExtropRcpdEdd() { return DataPreprocessor.cleanString(extrscExtropRcpdEddRaw); }
    public void setExtrscExtropRcpdEddRaw(String v) { this.extrscExtropRcpdEddRaw = v; }

    /** 교환ㆍ이전일정(주주총회 예정일자) */
    public String getExtrscGmtsckPrdRaw() { return extrscGmtsckPrdRaw; }
    public String getExtrscGmtsckPrd() { return DataPreprocessor.formatDate(extrscGmtsckPrdRaw); }
    public void setExtrscGmtsckPrdRaw(String v) { this.extrscGmtsckPrdRaw = v; }

    /** 교환ㆍ이전일정(주식매수청구권 행사기간(시작일)) */
    public String getExtrscAprskhExpdBgd() { return DataPreprocessor.cleanString(extrscAprskhExpdBgdRaw); }
    public void setExtrscAprskhExpdBgdRaw(String v) { this.extrscAprskhExpdBgdRaw = v; }

    /** 교환ㆍ이전일정(주식매수청구권 행사기간(종료일)) */
    public String getExtrscAprskhExpdEdd() { return DataPreprocessor.cleanString(extrscAprskhExpdEddRaw); }
    public void setExtrscAprskhExpdEddRaw(String v) { this.extrscAprskhExpdEddRaw = v; }

    /** 교환ㆍ이전일정(구주권제출기간(시작일)) */
    public String getExtrscOsprpdBgd() { return DataPreprocessor.cleanString(extrscOsprpdBgdRaw); }
    public void setExtrscOsprpdBgdRaw(String v) { this.extrscOsprpdBgdRaw = v; }

    /** 교환ㆍ이전일정(구주권제출기간(종료일)) */
    public String getExtrscOsprpdEdd() { return DataPreprocessor.cleanString(extrscOsprpdEddRaw); }
    public void setExtrscOsprpdEddRaw(String v) { this.extrscOsprpdEddRaw = v; }

    /** 교환ㆍ이전일정(매매거래정지예정기간) - 교환ㆍ이전일정(매매거래정지예정기간) ① 2019년 12월 08일까지 사용됨 */
    public String getExtrscTrspprpd() { return DataPreprocessor.cleanString(extrscTrspprpdRaw); }
    public void setExtrscTrspprpdRaw(String v) { this.extrscTrspprpdRaw = v; }

    /** 교환ㆍ이전일정(매매거래정지예정기간(시작일)) - 교환ㆍ이전일정(매매거래정지예정기간(시작일)) ② 2019년 12월 09일부터 추가됨 */
    public String getExtrscTrspprpdBgd() { return DataPreprocessor.cleanString(extrscTrspprpdBgdRaw); }
    public void setExtrscTrspprpdBgdRaw(String v) { this.extrscTrspprpdBgdRaw = v; }

    /** 교환ㆍ이전일정(매매거래정지예정기간(종료일)) - 교환ㆍ이전일정(매매거래정지예정기간(종료일)) ② 2019년 12월 09일부터 추가됨 */
    public String getExtrscTrspprpdEdd() { return DataPreprocessor.cleanString(extrscTrspprpdEddRaw); }
    public void setExtrscTrspprpdEddRaw(String v) { this.extrscTrspprpdEddRaw = v; }

    /** 교환ㆍ이전일정(교환ㆍ이전일자) */
    public String getExtrscExtrdtRaw() { return extrscExtrdtRaw; }
    public String getExtrscExtrdt() { return DataPreprocessor.formatDate(extrscExtrdtRaw); }
    public void setExtrscExtrdtRaw(String v) { this.extrscExtrdtRaw = v; }

    /** 교환ㆍ이전일정(신주권교부예정일) */
    public String getExtrscNstkdlprd() { return DataPreprocessor.cleanString(extrscNstkdlprdRaw); }
    public void setExtrscNstkdlprdRaw(String v) { this.extrscNstkdlprdRaw = v; }

    /** 교환ㆍ이전일정(신주의 상장예정일) */
    public String getExtrscNstklstprd() { return DataPreprocessor.cleanString(extrscNstklstprdRaw); }
    public void setExtrscNstklstprdRaw(String v) { this.extrscNstklstprdRaw = v; }

    /** 교환ㆍ이전 후 완전모회사명 */
    public String getAtextrCpcmpnm() { return DataPreprocessor.cleanString(atextrCpcmpnmRaw); }
    public void setAtextrCpcmpnmRaw(String v) { this.atextrCpcmpnmRaw = v; }

    /** 주식매수청구권에 관한 사항(매수예정가격) - 9999999999 */
    public String getAprskhPlnprcRaw() { return aprskhPlnprcRaw; }
    public BigDecimal getAprskhPlnprc() { return DataPreprocessor.parseAmount(aprskhPlnprcRaw); }
    public void setAprskhPlnprcRaw(String v) { this.aprskhPlnprcRaw = v; }

    /** 주식매수청구권에 관한 사항(지급예정시기, 지급방법) */
    public String getAprskhPymPlpdMth() { return DataPreprocessor.cleanString(aprskhPymPlpdMthRaw); }
    public void setAprskhPymPlpdMthRaw(String v) { this.aprskhPymPlpdMthRaw = v; }

    /** 주식매수청구권에 관한 사항(주식매수청구권 제한 관련 내용) */
    public String getAprskhLmt() { return DataPreprocessor.cleanString(aprskhLmtRaw); }
    public void setAprskhLmtRaw(String v) { this.aprskhLmtRaw = v; }

    /** 주식매수청구권에 관한 사항(계약에 미치는 효력) */
    public String getAprskhCtref() { return DataPreprocessor.cleanString(aprskhCtrefRaw); }
    public void setAprskhCtrefRaw(String v) { this.aprskhCtrefRaw = v; }

    /** 우회상장 해당 여부 */
    public String getBdlstAtn() { return DataPreprocessor.cleanString(bdlstAtnRaw); }
    public void setBdlstAtnRaw(String v) { this.bdlstAtnRaw = v; }

    /** 타법인의 우회상장 요건 충족 여부 */
    public String getOtcprBdlstSfAtn() { return DataPreprocessor.cleanString(otcprBdlstSfAtnRaw); }
    public void setOtcprBdlstSfAtnRaw(String v) { this.otcprBdlstSfAtnRaw = v; }

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

    /** 감사(사외이사가 아닌 감사위원) 참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

    /** 풋옵션 등 계약 체결여부 */
    public String getPoptCtrAtn() { return DataPreprocessor.cleanString(poptCtrAtnRaw); }
    public void setPoptCtrAtnRaw(String v) { this.poptCtrAtnRaw = v; }

    /** 계약내용 */
    public String getPoptCtrCn() { return DataPreprocessor.cleanString(poptCtrCnRaw); }
    public void setPoptCtrCnRaw(String v) { this.poptCtrCnRaw = v; }

    /** 증권신고서 제출대상 여부 */
    public String getRsSmAtn() { return DataPreprocessor.cleanString(rsSmAtnRaw); }
    public void setRsSmAtnRaw(String v) { this.rsSmAtnRaw = v; }

    /** 제출을 면제받은 경우 그 사유 */
    public String getExSmR() { return DataPreprocessor.cleanString(exSmRRaw); }
    public void setExSmRRaw(String v) { this.exSmRRaw = v; }

}
