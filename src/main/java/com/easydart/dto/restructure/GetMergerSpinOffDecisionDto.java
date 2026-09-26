package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회사분할합병 결정 응답 DTO */
public class GetMergerSpinOffDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("dvmg_mth")
    private String dvmgMthRaw;

    @JsonProperty("dvmg_impef")
    private String dvmgImpefRaw;

    @JsonProperty("dv_trfbsnprt_cn")
    private String dvTrfbsnprtCnRaw;

    @JsonProperty("atdv_excmp_cmpnm")
    private String atdvExcmpCmpnmRaw;

    @JsonProperty("atdvfdtl_tast")
    private String atdvfdtlTastRaw;

    @JsonProperty("atdvfdtl_tdbt")
    private String atdvfdtlTdbtRaw;

    @JsonProperty("atdvfdtl_teqt")
    private String atdvfdtlTeqtRaw;

    @JsonProperty("atdvfdtl_cpt")
    private String atdvfdtlCptRaw;

    @JsonProperty("atdvfdtl_std")
    private String atdvfdtlStdRaw;

    @JsonProperty("atdv_excmp_exbsn_rsl")
    private String atdvExcmpExbsnRslRaw;

    @JsonProperty("atdv_excmp_mbsn")
    private String atdvExcmpMbsnRaw;

    @JsonProperty("atdv_excmp_atdv_lstmn_atn")
    private String atdvExcmpAtdvLstmnAtnRaw;

    @JsonProperty("dvfcmp_cmpnm")
    private String dvfcmpCmpnmRaw;

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

    @JsonProperty("dvfcmp_nbsn_rsl")
    private String dvfcmpNbsnRslRaw;

    @JsonProperty("dvfcmp_mbsn")
    private String dvfcmpMbsnRaw;

    @JsonProperty("dvfcmp_atdv_lstmn_at")
    private String dvfcmpAtdvLstmnAtRaw;

    @JsonProperty("abcr_crrt")
    private String abcrCrrtRaw;

    @JsonProperty("abcr_osprpd_bgd")
    private String abcrOsprpdBgdRaw;

    @JsonProperty("abcr_osprpd_edd")
    private String abcrOsprpdEddRaw;

    @JsonProperty("abcr_trspprpd_bgd")
    private String abcrTrspprpdBgdRaw;

    @JsonProperty("abcr_trspprpd_edd")
    private String abcrTrspprpdEddRaw;

    @JsonProperty("abcr_nstkascnd")
    private String abcrNstkascndRaw;

    @JsonProperty("abcr_shstkcnt_rt_at_rs")
    private String abcrShstkcntRtAtRsRaw;

    @JsonProperty("abcr_nstkasstd")
    private String abcrNstkasstdRaw;

    @JsonProperty("abcr_nstkdlprd")
    private String abcrNstkdlprdRaw;

    @JsonProperty("abcr_nstklstprd")
    private String abcrNstklstprdRaw;

    @JsonProperty("mg_stn")
    private String mgStnRaw;

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

    @JsonProperty("dvmgnstk_ostk_cnt")
    private String dvmgnstkOstkCntRaw;

    @JsonProperty("dvmgnstk_cstk_cnt")
    private String dvmgnstkCstkCntRaw;

    @JsonProperty("nmgcmp_cmpnm")
    private String nmgcmpCmpnmRaw;

    @JsonProperty("nmgcmp_cpt")
    private String nmgcmpCptRaw;

    @JsonProperty("nmgcmp_mbsn")
    private String nmgcmpMbsnRaw;

    @JsonProperty("nmgcmp_rlst_atn")
    private String nmgcmpRlstAtnRaw;

    @JsonProperty("dvmg_rt")
    private String dvmgRtRaw;

    @JsonProperty("dvmg_rt_bs")
    private String dvmgRtBsRaw;

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

    @JsonProperty("dvmgsc_dvmgctrd")
    private String dvmgscDvmgctrdRaw;

    @JsonProperty("dvmgsc_shddstd")
    private String dvmgscShddstdRaw;

    @JsonProperty("dvmgsc_shclspd_bgd")
    private String dvmgscShclspdBgdRaw;

    @JsonProperty("dvmgsc_shclspd_edd")
    private String dvmgscShclspdEddRaw;

    @JsonProperty("dvmgsc_dvmgop_rcpd_bgd")
    private String dvmgscDvmgopRcpdBgdRaw;

    @JsonProperty("dvmgsc_dvmgop_rcpd_edd")
    private String dvmgscDvmgopRcpdEddRaw;

    @JsonProperty("dvmgsc_gmtsck_prd")
    private String dvmgscGmtsckPrdRaw;

    @JsonProperty("dvmgsc_aprskh_expd_bgd")
    private String dvmgscAprskhExpdBgdRaw;

    @JsonProperty("dvmgsc_aprskh_expd_edd")
    private String dvmgscAprskhExpdEddRaw;

    @JsonProperty("dvmgsc_cdobprpd_bgd")
    private String dvmgscCdobprpdBgdRaw;

    @JsonProperty("dvmgsc_cdobprpd_edd")
    private String dvmgscCdobprpdEddRaw;

    @JsonProperty("dvmgsc_dvmgdt")
    private String dvmgscDvmgdtRaw;

    @JsonProperty("dvmgsc_ergmd")
    private String dvmgscErgmdRaw;

    @JsonProperty("dvmgsc_dvmgrgsprd")
    private String dvmgscDvmgrgsprdRaw;

    @JsonProperty("bdlst_atn")
    private String bdlstAtnRaw;

    @JsonProperty("otcpr_bdlst_sf_atn")
    private String otcprBdlstSfAtnRaw;

    @JsonProperty("aprskh_exrq")
    private String aprskhExrqRaw;

    @JsonProperty("aprskh_plnprc")
    private String aprskhPlnprcRaw;

    @JsonProperty("aprskh_ex_pc_mth_pd_pl")
    private String aprskhExPcMthPdPlRaw;

    @JsonProperty("aprskh_pym_plpd_mth")
    private String aprskhPymPlpdMthRaw;

    @JsonProperty("aprskh_lmt")
    private String aprskhLmtRaw;

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

    /** 분할합병 방법 */
    public String getDvmgMth() { return DataPreprocessor.cleanString(dvmgMthRaw); }
    public void setDvmgMthRaw(String v) { this.dvmgMthRaw = v; }

    /** 분할합병의 중요영향 및 효과 */
    public String getDvmgImpef() { return DataPreprocessor.cleanString(dvmgImpefRaw); }
    public void setDvmgImpefRaw(String v) { this.dvmgImpefRaw = v; }

    /** 분할에 관한 사항(분할로 이전할 사업 및 재산의 내용) */
    public String getDvTrfbsnprtCn() { return DataPreprocessor.cleanString(dvTrfbsnprtCnRaw); }
    public void setDvTrfbsnprtCnRaw(String v) { this.dvTrfbsnprtCnRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(회사명)) */
    public String getAtdvExcmpCmpnm() { return DataPreprocessor.cleanString(atdvExcmpCmpnmRaw); }
    public void setAtdvExcmpCmpnmRaw(String v) { this.atdvExcmpCmpnmRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할후 재무내용(원)(자산총계))) - 9999999999 */
    public String getAtdvfdtlTastRaw() { return atdvfdtlTastRaw; }
    public BigDecimal getAtdvfdtlTast() { return DataPreprocessor.parseAmount(atdvfdtlTastRaw); }
    public void setAtdvfdtlTastRaw(String v) { this.atdvfdtlTastRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할후 재무내용(원)(부채총계))) - 9999999999 */
    public String getAtdvfdtlTdbtRaw() { return atdvfdtlTdbtRaw; }
    public BigDecimal getAtdvfdtlTdbt() { return DataPreprocessor.parseAmount(atdvfdtlTdbtRaw); }
    public void setAtdvfdtlTdbtRaw(String v) { this.atdvfdtlTdbtRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할후 재무내용(원)(자본총계))) - 9999999999 */
    public String getAtdvfdtlTeqtRaw() { return atdvfdtlTeqtRaw; }
    public BigDecimal getAtdvfdtlTeqt() { return DataPreprocessor.parseAmount(atdvfdtlTeqtRaw); }
    public void setAtdvfdtlTeqtRaw(String v) { this.atdvfdtlTeqtRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할후 재무내용(원)(자본금))) - 9999999999 */
    public String getAtdvfdtlCptRaw() { return atdvfdtlCptRaw; }
    public BigDecimal getAtdvfdtlCpt() { return DataPreprocessor.parseAmount(atdvfdtlCptRaw); }
    public void setAtdvfdtlCptRaw(String v) { this.atdvfdtlCptRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할후 재무내용(원)(현재기준))) */
    public String getAtdvfdtlStd() { return DataPreprocessor.cleanString(atdvfdtlStdRaw); }
    public void setAtdvfdtlStdRaw(String v) { this.atdvfdtlStdRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(존속사업부문 최근 사업연도매출액(원))) - 9999999999 */
    public String getAtdvExcmpExbsnRslRaw() { return atdvExcmpExbsnRslRaw; }
    public BigDecimal getAtdvExcmpExbsnRsl() { return DataPreprocessor.parseAmount(atdvExcmpExbsnRslRaw); }
    public void setAtdvExcmpExbsnRslRaw(String v) { this.atdvExcmpExbsnRslRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(주요사업)) */
    public String getAtdvExcmpMbsn() { return DataPreprocessor.cleanString(atdvExcmpMbsnRaw); }
    public void setAtdvExcmpMbsnRaw(String v) { this.atdvExcmpMbsnRaw = v; }

    /** 분할에 관한 사항(분할 후 존속회사(분할 후 상장유지 여부)) */
    public String getAtdvExcmpAtdvLstmnAtn() { return DataPreprocessor.cleanString(atdvExcmpAtdvLstmnAtnRaw); }
    public void setAtdvExcmpAtdvLstmnAtnRaw(String v) { this.atdvExcmpAtdvLstmnAtnRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(회사명)) */
    public String getDvfcmpCmpnm() { return DataPreprocessor.cleanString(dvfcmpCmpnmRaw); }
    public void setDvfcmpCmpnmRaw(String v) { this.dvfcmpCmpnmRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(설립시 재무내용(원)(자산총계))) - 9999999999 */
    public String getFfdtlTastRaw() { return ffdtlTastRaw; }
    public BigDecimal getFfdtlTast() { return DataPreprocessor.parseAmount(ffdtlTastRaw); }
    public void setFfdtlTastRaw(String v) { this.ffdtlTastRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(설립시 재무내용(원)(부채총계))) - 9999999999 */
    public String getFfdtlTdbtRaw() { return ffdtlTdbtRaw; }
    public BigDecimal getFfdtlTdbt() { return DataPreprocessor.parseAmount(ffdtlTdbtRaw); }
    public void setFfdtlTdbtRaw(String v) { this.ffdtlTdbtRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(설립시 재무내용(원)(자본총계))) - 9999999999 */
    public String getFfdtlTeqtRaw() { return ffdtlTeqtRaw; }
    public BigDecimal getFfdtlTeqt() { return DataPreprocessor.parseAmount(ffdtlTeqtRaw); }
    public void setFfdtlTeqtRaw(String v) { this.ffdtlTeqtRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(설립시 재무내용(원)(자본금))) - 9999999999 */
    public String getFfdtlCptRaw() { return ffdtlCptRaw; }
    public BigDecimal getFfdtlCpt() { return DataPreprocessor.parseAmount(ffdtlCptRaw); }
    public void setFfdtlCptRaw(String v) { this.ffdtlCptRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(설립시 재무내용(원)(현재기준))) */
    public String getFfdtlStd() { return DataPreprocessor.cleanString(ffdtlStdRaw); }
    public void setFfdtlStdRaw(String v) { this.ffdtlStdRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(신설사업부문 최근 사업연도 매출액(원))) - 9999999999 */
    public String getDvfcmpNbsnRslRaw() { return dvfcmpNbsnRslRaw; }
    public BigDecimal getDvfcmpNbsnRsl() { return DataPreprocessor.parseAmount(dvfcmpNbsnRslRaw); }
    public void setDvfcmpNbsnRslRaw(String v) { this.dvfcmpNbsnRslRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(주요사업)) */
    public String getDvfcmpMbsn() { return DataPreprocessor.cleanString(dvfcmpMbsnRaw); }
    public void setDvfcmpMbsnRaw(String v) { this.dvfcmpMbsnRaw = v; }

    /** 분할에 관한 사항(분할설립 회사(분할후 상장유지여부)) */
    public String getDvfcmpAtdvLstmnAt() { return DataPreprocessor.cleanString(dvfcmpAtdvLstmnAtRaw); }
    public void setDvfcmpAtdvLstmnAtRaw(String v) { this.dvfcmpAtdvLstmnAtRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(감자비율(%))) */
    public String getAbcrCrrtRaw() { return abcrCrrtRaw; }
    public BigDecimal getAbcrCrrt() { return DataPreprocessor.parseAmount(abcrCrrtRaw); }
    public void setAbcrCrrtRaw(String v) { this.abcrCrrtRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(구주권 제출기간(시작일))) */
    public String getAbcrOsprpdBgd() { return DataPreprocessor.cleanString(abcrOsprpdBgdRaw); }
    public void setAbcrOsprpdBgdRaw(String v) { this.abcrOsprpdBgdRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(구주권 제출기간(종료일))) */
    public String getAbcrOsprpdEdd() { return DataPreprocessor.cleanString(abcrOsprpdEddRaw); }
    public void setAbcrOsprpdEddRaw(String v) { this.abcrOsprpdEddRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(매매거래정지 예정기간(시작일))) */
    public String getAbcrTrspprpdBgd() { return DataPreprocessor.cleanString(abcrTrspprpdBgdRaw); }
    public void setAbcrTrspprpdBgdRaw(String v) { this.abcrTrspprpdBgdRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(매매거래정지 예정기간(종료일))) */
    public String getAbcrTrspprpdEdd() { return DataPreprocessor.cleanString(abcrTrspprpdEddRaw); }
    public void setAbcrTrspprpdEddRaw(String v) { this.abcrTrspprpdEddRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(신주배정조건)) */
    public String getAbcrNstkascnd() { return DataPreprocessor.cleanString(abcrNstkascndRaw); }
    public void setAbcrNstkascndRaw(String v) { this.abcrNstkascndRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(주주 주식수 비례여부 및 사유)) */
    public String getAbcrShstkcntRtAtRsRaw() { return abcrShstkcntRtAtRsRaw; }
    public BigDecimal getAbcrShstkcntRtAtRs() { return DataPreprocessor.parseAmount(abcrShstkcntRtAtRsRaw); }
    public void setAbcrShstkcntRtAtRsRaw(String v) { this.abcrShstkcntRtAtRsRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(신주배정기준일)) */
    public String getAbcrNstkasstd() { return DataPreprocessor.cleanString(abcrNstkasstdRaw); }
    public void setAbcrNstkasstdRaw(String v) { this.abcrNstkasstdRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(신주권교부예정일)) */
    public String getAbcrNstkdlprd() { return DataPreprocessor.cleanString(abcrNstkdlprdRaw); }
    public void setAbcrNstkdlprdRaw(String v) { this.abcrNstkdlprdRaw = v; }

    /** 분할에 관한 사항(감자에 관한 사항(신주의 상장예정일)) */
    public String getAbcrNstklstprd() { return DataPreprocessor.cleanString(abcrNstklstprdRaw); }
    public void setAbcrNstklstprdRaw(String v) { this.abcrNstklstprdRaw = v; }

    /** 합병에 관한 사항(합병형태) */
    public String getMgStn() { return DataPreprocessor.cleanString(mgStnRaw); }
    public void setMgStnRaw(String v) { this.mgStnRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(회사명)) */
    public String getMgptncmpCmpnm() { return DataPreprocessor.cleanString(mgptncmpCmpnmRaw); }
    public void setMgptncmpCmpnmRaw(String v) { this.mgptncmpCmpnmRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(주요사업)) */
    public String getMgptncmpMbsn() { return DataPreprocessor.cleanString(mgptncmpMbsnRaw); }
    public void setMgptncmpMbsnRaw(String v) { this.mgptncmpMbsnRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(회사와의 관계)) */
    public String getMgptncmpRlCmpn() { return DataPreprocessor.cleanString(mgptncmpRlCmpnRaw); }
    public void setMgptncmpRlCmpnRaw(String v) { this.mgptncmpRlCmpnRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(자산총계))) - 9999999999 */
    public String getRbsnfdtlTastRaw() { return rbsnfdtlTastRaw; }
    public BigDecimal getRbsnfdtlTast() { return DataPreprocessor.parseAmount(rbsnfdtlTastRaw); }
    public void setRbsnfdtlTastRaw(String v) { this.rbsnfdtlTastRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(부채총계))) - 9999999999 */
    public String getRbsnfdtlTdbtRaw() { return rbsnfdtlTdbtRaw; }
    public BigDecimal getRbsnfdtlTdbt() { return DataPreprocessor.parseAmount(rbsnfdtlTdbtRaw); }
    public void setRbsnfdtlTdbtRaw(String v) { this.rbsnfdtlTdbtRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(자본총계))) - 9999999999 */
    public String getRbsnfdtlTeqtRaw() { return rbsnfdtlTeqtRaw; }
    public BigDecimal getRbsnfdtlTeqt() { return DataPreprocessor.parseAmount(rbsnfdtlTeqtRaw); }
    public void setRbsnfdtlTeqtRaw(String v) { this.rbsnfdtlTeqtRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(자본금))) - 9999999999 */
    public String getRbsnfdtlCptRaw() { return rbsnfdtlCptRaw; }
    public BigDecimal getRbsnfdtlCpt() { return DataPreprocessor.parseAmount(rbsnfdtlCptRaw); }
    public void setRbsnfdtlCptRaw(String v) { this.rbsnfdtlCptRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(매출액))) - 9999999999 */
    public String getRbsnfdtlSlRaw() { return rbsnfdtlSlRaw; }
    public BigDecimal getRbsnfdtlSl() { return DataPreprocessor.parseAmount(rbsnfdtlSlRaw); }
    public void setRbsnfdtlSlRaw(String v) { this.rbsnfdtlSlRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(최근 사업연도 재무내용(원)(당기순이익))) - 9999999999 */
    public String getRbsnfdtlNicRaw() { return rbsnfdtlNicRaw; }
    public BigDecimal getRbsnfdtlNic() { return DataPreprocessor.parseAmount(rbsnfdtlNicRaw); }
    public void setRbsnfdtlNicRaw(String v) { this.rbsnfdtlNicRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(외부감사 여부(기관명))) */
    public String getEadtatIntn() { return DataPreprocessor.cleanString(eadtatIntnRaw); }
    public void setEadtatIntnRaw(String v) { this.eadtatIntnRaw = v; }

    /** 합병에 관한 사항(합병상대 회사(외부감사 여부(감사의견))) */
    public String getEadtatOp() { return DataPreprocessor.cleanString(eadtatOpRaw); }
    public void setEadtatOpRaw(String v) { this.eadtatOpRaw = v; }

    /** 합병에 관한 사항(분할합병신주의 종류와 수(주)(보통주식)) - 9999999999 */
    public String getDvmgnstkOstkCntRaw() { return dvmgnstkOstkCntRaw; }
    public BigDecimal getDvmgnstkOstkCnt() { return DataPreprocessor.parseAmount(dvmgnstkOstkCntRaw); }
    public void setDvmgnstkOstkCntRaw(String v) { this.dvmgnstkOstkCntRaw = v; }

    /** 합병에 관한 사항(분할합병신주의 종류와 수(주)(종류주식)) - 9999999999 */
    public String getDvmgnstkCstkCntRaw() { return dvmgnstkCstkCntRaw; }
    public BigDecimal getDvmgnstkCstkCnt() { return DataPreprocessor.parseAmount(dvmgnstkCstkCntRaw); }
    public void setDvmgnstkCstkCntRaw(String v) { this.dvmgnstkCstkCntRaw = v; }

    /** 합병에 관한 사항(합병신설 회사(회사명)) */
    public String getNmgcmpCmpnm() { return DataPreprocessor.cleanString(nmgcmpCmpnmRaw); }
    public void setNmgcmpCmpnmRaw(String v) { this.nmgcmpCmpnmRaw = v; }

    /** 합병에 관한 사항(합병신설 회사(자본금(원))) - 9999999999 */
    public String getNmgcmpCptRaw() { return nmgcmpCptRaw; }
    public BigDecimal getNmgcmpCpt() { return DataPreprocessor.parseAmount(nmgcmpCptRaw); }
    public void setNmgcmpCptRaw(String v) { this.nmgcmpCptRaw = v; }

    /** 합병에 관한 사항(합병신설 회사(주요사업)) */
    public String getNmgcmpMbsn() { return DataPreprocessor.cleanString(nmgcmpMbsnRaw); }
    public void setNmgcmpMbsnRaw(String v) { this.nmgcmpMbsnRaw = v; }

    /** 합병에 관한 사항(합병신설 회사(재상장신청 여부)) */
    public String getNmgcmpRlstAtn() { return DataPreprocessor.cleanString(nmgcmpRlstAtnRaw); }
    public void setNmgcmpRlstAtnRaw(String v) { this.nmgcmpRlstAtnRaw = v; }

    /** 분할합병비율 */
    public String getDvmgRtRaw() { return dvmgRtRaw; }
    public BigDecimal getDvmgRt() { return DataPreprocessor.parseAmount(dvmgRtRaw); }
    public void setDvmgRtRaw(String v) { this.dvmgRtRaw = v; }

    /** 분할합병비율 산출근거 */
    public String getDvmgRtBsRaw() { return dvmgRtBsRaw; }
    public BigDecimal getDvmgRtBs() { return DataPreprocessor.parseAmount(dvmgRtBsRaw); }
    public void setDvmgRtBsRaw(String v) { this.dvmgRtBsRaw = v; }

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

    /** 분할합병일정(분할합병계약일) */
    public String getDvmgscDvmgctrd() { return DataPreprocessor.cleanString(dvmgscDvmgctrdRaw); }
    public void setDvmgscDvmgctrdRaw(String v) { this.dvmgscDvmgctrdRaw = v; }

    /** 분할합병일정(주주확정기준일) */
    public String getDvmgscShddstd() { return DataPreprocessor.cleanString(dvmgscShddstdRaw); }
    public void setDvmgscShddstdRaw(String v) { this.dvmgscShddstdRaw = v; }

    /** 분할합병일정(주주명부 폐쇄기간(시작일)) */
    public String getDvmgscShclspdBgd() { return DataPreprocessor.cleanString(dvmgscShclspdBgdRaw); }
    public void setDvmgscShclspdBgdRaw(String v) { this.dvmgscShclspdBgdRaw = v; }

    /** 분할합병일정(주주명부 폐쇄기간(종료일)) */
    public String getDvmgscShclspdEdd() { return DataPreprocessor.cleanString(dvmgscShclspdEddRaw); }
    public void setDvmgscShclspdEddRaw(String v) { this.dvmgscShclspdEddRaw = v; }

    /** 분할합병일정(분할합병반대의사통지 접수기간(시작일)) */
    public String getDvmgscDvmgopRcpdBgd() { return DataPreprocessor.cleanString(dvmgscDvmgopRcpdBgdRaw); }
    public void setDvmgscDvmgopRcpdBgdRaw(String v) { this.dvmgscDvmgopRcpdBgdRaw = v; }

    /** 분할합병일정(분할합병반대의사통지 접수기간(종료일)) */
    public String getDvmgscDvmgopRcpdEdd() { return DataPreprocessor.cleanString(dvmgscDvmgopRcpdEddRaw); }
    public void setDvmgscDvmgopRcpdEddRaw(String v) { this.dvmgscDvmgopRcpdEddRaw = v; }

    /** 분할합병일정(주주총회예정일자) */
    public String getDvmgscGmtsckPrdRaw() { return dvmgscGmtsckPrdRaw; }
    public String getDvmgscGmtsckPrd() { return DataPreprocessor.formatDate(dvmgscGmtsckPrdRaw); }
    public void setDvmgscGmtsckPrdRaw(String v) { this.dvmgscGmtsckPrdRaw = v; }

    /** 분할합병일정(주식매수청구권 행사기간(시작일)) */
    public String getDvmgscAprskhExpdBgd() { return DataPreprocessor.cleanString(dvmgscAprskhExpdBgdRaw); }
    public void setDvmgscAprskhExpdBgdRaw(String v) { this.dvmgscAprskhExpdBgdRaw = v; }

    /** 분할합병일정(주식매수청구권 행사기간(종료일)) */
    public String getDvmgscAprskhExpdEdd() { return DataPreprocessor.cleanString(dvmgscAprskhExpdEddRaw); }
    public void setDvmgscAprskhExpdEddRaw(String v) { this.dvmgscAprskhExpdEddRaw = v; }

    /** 분할합병일정(채권자 이의 제출기간(시작일)) */
    public String getDvmgscCdobprpdBgd() { return DataPreprocessor.cleanString(dvmgscCdobprpdBgdRaw); }
    public void setDvmgscCdobprpdBgdRaw(String v) { this.dvmgscCdobprpdBgdRaw = v; }

    /** 분할합병일정(채권자 이의 제출기간(종료일)) */
    public String getDvmgscCdobprpdEdd() { return DataPreprocessor.cleanString(dvmgscCdobprpdEddRaw); }
    public void setDvmgscCdobprpdEddRaw(String v) { this.dvmgscCdobprpdEddRaw = v; }

    /** 분할합병일정(분할합병기일) */
    public String getDvmgscDvmgdt() { return DataPreprocessor.cleanString(dvmgscDvmgdtRaw); }
    public void setDvmgscDvmgdtRaw(String v) { this.dvmgscDvmgdtRaw = v; }

    /** 분할합병일정(종료보고 총회일) */
    public String getDvmgscErgmd() { return DataPreprocessor.cleanString(dvmgscErgmdRaw); }
    public void setDvmgscErgmdRaw(String v) { this.dvmgscErgmdRaw = v; }

    /** 분할합병일정(분할합병등기예정일) */
    public String getDvmgscDvmgrgsprd() { return DataPreprocessor.cleanString(dvmgscDvmgrgsprdRaw); }
    public void setDvmgscDvmgrgsprdRaw(String v) { this.dvmgscDvmgrgsprdRaw = v; }

    /** 우회상장 해당 여부 */
    public String getBdlstAtn() { return DataPreprocessor.cleanString(bdlstAtnRaw); }
    public void setBdlstAtnRaw(String v) { this.bdlstAtnRaw = v; }

    /** 타법인의 우회상장 요건 충족여부 */
    public String getOtcprBdlstSfAtn() { return DataPreprocessor.cleanString(otcprBdlstSfAtnRaw); }
    public void setOtcprBdlstSfAtnRaw(String v) { this.otcprBdlstSfAtnRaw = v; }

    /** 주식매수청구권에 관한 사항(행사요건) */
    public String getAprskhExrq() { return DataPreprocessor.cleanString(aprskhExrqRaw); }
    public void setAprskhExrqRaw(String v) { this.aprskhExrqRaw = v; }

    /** 주식매수청구권에 관한 사항(매수예정가격) - 9999999999 */
    public String getAprskhPlnprcRaw() { return aprskhPlnprcRaw; }
    public BigDecimal getAprskhPlnprc() { return DataPreprocessor.parseAmount(aprskhPlnprcRaw); }
    public void setAprskhPlnprcRaw(String v) { this.aprskhPlnprcRaw = v; }

    /** 주식매수청구권에 관한 사항(행사절차, 방법, 기간, 장소) */
    public String getAprskhExPcMthPdPl() { return DataPreprocessor.cleanString(aprskhExPcMthPdPlRaw); }
    public void setAprskhExPcMthPdPlRaw(String v) { this.aprskhExPcMthPdPlRaw = v; }

    /** 주식매수청구권에 관한 사항(지급예정시기, 지급방법) */
    public String getAprskhPymPlpdMth() { return DataPreprocessor.cleanString(aprskhPymPlpdMthRaw); }
    public void setAprskhPymPlpdMthRaw(String v) { this.aprskhPymPlpdMthRaw = v; }

    /** 주식매수청구권에 관한 사항(주식매수청구권 제한 관련 내용) */
    public String getAprskhLmt() { return DataPreprocessor.cleanString(aprskhLmtRaw); }
    public void setAprskhLmtRaw(String v) { this.aprskhLmtRaw = v; }

    /** 주식매수청구권에 관한 사항(계약에 미치는 효력) */
    public String getAprskhCtref() { return DataPreprocessor.cleanString(aprskhCtrefRaw); }
    public void setAprskhCtrefRaw(String v) { this.aprskhCtrefRaw = v; }

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
