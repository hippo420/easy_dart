package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회사합병 결정 응답 DTO */
public class GetMergerDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("mg_mth")
    private String mgMthRaw;

    @JsonProperty("mg_stn")
    private String mgStnRaw;

    @JsonProperty("mg_pp")
    private String mgPpRaw;

    @JsonProperty("mg_rt")
    private String mgRtRaw;

    @JsonProperty("mg_rt_bs")
    private String mgRtBsRaw;

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

    @JsonProperty("mgnstk_ostk_cnt")
    private String mgnstkOstkCntRaw;

    @JsonProperty("mgnstk_cstk_cnt")
    private String mgnstkCstkCntRaw;

    @JsonProperty("mgptncmp_cmpnm")
    private String mgptncmpCmpnmRaw;

    @JsonProperty("mgptncmp_mbsn")
    private String mgptncmpMbsnRaw;

    @JsonProperty("mgptncmp_rl_cmpn")
    private String mgptncmpRlCmpnRaw;

    @JsonProperty("rbsnfdtl_tast")
    private String rbsnfdtlTastRaw;

    @JsonProperty("rbsnfdtl_tdbt")
    private String rbsnfdtlTdbtRaw;

    @JsonProperty("rbsnfdtl_teqt")
    private String rbsnfdtlTeqtRaw;

    @JsonProperty("rbsnfdtl_cpt")
    private String rbsnfdtlCptRaw;

    @JsonProperty("rbsnfdtl_sl")
    private String rbsnfdtlSlRaw;

    @JsonProperty("rbsnfdtl_nic")
    private String rbsnfdtlNicRaw;

    @JsonProperty("eadtat_intn")
    private String eadtatIntnRaw;

    @JsonProperty("eadtat_op")
    private String eadtatOpRaw;

    @JsonProperty("nmgcmp_cmpnm")
    private String nmgcmpCmpnmRaw;

    @JsonProperty("ffdtl_tast")
    private String ffdtlTastRaw;

    @JsonProperty("ffdtl_tdbt")
    private String ffdtlTdbtRaw;

    @JsonProperty("ffdtl_teqt")
    private String ffdtlTeqtRaw;

    @JsonProperty("ffdtl_cpt")
    private String ffdtlCptRaw;

    @JsonProperty("ffdtl_std")
    private String ffdtlStdRaw;

    @JsonProperty("nmgcmp_nbsn_rsl")
    private String nmgcmpNbsnRslRaw;

    @JsonProperty("nmgcmp_mbsn")
    private String nmgcmpMbsnRaw;

    @JsonProperty("nmgcmp_rlst_atn")
    private String nmgcmpRlstAtnRaw;

    @JsonProperty("mgsc_mgctrd")
    private String mgscMgctrdRaw;

    @JsonProperty("mgsc_shddstd")
    private String mgscShddstdRaw;

    @JsonProperty("mgsc_shclspd_bgd")
    private String mgscShclspdBgdRaw;

    @JsonProperty("mgsc_shclspd_edd")
    private String mgscShclspdEddRaw;

    @JsonProperty("mgsc_mgop_rcpd_bgd")
    private String mgscMgopRcpdBgdRaw;

    @JsonProperty("mgsc_mgop_rcpd_edd")
    private String mgscMgopRcpdEddRaw;

    @JsonProperty("mgsc_gmtsck_prd")
    private String mgscGmtsckPrdRaw;

    @JsonProperty("mgsc_aprskh_expd_bgd")
    private String mgscAprskhExpdBgdRaw;

    @JsonProperty("mgsc_aprskh_expd_edd")
    private String mgscAprskhExpdEddRaw;

    @JsonProperty("mgsc_osprpd_bgd")
    private String mgscOsprpdBgdRaw;

    @JsonProperty("mgsc_osprpd_edd")
    private String mgscOsprpdEddRaw;

    @JsonProperty("mgsc_trspprpd_bgd")
    private String mgscTrspprpdBgdRaw;

    @JsonProperty("mgsc_trspprpd_edd")
    private String mgscTrspprpdEddRaw;

    @JsonProperty("mgsc_cdobprpd_bgd")
    private String mgscCdobprpdBgdRaw;

    @JsonProperty("mgsc_cdobprpd_edd")
    private String mgscCdobprpdEddRaw;

    @JsonProperty("mgsc_mgdt")
    private String mgscMgdtRaw;

    @JsonProperty("mgsc_ergmd")
    private String mgscErgmdRaw;

    @JsonProperty("mgsc_mgrgsprd")
    private String mgscMgrgsprdRaw;

    @JsonProperty("mgsc_nstkdlprd")
    private String mgscNstkdlprdRaw;

    @JsonProperty("mgsc_nstklstprd")
    private String mgscNstklstprdRaw;

    @JsonProperty("bdlst_atn")
    private String bdlstAtnRaw;

    @JsonProperty("otcpr_bdlst_sf_atn")
    private String otcprBdlstSfAtnRaw;

    @JsonProperty("aprskh_plnprc")
    private String aprskhPlnprcRaw;

    @JsonProperty("aprskh_pym_plpd_mth")
    private String aprskhPymPlpdMthRaw;

    @JsonProperty("aprskh_ctref")
    private String aprskhCtrefRaw;

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

    /** 합병방법 */
    public String getMgMth() { return DataPreprocessor.cleanString(mgMthRaw); }
    public void setMgMthRaw(String v) { this.mgMthRaw = v; }

    /** 합병형태 */
    public String getMgStn() { return DataPreprocessor.cleanString(mgStnRaw); }
    public void setMgStnRaw(String v) { this.mgStnRaw = v; }

    /** 합병목적 */
    public String getMgPp() { return DataPreprocessor.cleanString(mgPpRaw); }
    public void setMgPpRaw(String v) { this.mgPpRaw = v; }

    /** 합병비율 */
    public String getMgRtRaw() { return mgRtRaw; }
    public BigDecimal getMgRt() { return DataPreprocessor.parseAmount(mgRtRaw); }
    public void setMgRtRaw(String v) { this.mgRtRaw = v; }

    /** 합병비율 산출근거 */
    public String getMgRtBsRaw() { return mgRtBsRaw; }
    public BigDecimal getMgRtBs() { return DataPreprocessor.parseAmount(mgRtBsRaw); }
    public void setMgRtBsRaw(String v) { this.mgRtBsRaw = v; }

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

    /** 합병신주의 종류와 수(주)(보통주식) - 9999999999 */
    public String getMgnstkOstkCntRaw() { return mgnstkOstkCntRaw; }
    public BigDecimal getMgnstkOstkCnt() { return DataPreprocessor.parseAmount(mgnstkOstkCntRaw); }
    public void setMgnstkOstkCntRaw(String v) { this.mgnstkOstkCntRaw = v; }

    /** 합병신주의 종류와 수(주)(종류주식) - 9999999999 */
    public String getMgnstkCstkCntRaw() { return mgnstkCstkCntRaw; }
    public BigDecimal getMgnstkCstkCnt() { return DataPreprocessor.parseAmount(mgnstkCstkCntRaw); }
    public void setMgnstkCstkCntRaw(String v) { this.mgnstkCstkCntRaw = v; }

    /** 합병상대회사(회사명) */
    public String getMgptncmpCmpnm() { return DataPreprocessor.cleanString(mgptncmpCmpnmRaw); }
    public void setMgptncmpCmpnmRaw(String v) { this.mgptncmpCmpnmRaw = v; }

    /** 합병상대회사(주요사업) */
    public String getMgptncmpMbsn() { return DataPreprocessor.cleanString(mgptncmpMbsnRaw); }
    public void setMgptncmpMbsnRaw(String v) { this.mgptncmpMbsnRaw = v; }

    /** 합병상대회사(회사와의 관계) */
    public String getMgptncmpRlCmpn() { return DataPreprocessor.cleanString(mgptncmpRlCmpnRaw); }
    public void setMgptncmpRlCmpnRaw(String v) { this.mgptncmpRlCmpnRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(자산총계)) - 9999999999 */
    public String getRbsnfdtlTastRaw() { return rbsnfdtlTastRaw; }
    public BigDecimal getRbsnfdtlTast() { return DataPreprocessor.parseAmount(rbsnfdtlTastRaw); }
    public void setRbsnfdtlTastRaw(String v) { this.rbsnfdtlTastRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(부채총계)) - 9999999999 */
    public String getRbsnfdtlTdbtRaw() { return rbsnfdtlTdbtRaw; }
    public BigDecimal getRbsnfdtlTdbt() { return DataPreprocessor.parseAmount(rbsnfdtlTdbtRaw); }
    public void setRbsnfdtlTdbtRaw(String v) { this.rbsnfdtlTdbtRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(자본총계)) - 9999999999 */
    public String getRbsnfdtlTeqtRaw() { return rbsnfdtlTeqtRaw; }
    public BigDecimal getRbsnfdtlTeqt() { return DataPreprocessor.parseAmount(rbsnfdtlTeqtRaw); }
    public void setRbsnfdtlTeqtRaw(String v) { this.rbsnfdtlTeqtRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(자본금)) - 9999999999 */
    public String getRbsnfdtlCptRaw() { return rbsnfdtlCptRaw; }
    public BigDecimal getRbsnfdtlCpt() { return DataPreprocessor.parseAmount(rbsnfdtlCptRaw); }
    public void setRbsnfdtlCptRaw(String v) { this.rbsnfdtlCptRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(매출액)) - 9999999999 */
    public String getRbsnfdtlSlRaw() { return rbsnfdtlSlRaw; }
    public BigDecimal getRbsnfdtlSl() { return DataPreprocessor.parseAmount(rbsnfdtlSlRaw); }
    public void setRbsnfdtlSlRaw(String v) { this.rbsnfdtlSlRaw = v; }

    /** 합병상대회사(최근 사업연도 재무내용(원)(당기순이익)) - 9999999999 */
    public String getRbsnfdtlNicRaw() { return rbsnfdtlNicRaw; }
    public BigDecimal getRbsnfdtlNic() { return DataPreprocessor.parseAmount(rbsnfdtlNicRaw); }
    public void setRbsnfdtlNicRaw(String v) { this.rbsnfdtlNicRaw = v; }

    /** 합병상대회사(외부감사 여부(기관명)) */
    public String getEadtatIntn() { return DataPreprocessor.cleanString(eadtatIntnRaw); }
    public void setEadtatIntnRaw(String v) { this.eadtatIntnRaw = v; }

    /** 합병상대회사(외부감사 여부(감사의견)) */
    public String getEadtatOp() { return DataPreprocessor.cleanString(eadtatOpRaw); }
    public void setEadtatOpRaw(String v) { this.eadtatOpRaw = v; }

    /** 신설합병회사(회사명) */
    public String getNmgcmpCmpnm() { return DataPreprocessor.cleanString(nmgcmpCmpnmRaw); }
    public void setNmgcmpCmpnmRaw(String v) { this.nmgcmpCmpnmRaw = v; }

    /** 신설합병회사(설립시 재무내용(원)(자산총계)) - 9999999999 */
    public String getFfdtlTastRaw() { return ffdtlTastRaw; }
    public BigDecimal getFfdtlTast() { return DataPreprocessor.parseAmount(ffdtlTastRaw); }
    public void setFfdtlTastRaw(String v) { this.ffdtlTastRaw = v; }

    /** 신설합병회사(설립시 재무내용(원)(부채총계)) - 9999999999 */
    public String getFfdtlTdbtRaw() { return ffdtlTdbtRaw; }
    public BigDecimal getFfdtlTdbt() { return DataPreprocessor.parseAmount(ffdtlTdbtRaw); }
    public void setFfdtlTdbtRaw(String v) { this.ffdtlTdbtRaw = v; }

    /** 신설합병회사(설립시 재무내용(원)(자본총계)) - 9999999999 */
    public String getFfdtlTeqtRaw() { return ffdtlTeqtRaw; }
    public BigDecimal getFfdtlTeqt() { return DataPreprocessor.parseAmount(ffdtlTeqtRaw); }
    public void setFfdtlTeqtRaw(String v) { this.ffdtlTeqtRaw = v; }

    /** 신설합병회사(설립시 재무내용(원)(자본금)) - 9999999999 */
    public String getFfdtlCptRaw() { return ffdtlCptRaw; }
    public BigDecimal getFfdtlCpt() { return DataPreprocessor.parseAmount(ffdtlCptRaw); }
    public void setFfdtlCptRaw(String v) { this.ffdtlCptRaw = v; }

    /** 신설합병회사(설립시 재무내용(원)(현재기준)) */
    public String getFfdtlStd() { return DataPreprocessor.cleanString(ffdtlStdRaw); }
    public void setFfdtlStdRaw(String v) { this.ffdtlStdRaw = v; }

    /** 신설합병회사(신설사업부문 최근 사업연도 매출액(원)) - 9999999999 */
    public String getNmgcmpNbsnRslRaw() { return nmgcmpNbsnRslRaw; }
    public BigDecimal getNmgcmpNbsnRsl() { return DataPreprocessor.parseAmount(nmgcmpNbsnRslRaw); }
    public void setNmgcmpNbsnRslRaw(String v) { this.nmgcmpNbsnRslRaw = v; }

    /** 신설합병회사(주요사업) */
    public String getNmgcmpMbsn() { return DataPreprocessor.cleanString(nmgcmpMbsnRaw); }
    public void setNmgcmpMbsnRaw(String v) { this.nmgcmpMbsnRaw = v; }

    /** 신설합병회사(재상장신청 여부) */
    public String getNmgcmpRlstAtn() { return DataPreprocessor.cleanString(nmgcmpRlstAtnRaw); }
    public void setNmgcmpRlstAtnRaw(String v) { this.nmgcmpRlstAtnRaw = v; }

    /** 합병일정(합병계약일) */
    public String getMgscMgctrd() { return DataPreprocessor.cleanString(mgscMgctrdRaw); }
    public void setMgscMgctrdRaw(String v) { this.mgscMgctrdRaw = v; }

    /** 합병일정(주주확정기준일) */
    public String getMgscShddstd() { return DataPreprocessor.cleanString(mgscShddstdRaw); }
    public void setMgscShddstdRaw(String v) { this.mgscShddstdRaw = v; }

    /** 합병일정(주주명부 폐쇄기간(시작일)) */
    public String getMgscShclspdBgd() { return DataPreprocessor.cleanString(mgscShclspdBgdRaw); }
    public void setMgscShclspdBgdRaw(String v) { this.mgscShclspdBgdRaw = v; }

    /** 합병일정(주주명부 폐쇄기간(종료일)) */
    public String getMgscShclspdEdd() { return DataPreprocessor.cleanString(mgscShclspdEddRaw); }
    public void setMgscShclspdEddRaw(String v) { this.mgscShclspdEddRaw = v; }

    /** 합병일정(합병반대의사통지 접수기간(시작일)) */
    public String getMgscMgopRcpdBgd() { return DataPreprocessor.cleanString(mgscMgopRcpdBgdRaw); }
    public void setMgscMgopRcpdBgdRaw(String v) { this.mgscMgopRcpdBgdRaw = v; }

    /** 합병일정(합병반대의사통지 접수기간(종료일)) */
    public String getMgscMgopRcpdEdd() { return DataPreprocessor.cleanString(mgscMgopRcpdEddRaw); }
    public void setMgscMgopRcpdEddRaw(String v) { this.mgscMgopRcpdEddRaw = v; }

    /** 합병일정(주주총회예정일자) */
    public String getMgscGmtsckPrdRaw() { return mgscGmtsckPrdRaw; }
    public String getMgscGmtsckPrd() { return DataPreprocessor.formatDate(mgscGmtsckPrdRaw); }
    public void setMgscGmtsckPrdRaw(String v) { this.mgscGmtsckPrdRaw = v; }

    /** 합병일정(주식매수청구권 행사기간(시작일)) */
    public String getMgscAprskhExpdBgd() { return DataPreprocessor.cleanString(mgscAprskhExpdBgdRaw); }
    public void setMgscAprskhExpdBgdRaw(String v) { this.mgscAprskhExpdBgdRaw = v; }

    /** 합병일정(주식매수청구권 행사기간(종료일)) */
    public String getMgscAprskhExpdEdd() { return DataPreprocessor.cleanString(mgscAprskhExpdEddRaw); }
    public void setMgscAprskhExpdEddRaw(String v) { this.mgscAprskhExpdEddRaw = v; }

    /** 합병일정(구주권 제출기간(시작일)) */
    public String getMgscOsprpdBgd() { return DataPreprocessor.cleanString(mgscOsprpdBgdRaw); }
    public void setMgscOsprpdBgdRaw(String v) { this.mgscOsprpdBgdRaw = v; }

    /** 합병일정(구주권 제출기간(종료일)) */
    public String getMgscOsprpdEdd() { return DataPreprocessor.cleanString(mgscOsprpdEddRaw); }
    public void setMgscOsprpdEddRaw(String v) { this.mgscOsprpdEddRaw = v; }

    /** 합병일정(매매거래 정지예정기간(시작일)) */
    public String getMgscTrspprpdBgd() { return DataPreprocessor.cleanString(mgscTrspprpdBgdRaw); }
    public void setMgscTrspprpdBgdRaw(String v) { this.mgscTrspprpdBgdRaw = v; }

    /** 합병일정(매매거래 정지예정기간(종료일)) */
    public String getMgscTrspprpdEdd() { return DataPreprocessor.cleanString(mgscTrspprpdEddRaw); }
    public void setMgscTrspprpdEddRaw(String v) { this.mgscTrspprpdEddRaw = v; }

    /** 합병일정(채권자이의 제출기간(시작일)) */
    public String getMgscCdobprpdBgd() { return DataPreprocessor.cleanString(mgscCdobprpdBgdRaw); }
    public void setMgscCdobprpdBgdRaw(String v) { this.mgscCdobprpdBgdRaw = v; }

    /** 합병일정(채권자이의 제출기간(종료일)) */
    public String getMgscCdobprpdEdd() { return DataPreprocessor.cleanString(mgscCdobprpdEddRaw); }
    public void setMgscCdobprpdEddRaw(String v) { this.mgscCdobprpdEddRaw = v; }

    /** 합병일정(합병기일) */
    public String getMgscMgdt() { return DataPreprocessor.cleanString(mgscMgdtRaw); }
    public void setMgscMgdtRaw(String v) { this.mgscMgdtRaw = v; }

    /** 합병일정(종료보고 총회일) */
    public String getMgscErgmd() { return DataPreprocessor.cleanString(mgscErgmdRaw); }
    public void setMgscErgmdRaw(String v) { this.mgscErgmdRaw = v; }

    /** 합병일정(합병등기예정일자) */
    public String getMgscMgrgsprd() { return DataPreprocessor.cleanString(mgscMgrgsprdRaw); }
    public void setMgscMgrgsprdRaw(String v) { this.mgscMgrgsprdRaw = v; }

    /** 합병일정(신주권교부예정일) */
    public String getMgscNstkdlprd() { return DataPreprocessor.cleanString(mgscNstkdlprdRaw); }
    public void setMgscNstkdlprdRaw(String v) { this.mgscNstkdlprdRaw = v; }

    /** 합병일정(신주의 상장예정일) */
    public String getMgscNstklstprd() { return DataPreprocessor.cleanString(mgscNstklstprdRaw); }
    public void setMgscNstklstprdRaw(String v) { this.mgscNstklstprdRaw = v; }

    /** 우회상장 해당 여부 */
    public String getBdlstAtn() { return DataPreprocessor.cleanString(bdlstAtnRaw); }
    public void setBdlstAtnRaw(String v) { this.bdlstAtnRaw = v; }

    /** 타법인의 우회상장 요건 충족여부 */
    public String getOtcprBdlstSfAtn() { return DataPreprocessor.cleanString(otcprBdlstSfAtnRaw); }
    public void setOtcprBdlstSfAtnRaw(String v) { this.otcprBdlstSfAtnRaw = v; }

    /** 주식매수청구권에 관한 사항(매수예정가격) - 9999999999 */
    public String getAprskhPlnprcRaw() { return aprskhPlnprcRaw; }
    public BigDecimal getAprskhPlnprc() { return DataPreprocessor.parseAmount(aprskhPlnprcRaw); }
    public void setAprskhPlnprcRaw(String v) { this.aprskhPlnprcRaw = v; }

    /** 주식매수청구권에 관한 사항(지급예정시기, 지급방법) */
    public String getAprskhPymPlpdMth() { return DataPreprocessor.cleanString(aprskhPymPlpdMthRaw); }
    public void setAprskhPymPlpdMthRaw(String v) { this.aprskhPymPlpdMthRaw = v; }

    /** 주식매수청구권에 관한 사항(계약에 미치는 효력) */
    public String getAprskhCtref() { return DataPreprocessor.cleanString(aprskhCtrefRaw); }
    public void setAprskhCtrefRaw(String v) { this.aprskhCtrefRaw = v; }

    /** 이사회결의일(결정일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사참석여부(참석(명)) */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사참석여부(불참(명)) */
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
