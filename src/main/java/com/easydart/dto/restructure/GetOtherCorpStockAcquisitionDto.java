package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 타법인 주식 및 출자증권 양수결정 응답 DTO */
public class GetOtherCorpStockAcquisitionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("iscmp_cmpnm")
    private String iscmpCmpnmRaw;

    @JsonProperty("iscmp_nt")
    private String iscmpNtRaw;

    @JsonProperty("iscmp_rp")
    private String iscmpRpRaw;

    @JsonProperty("iscmp_cpt")
    private String iscmpCptRaw;

    @JsonProperty("iscmp_rl_cmpn")
    private String iscmpRlCmpnRaw;

    @JsonProperty("iscmp_tisstk")
    private String iscmpTisstkRaw;

    @JsonProperty("iscmp_mbsn")
    private String iscmpMbsnRaw;

    @JsonProperty("l6m_tpa_nstkaq_atn")
    private String l6mTpaNstkaqAtnRaw;

    @JsonProperty("inhdtl_stkcnt")
    private String inhdtlStkcntRaw;

    @JsonProperty("inhdtl_inhprc")
    private String inhdtlInhprcRaw;

    @JsonProperty("inhdtl_tast")
    private String inhdtlTastRaw;

    @JsonProperty("inhdtl_tast_vs")
    private String inhdtlTastVsRaw;

    @JsonProperty("inhdtl_ecpt")
    private String inhdtlEcptRaw;

    @JsonProperty("inhdtl_ecpt_vs")
    private String inhdtlEcptVsRaw;

    @JsonProperty("atinh_owstkcnt")
    private String atinhOwstkcntRaw;

    @JsonProperty("atinh_eqrt")
    private String atinhEqrtRaw;

    @JsonProperty("inh_pp")
    private String inhPpRaw;

    @JsonProperty("inh_prd")
    private String inhPrdRaw;

    @JsonProperty("dlptn_cmpnm")
    private String dlptnCmpnmRaw;

    @JsonProperty("dlptn_cpt")
    private String dlptnCptRaw;

    @JsonProperty("dlptn_mbsn")
    private String dlptnMbsnRaw;

    @JsonProperty("dlptn_hoadd")
    private String dlptnHoaddRaw;

    @JsonProperty("dlptn_rl_cmpn")
    private String dlptnRlCmpnRaw;

    @JsonProperty("dl_pym")
    private String dlPymRaw;

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

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

    @JsonProperty("bdlst_atn")
    private String bdlstAtnRaw;

    @JsonProperty("n6m_tpai_plann")
    private String n6mTpaiPlannRaw;

    @JsonProperty("iscmp_bdlst_sf_atn")
    private String iscmpBdlstSfAtnRaw;

    @JsonProperty("ftc_stt_atn")
    private String ftcSttAtnRaw;

    @JsonProperty("popt_ctr_atn")
    private String poptCtrAtnRaw;

    @JsonProperty("popt_ctr_cn")
    private String poptCtrCnRaw;

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

    /** 발행회사(회사명) */
    public String getIscmpCmpnm() { return DataPreprocessor.cleanString(iscmpCmpnmRaw); }
    public void setIscmpCmpnmRaw(String v) { this.iscmpCmpnmRaw = v; }

    /** 발행회사(국적) */
    public String getIscmpNt() { return DataPreprocessor.cleanString(iscmpNtRaw); }
    public void setIscmpNtRaw(String v) { this.iscmpNtRaw = v; }

    /** 발행회사(대표자) */
    public String getIscmpRp() { return DataPreprocessor.cleanString(iscmpRpRaw); }
    public void setIscmpRpRaw(String v) { this.iscmpRpRaw = v; }

    /** 발행회사(자본금(원)) - 9999999999 */
    public String getIscmpCptRaw() { return iscmpCptRaw; }
    public BigDecimal getIscmpCpt() { return DataPreprocessor.parseAmount(iscmpCptRaw); }
    public void setIscmpCptRaw(String v) { this.iscmpCptRaw = v; }

    /** 발행회사(회사와 관계) */
    public String getIscmpRlCmpn() { return DataPreprocessor.cleanString(iscmpRlCmpnRaw); }
    public void setIscmpRlCmpnRaw(String v) { this.iscmpRlCmpnRaw = v; }

    /** 발행회사(발행주식 총수(주)) - 9999999999 */
    public String getIscmpTisstkRaw() { return iscmpTisstkRaw; }
    public BigDecimal getIscmpTisstk() { return DataPreprocessor.parseAmount(iscmpTisstkRaw); }
    public void setIscmpTisstkRaw(String v) { this.iscmpTisstkRaw = v; }

    /** 발행회사(주요사업) */
    public String getIscmpMbsn() { return DataPreprocessor.cleanString(iscmpMbsnRaw); }
    public void setIscmpMbsnRaw(String v) { this.iscmpMbsnRaw = v; }

    /** 최근 6월 이내 제3자 배정에 의한 신주취득 여부 */
    public String getL6mTpaNstkaqAtn() { return DataPreprocessor.cleanString(l6mTpaNstkaqAtnRaw); }
    public void setL6mTpaNstkaqAtnRaw(String v) { this.l6mTpaNstkaqAtnRaw = v; }

    /** 양수내역(양수주식수(주)) - 9999999999 */
    public String getInhdtlStkcntRaw() { return inhdtlStkcntRaw; }
    public BigDecimal getInhdtlStkcnt() { return DataPreprocessor.parseAmount(inhdtlStkcntRaw); }
    public void setInhdtlStkcntRaw(String v) { this.inhdtlStkcntRaw = v; }

    /** 양수내역(양수금액(원)(A)) - 9999999999 */
    public String getInhdtlInhprcRaw() { return inhdtlInhprcRaw; }
    public BigDecimal getInhdtlInhprc() { return DataPreprocessor.parseAmount(inhdtlInhprcRaw); }
    public void setInhdtlInhprcRaw(String v) { this.inhdtlInhprcRaw = v; }

    /** 양수내역(총자산(원)(B)) - 9999999999 */
    public String getInhdtlTastRaw() { return inhdtlTastRaw; }
    public BigDecimal getInhdtlTast() { return DataPreprocessor.parseAmount(inhdtlTastRaw); }
    public void setInhdtlTastRaw(String v) { this.inhdtlTastRaw = v; }

    /** 양수내역(총자산대비(%)(A/B)) */
    public String getInhdtlTastVsRaw() { return inhdtlTastVsRaw; }
    public BigDecimal getInhdtlTastVs() { return DataPreprocessor.parseAmount(inhdtlTastVsRaw); }
    public void setInhdtlTastVsRaw(String v) { this.inhdtlTastVsRaw = v; }

    /** 양수내역(자기자본(원)(C)) - 9999999999 */
    public String getInhdtlEcptRaw() { return inhdtlEcptRaw; }
    public BigDecimal getInhdtlEcpt() { return DataPreprocessor.parseAmount(inhdtlEcptRaw); }
    public void setInhdtlEcptRaw(String v) { this.inhdtlEcptRaw = v; }

    /** 양수내역(자기자본대비(%)(A/C)) */
    public String getInhdtlEcptVsRaw() { return inhdtlEcptVsRaw; }
    public BigDecimal getInhdtlEcptVs() { return DataPreprocessor.parseAmount(inhdtlEcptVsRaw); }
    public void setInhdtlEcptVsRaw(String v) { this.inhdtlEcptVsRaw = v; }

    /** 양수후 소유주식수 및 지분비율(소유주식수(주)) - 9999999999 */
    public String getAtinhOwstkcntRaw() { return atinhOwstkcntRaw; }
    public BigDecimal getAtinhOwstkcnt() { return DataPreprocessor.parseAmount(atinhOwstkcntRaw); }
    public void setAtinhOwstkcntRaw(String v) { this.atinhOwstkcntRaw = v; }

    /** 양수후 소유주식수 및 지분비율(지분비율(%)) */
    public String getAtinhEqrtRaw() { return atinhEqrtRaw; }
    public BigDecimal getAtinhEqrt() { return DataPreprocessor.parseAmount(atinhEqrtRaw); }
    public void setAtinhEqrtRaw(String v) { this.atinhEqrtRaw = v; }

    /** 양수목적 */
    public String getInhPp() { return DataPreprocessor.cleanString(inhPpRaw); }
    public void setInhPpRaw(String v) { this.inhPpRaw = v; }

    /** 양수예정일자 */
    public String getInhPrdRaw() { return inhPrdRaw; }
    public String getInhPrd() { return DataPreprocessor.formatDate(inhPrdRaw); }
    public void setInhPrdRaw(String v) { this.inhPrdRaw = v; }

    /** 거래상대방(회사명(성명)) */
    public String getDlptnCmpnm() { return DataPreprocessor.cleanString(dlptnCmpnmRaw); }
    public void setDlptnCmpnmRaw(String v) { this.dlptnCmpnmRaw = v; }

    /** 거래상대방(자본금(원)) - 9999999999 */
    public String getDlptnCptRaw() { return dlptnCptRaw; }
    public BigDecimal getDlptnCpt() { return DataPreprocessor.parseAmount(dlptnCptRaw); }
    public void setDlptnCptRaw(String v) { this.dlptnCptRaw = v; }

    /** 거래상대방(주요사업) */
    public String getDlptnMbsn() { return DataPreprocessor.cleanString(dlptnMbsnRaw); }
    public void setDlptnMbsnRaw(String v) { this.dlptnMbsnRaw = v; }

    /** 거래상대방(본점소재지(주소)) */
    public String getDlptnHoadd() { return DataPreprocessor.cleanString(dlptnHoaddRaw); }
    public void setDlptnHoaddRaw(String v) { this.dlptnHoaddRaw = v; }

    /** 거래상대방(회사와의 관계) */
    public String getDlptnRlCmpn() { return DataPreprocessor.cleanString(dlptnRlCmpnRaw); }
    public void setDlptnRlCmpnRaw(String v) { this.dlptnRlCmpnRaw = v; }

    /** 거래대금지급 */
    public String getDlPym() { return DataPreprocessor.cleanString(dlPymRaw); }
    public void setDlPymRaw(String v) { this.dlPymRaw = v; }

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

    /** 우회상장 해당 여부 */
    public String getBdlstAtn() { return DataPreprocessor.cleanString(bdlstAtnRaw); }
    public void setBdlstAtnRaw(String v) { this.bdlstAtnRaw = v; }

    /** 향후 6월이내 제3자배정 증자 등 계획 */
    public String getN6mTpaiPlann() { return DataPreprocessor.cleanString(n6mTpaiPlannRaw); }
    public void setN6mTpaiPlannRaw(String v) { this.n6mTpaiPlannRaw = v; }

    /** 발행회사(타법인)의 우회상장 요건 충족여부 */
    public String getIscmpBdlstSfAtn() { return DataPreprocessor.cleanString(iscmpBdlstSfAtnRaw); }
    public void setIscmpBdlstSfAtnRaw(String v) { this.iscmpBdlstSfAtnRaw = v; }

    /** 공정거래위원회 신고대상 여부 */
    public String getFtcSttAtn() { return DataPreprocessor.cleanString(ftcSttAtnRaw); }
    public void setFtcSttAtnRaw(String v) { this.ftcSttAtnRaw = v; }

    /** 풋옵션 등 계약 체결여부 */
    public String getPoptCtrAtn() { return DataPreprocessor.cleanString(poptCtrAtnRaw); }
    public void setPoptCtrAtnRaw(String v) { this.poptCtrAtnRaw = v; }

    /** 계약내용 */
    public String getPoptCtrCn() { return DataPreprocessor.cleanString(poptCtrCnRaw); }
    public void setPoptCtrCnRaw(String v) { this.poptCtrCnRaw = v; }

}
