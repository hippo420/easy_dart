package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회사분할 결정 응답 DTO */
public class GetSpinOffDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("dv_mth")
    private String dvMthRaw;

    @JsonProperty("dv_impef")
    private String dvImpefRaw;

    @JsonProperty("dv_rt")
    private String dvRtRaw;

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

    @JsonProperty("dvfcmp_rlst_atn")
    private String dvfcmpRlstAtnRaw;

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

    @JsonProperty("gmtsck_prd")
    private String gmtsckPrdRaw;

    @JsonProperty("cdobprpd_bgd")
    private String cdobprpdBgdRaw;

    @JsonProperty("cdobprpd_edd")
    private String cdobprpdEddRaw;

    @JsonProperty("dvdt")
    private String dvdtRaw;

    @JsonProperty("dvrgsprd")
    private String dvrgsprdRaw;

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

    /** 분할방법 */
    public String getDvMth() { return DataPreprocessor.cleanString(dvMthRaw); }
    public void setDvMthRaw(String v) { this.dvMthRaw = v; }

    /** 분할의 중요영향 및 효과 */
    public String getDvImpef() { return DataPreprocessor.cleanString(dvImpefRaw); }
    public void setDvImpefRaw(String v) { this.dvImpefRaw = v; }

    /** 분할비율 */
    public String getDvRtRaw() { return dvRtRaw; }
    public BigDecimal getDvRt() { return DataPreprocessor.parseAmount(dvRtRaw); }
    public void setDvRtRaw(String v) { this.dvRtRaw = v; }

    /** 분할로 이전할 사업 및 재산의 내용 */
    public String getDvTrfbsnprtCn() { return DataPreprocessor.cleanString(dvTrfbsnprtCnRaw); }
    public void setDvTrfbsnprtCnRaw(String v) { this.dvTrfbsnprtCnRaw = v; }

    /** 분할 후 존속회사(회사명) */
    public String getAtdvExcmpCmpnm() { return DataPreprocessor.cleanString(atdvExcmpCmpnmRaw); }
    public void setAtdvExcmpCmpnmRaw(String v) { this.atdvExcmpCmpnmRaw = v; }

    /** 분할 후 존속회사(분할후 재무내용(원)(자산총계)) - 9999999999 */
    public String getAtdvfdtlTastRaw() { return atdvfdtlTastRaw; }
    public BigDecimal getAtdvfdtlTast() { return DataPreprocessor.parseAmount(atdvfdtlTastRaw); }
    public void setAtdvfdtlTastRaw(String v) { this.atdvfdtlTastRaw = v; }

    /** 분할 후 존속회사(분할후 재무내용(원)(부채총계)) - 9999999999 */
    public String getAtdvfdtlTdbtRaw() { return atdvfdtlTdbtRaw; }
    public BigDecimal getAtdvfdtlTdbt() { return DataPreprocessor.parseAmount(atdvfdtlTdbtRaw); }
    public void setAtdvfdtlTdbtRaw(String v) { this.atdvfdtlTdbtRaw = v; }

    /** 분할 후 존속회사(분할후 재무내용(원)(자본총계)) - 9999999999 */
    public String getAtdvfdtlTeqtRaw() { return atdvfdtlTeqtRaw; }
    public BigDecimal getAtdvfdtlTeqt() { return DataPreprocessor.parseAmount(atdvfdtlTeqtRaw); }
    public void setAtdvfdtlTeqtRaw(String v) { this.atdvfdtlTeqtRaw = v; }

    /** 분할 후 존속회사(분할후 재무내용(원)(자본금)) - 9999999999 */
    public String getAtdvfdtlCptRaw() { return atdvfdtlCptRaw; }
    public BigDecimal getAtdvfdtlCpt() { return DataPreprocessor.parseAmount(atdvfdtlCptRaw); }
    public void setAtdvfdtlCptRaw(String v) { this.atdvfdtlCptRaw = v; }

    /** 분할 후 존속회사(분할후 재무내용(원)(현재기준)) */
    public String getAtdvfdtlStd() { return DataPreprocessor.cleanString(atdvfdtlStdRaw); }
    public void setAtdvfdtlStdRaw(String v) { this.atdvfdtlStdRaw = v; }

    /** 분할 후 존속회사(존속사업부문 최근 사업연도매출액(원)) - 9999999999 */
    public String getAtdvExcmpExbsnRslRaw() { return atdvExcmpExbsnRslRaw; }
    public BigDecimal getAtdvExcmpExbsnRsl() { return DataPreprocessor.parseAmount(atdvExcmpExbsnRslRaw); }
    public void setAtdvExcmpExbsnRslRaw(String v) { this.atdvExcmpExbsnRslRaw = v; }

    /** 분할 후 존속회사(주요사업) */
    public String getAtdvExcmpMbsn() { return DataPreprocessor.cleanString(atdvExcmpMbsnRaw); }
    public void setAtdvExcmpMbsnRaw(String v) { this.atdvExcmpMbsnRaw = v; }

    /** 분할 후 존속회사(분할 후 상장유지 여부) */
    public String getAtdvExcmpAtdvLstmnAtn() { return DataPreprocessor.cleanString(atdvExcmpAtdvLstmnAtnRaw); }
    public void setAtdvExcmpAtdvLstmnAtnRaw(String v) { this.atdvExcmpAtdvLstmnAtnRaw = v; }

    /** 분할설립회사(회사명) */
    public String getDvfcmpCmpnm() { return DataPreprocessor.cleanString(dvfcmpCmpnmRaw); }
    public void setDvfcmpCmpnmRaw(String v) { this.dvfcmpCmpnmRaw = v; }

    /** 분할설립회사(설립시 재무내용(원)(자산총계)) - 9999999999 */
    public String getFfdtlTastRaw() { return ffdtlTastRaw; }
    public BigDecimal getFfdtlTast() { return DataPreprocessor.parseAmount(ffdtlTastRaw); }
    public void setFfdtlTastRaw(String v) { this.ffdtlTastRaw = v; }

    /** 분할설립회사(설립시 재무내용(원)(부채총계)) - 9999999999 */
    public String getFfdtlTdbtRaw() { return ffdtlTdbtRaw; }
    public BigDecimal getFfdtlTdbt() { return DataPreprocessor.parseAmount(ffdtlTdbtRaw); }
    public void setFfdtlTdbtRaw(String v) { this.ffdtlTdbtRaw = v; }

    /** 분할설립회사(설립시 재무내용(원)(자본총계)) - 9999999999 */
    public String getFfdtlTeqtRaw() { return ffdtlTeqtRaw; }
    public BigDecimal getFfdtlTeqt() { return DataPreprocessor.parseAmount(ffdtlTeqtRaw); }
    public void setFfdtlTeqtRaw(String v) { this.ffdtlTeqtRaw = v; }

    /** 분할설립회사(설립시 재무내용(원)(자본금)) - 9999999999 */
    public String getFfdtlCptRaw() { return ffdtlCptRaw; }
    public BigDecimal getFfdtlCpt() { return DataPreprocessor.parseAmount(ffdtlCptRaw); }
    public void setFfdtlCptRaw(String v) { this.ffdtlCptRaw = v; }

    /** 분할설립회사(설립시 재무내용(원)(현재기준)) */
    public String getFfdtlStd() { return DataPreprocessor.cleanString(ffdtlStdRaw); }
    public void setFfdtlStdRaw(String v) { this.ffdtlStdRaw = v; }

    /** 분할설립회사(신설사업부문 최근 사업연도 매출액(원)) - 9999999999 */
    public String getDvfcmpNbsnRslRaw() { return dvfcmpNbsnRslRaw; }
    public BigDecimal getDvfcmpNbsnRsl() { return DataPreprocessor.parseAmount(dvfcmpNbsnRslRaw); }
    public void setDvfcmpNbsnRslRaw(String v) { this.dvfcmpNbsnRslRaw = v; }

    /** 분할설립회사(주요사업) */
    public String getDvfcmpMbsn() { return DataPreprocessor.cleanString(dvfcmpMbsnRaw); }
    public void setDvfcmpMbsnRaw(String v) { this.dvfcmpMbsnRaw = v; }

    /** 분할설립회사(재상장신청 여부) */
    public String getDvfcmpRlstAtn() { return DataPreprocessor.cleanString(dvfcmpRlstAtnRaw); }
    public void setDvfcmpRlstAtnRaw(String v) { this.dvfcmpRlstAtnRaw = v; }

    /** 감자에 관한 사항(감자비율(%)) */
    public String getAbcrCrrtRaw() { return abcrCrrtRaw; }
    public BigDecimal getAbcrCrrt() { return DataPreprocessor.parseAmount(abcrCrrtRaw); }
    public void setAbcrCrrtRaw(String v) { this.abcrCrrtRaw = v; }

    /** 감자에 관한 사항(구주권 제출기간(시작일)) */
    public String getAbcrOsprpdBgd() { return DataPreprocessor.cleanString(abcrOsprpdBgdRaw); }
    public void setAbcrOsprpdBgdRaw(String v) { this.abcrOsprpdBgdRaw = v; }

    /** 감자에 관한 사항(구주권 제출기간(종료일)) */
    public String getAbcrOsprpdEdd() { return DataPreprocessor.cleanString(abcrOsprpdEddRaw); }
    public void setAbcrOsprpdEddRaw(String v) { this.abcrOsprpdEddRaw = v; }

    /** 감자에 관한 사항(매매거래정지 예정기간(시작일)) */
    public String getAbcrTrspprpdBgd() { return DataPreprocessor.cleanString(abcrTrspprpdBgdRaw); }
    public void setAbcrTrspprpdBgdRaw(String v) { this.abcrTrspprpdBgdRaw = v; }

    /** 감자에 관한 사항(매매거래정지 예정기간(종료일)) */
    public String getAbcrTrspprpdEdd() { return DataPreprocessor.cleanString(abcrTrspprpdEddRaw); }
    public void setAbcrTrspprpdEddRaw(String v) { this.abcrTrspprpdEddRaw = v; }

    /** 감자에 관한 사항(신주배정조건) */
    public String getAbcrNstkascnd() { return DataPreprocessor.cleanString(abcrNstkascndRaw); }
    public void setAbcrNstkascndRaw(String v) { this.abcrNstkascndRaw = v; }

    /** 감자에 관한 사항(주주 주식수 비례여부 및 사유) */
    public String getAbcrShstkcntRtAtRsRaw() { return abcrShstkcntRtAtRsRaw; }
    public BigDecimal getAbcrShstkcntRtAtRs() { return DataPreprocessor.parseAmount(abcrShstkcntRtAtRsRaw); }
    public void setAbcrShstkcntRtAtRsRaw(String v) { this.abcrShstkcntRtAtRsRaw = v; }

    /** 감자에 관한 사항(신주배정기준일) */
    public String getAbcrNstkasstd() { return DataPreprocessor.cleanString(abcrNstkasstdRaw); }
    public void setAbcrNstkasstdRaw(String v) { this.abcrNstkasstdRaw = v; }

    /** 감자에 관한 사항(신주권교부예정일) */
    public String getAbcrNstkdlprd() { return DataPreprocessor.cleanString(abcrNstkdlprdRaw); }
    public void setAbcrNstkdlprdRaw(String v) { this.abcrNstkdlprdRaw = v; }

    /** 감자에 관한 사항(신주의 상장예정일) */
    public String getAbcrNstklstprd() { return DataPreprocessor.cleanString(abcrNstklstprdRaw); }
    public void setAbcrNstklstprdRaw(String v) { this.abcrNstklstprdRaw = v; }

    /** 주주총회 예정일 */
    public String getGmtsckPrdRaw() { return gmtsckPrdRaw; }
    public String getGmtsckPrd() { return DataPreprocessor.formatDate(gmtsckPrdRaw); }
    public void setGmtsckPrdRaw(String v) { this.gmtsckPrdRaw = v; }

    /** 채권자 이의제출기간(시작일) */
    public String getCdobprpdBgd() { return DataPreprocessor.cleanString(cdobprpdBgdRaw); }
    public void setCdobprpdBgdRaw(String v) { this.cdobprpdBgdRaw = v; }

    /** 채권자 이의제출기간(종료일) */
    public String getCdobprpdEdd() { return DataPreprocessor.cleanString(cdobprpdEddRaw); }
    public void setCdobprpdEddRaw(String v) { this.cdobprpdEddRaw = v; }

    /** 분할기일 */
    public String getDvdtRaw() { return dvdtRaw; }
    public String getDvdt() { return DataPreprocessor.formatDate(dvdtRaw); }
    public void setDvdtRaw(String v) { this.dvdtRaw = v; }

    /** 분할등기 예정일 */
    public String getDvrgsprd() { return DataPreprocessor.cleanString(dvrgsprdRaw); }
    public void setDvrgsprdRaw(String v) { this.dvrgsprdRaw = v; }

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
