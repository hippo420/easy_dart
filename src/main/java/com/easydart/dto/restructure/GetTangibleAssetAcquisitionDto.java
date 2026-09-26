package com.easydart.dto.restructure;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 유형자산 양수 결정 응답 DTO */
public class GetTangibleAssetAcquisitionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("ast_sen")
    private String astSenRaw;

    @JsonProperty("ast_nm")
    private String astNmRaw;

    @JsonProperty("inhdtl_inhprc")
    private String inhdtlInhprcRaw;

    @JsonProperty("inhdtl_tast")
    private String inhdtlTastRaw;

    @JsonProperty("inhdtl_tast_vs")
    private String inhdtlTastVsRaw;

    @JsonProperty("inh_pp")
    private String inhPpRaw;

    @JsonProperty("inh_af")
    private String inhAfRaw;

    @JsonProperty("inh_prd_ctr_cnsd")
    private String inhPrdCtrCnsdRaw;

    @JsonProperty("inh_prd_inh_std")
    private String inhPrdInhStdRaw;

    @JsonProperty("inh_prd_rgs_prd")
    private String inhPrdRgsPrdRaw;

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

    @JsonProperty("gmtsck_spd_atn")
    private String gmtsckSpdAtnRaw;

    @JsonProperty("gmtsck_prd")
    private String gmtsckPrdRaw;

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

    /** 자산구분 */
    public String getAstSen() { return DataPreprocessor.cleanString(astSenRaw); }
    public void setAstSenRaw(String v) { this.astSenRaw = v; }

    /** 자산명 */
    public String getAstNm() { return DataPreprocessor.cleanString(astNmRaw); }
    public void setAstNmRaw(String v) { this.astNmRaw = v; }

    /** 양수내역(양수금액(원)) - 9999999999 */
    public String getInhdtlInhprcRaw() { return inhdtlInhprcRaw; }
    public BigDecimal getInhdtlInhprc() { return DataPreprocessor.parseAmount(inhdtlInhprcRaw); }
    public void setInhdtlInhprcRaw(String v) { this.inhdtlInhprcRaw = v; }

    /** 양수내역(자산총액(원)) - 9999999999 */
    public String getInhdtlTastRaw() { return inhdtlTastRaw; }
    public BigDecimal getInhdtlTast() { return DataPreprocessor.parseAmount(inhdtlTastRaw); }
    public void setInhdtlTastRaw(String v) { this.inhdtlTastRaw = v; }

    /** 양수내역(자산총액대비(%)) */
    public String getInhdtlTastVsRaw() { return inhdtlTastVsRaw; }
    public BigDecimal getInhdtlTastVs() { return DataPreprocessor.parseAmount(inhdtlTastVsRaw); }
    public void setInhdtlTastVsRaw(String v) { this.inhdtlTastVsRaw = v; }

    /** 양수목적 */
    public String getInhPp() { return DataPreprocessor.cleanString(inhPpRaw); }
    public void setInhPpRaw(String v) { this.inhPpRaw = v; }

    /** 양수영향 */
    public String getInhAf() { return DataPreprocessor.cleanString(inhAfRaw); }
    public void setInhAfRaw(String v) { this.inhAfRaw = v; }

    /** 양수예정일자(계약체결일) */
    public String getInhPrdCtrCnsd() { return DataPreprocessor.cleanString(inhPrdCtrCnsdRaw); }
    public void setInhPrdCtrCnsdRaw(String v) { this.inhPrdCtrCnsdRaw = v; }

    /** 양수예정일자(양수기준일) */
    public String getInhPrdInhStd() { return DataPreprocessor.cleanString(inhPrdInhStdRaw); }
    public void setInhPrdInhStdRaw(String v) { this.inhPrdInhStdRaw = v; }

    /** 양수예정일자(등기예정일) */
    public String getInhPrdRgsPrdRaw() { return inhPrdRgsPrdRaw; }
    public String getInhPrdRgsPrd() { return DataPreprocessor.formatDate(inhPrdRgsPrdRaw); }
    public void setInhPrdRgsPrdRaw(String v) { this.inhPrdRgsPrdRaw = v; }

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

    /** 주주총회 특별결의 여부 */
    public String getGmtsckSpdAtn() { return DataPreprocessor.cleanString(gmtsckSpdAtnRaw); }
    public void setGmtsckSpdAtnRaw(String v) { this.gmtsckSpdAtnRaw = v; }

    /** 주주총회 예정일자 */
    public String getGmtsckPrdRaw() { return gmtsckPrdRaw; }
    public String getGmtsckPrd() { return DataPreprocessor.formatDate(gmtsckPrdRaw); }
    public void setGmtsckPrdRaw(String v) { this.gmtsckPrdRaw = v; }

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
