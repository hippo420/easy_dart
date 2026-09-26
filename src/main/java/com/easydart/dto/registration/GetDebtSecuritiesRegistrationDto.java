package com.easydart.dto.registration;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 채무증권 응답 DTO */
public class GetDebtSecuritiesRegistrationDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("tm")
    private String tmRaw;

    @JsonProperty("bdnmn")
    private String bdnmnRaw;

    @JsonProperty("slmth")
    private String slmthRaw;

    @JsonProperty("fta")
    private String ftaRaw;

    @JsonProperty("slta")
    private String sltaRaw;

    @JsonProperty("isprc")
    private String isprcRaw;

    @JsonProperty("intr")
    private String intrRaw;

    @JsonProperty("isrr")
    private String isrrRaw;

    @JsonProperty("rpd")
    private String rpdRaw;

    @JsonProperty("print_pymint")
    private String printPymintRaw;

    @JsonProperty("mngt_cmp")
    private String mngtCmpRaw;

    @JsonProperty("cdrt_int")
    private String cdrtIntRaw;

    @JsonProperty("sbd")
    private String sbdRaw;

    @JsonProperty("pymd")
    private String pymdRaw;

    @JsonProperty("sband")
    private String sbandRaw;

    @JsonProperty("asand")
    private String asandRaw;

    @JsonProperty("asstd")
    private String asstdRaw;

    @JsonProperty("dpcrn")
    private String dpcrnRaw;

    @JsonProperty("dpcr_amt")
    private String dpcrAmtRaw;

    @JsonProperty("usarn")
    private String usarnRaw;

    @JsonProperty("usntn")
    private String usntnRaw;

    @JsonProperty("wnexpl_at")
    private String wnexplAtRaw;

    @JsonProperty("udtintnm")
    private String udtintnmRaw;

    @JsonProperty("grt_int")
    private String grtIntRaw;

    @JsonProperty("grt_amt")
    private String grtAmtRaw;

    @JsonProperty("icmg_mgknd")
    private String icmgMgkndRaw;

    @JsonProperty("icmg_mgamt")
    private String icmgMgamtRaw;

    @JsonProperty("estk_exstk")
    private String estkExstkRaw;

    @JsonProperty("estk_exrt")
    private String estkExrtRaw;

    @JsonProperty("estk_exprc")
    private String estkExprcRaw;

    @JsonProperty("estk_expd")
    private String estkExpdRaw;

    @JsonProperty("rpt_rcpn")
    private String rptRcpnRaw;

    @JsonProperty("drcb_at")
    private String drcbAtRaw;

    @JsonProperty("drcb_uast")
    private String drcbUastRaw;

    @JsonProperty("drcb_optknd")
    private String drcbOptkndRaw;

    @JsonProperty("drcb_mtd")
    private String drcbMtdRaw;

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

    /** 회차 */
    public String getTm() { return DataPreprocessor.cleanString(tmRaw); }
    public void setTmRaw(String v) { this.tmRaw = v; }

    /** 채무증권 명칭 */
    public String getBdnmn() { return DataPreprocessor.cleanString(bdnmnRaw); }
    public void setBdnmnRaw(String v) { this.bdnmnRaw = v; }

    /** 모집(매출)방법 */
    public String getSlmthRaw() { return slmthRaw; }
    public BigDecimal getSlmth() { return DataPreprocessor.parseAmount(slmthRaw); }
    public void setSlmthRaw(String v) { this.slmthRaw = v; }

    /** 권면(전자등록)총액 - 9999999999 */
    public String getFtaRaw() { return ftaRaw; }
    public BigDecimal getFta() { return DataPreprocessor.parseAmount(ftaRaw); }
    public void setFtaRaw(String v) { this.ftaRaw = v; }

    /** 모집(매출)총액 - 9999999999 */
    public String getSltaRaw() { return sltaRaw; }
    public BigDecimal getSlta() { return DataPreprocessor.parseAmount(sltaRaw); }
    public void setSltaRaw(String v) { this.sltaRaw = v; }

    /** 발행가액 - 9999999999 */
    public String getIsprcRaw() { return isprcRaw; }
    public BigDecimal getIsprc() { return DataPreprocessor.parseAmount(isprcRaw); }
    public void setIsprcRaw(String v) { this.isprcRaw = v; }

    /** 이자율 */
    public String getIntr() { return DataPreprocessor.cleanString(intrRaw); }
    public void setIntrRaw(String v) { this.intrRaw = v; }

    /** 발행수익률 */
    public String getIsrr() { return DataPreprocessor.cleanString(isrrRaw); }
    public void setIsrrRaw(String v) { this.isrrRaw = v; }

    /** 상환기일 */
    public String getRpd() { return DataPreprocessor.cleanString(rpdRaw); }
    public void setRpdRaw(String v) { this.rpdRaw = v; }

    /** 원리금지급대행기관 */
    public String getPrintPymint() { return DataPreprocessor.cleanString(printPymintRaw); }
    public void setPrintPymintRaw(String v) { this.printPymintRaw = v; }

    /** (사채)관리회사 */
    public String getMngtCmp() { return DataPreprocessor.cleanString(mngtCmpRaw); }
    public void setMngtCmpRaw(String v) { this.mngtCmpRaw = v; }

    /** 신용등급(신용평가기관) */
    public String getCdrtInt() { return DataPreprocessor.cleanString(cdrtIntRaw); }
    public void setCdrtIntRaw(String v) { this.cdrtIntRaw = v; }

    /** 청약기일 */
    public String getSbd() { return DataPreprocessor.cleanString(sbdRaw); }
    public void setSbdRaw(String v) { this.sbdRaw = v; }

    /** 납입기일 */
    public String getPymd() { return DataPreprocessor.cleanString(pymdRaw); }
    public void setPymdRaw(String v) { this.pymdRaw = v; }

    /** 청약공고일 */
    public String getSband() { return DataPreprocessor.cleanString(sbandRaw); }
    public void setSbandRaw(String v) { this.sbandRaw = v; }

    /** 배정공고일 */
    public String getAsand() { return DataPreprocessor.cleanString(asandRaw); }
    public void setAsandRaw(String v) { this.asandRaw = v; }

    /** 배정기준일 */
    public String getAsstd() { return DataPreprocessor.cleanString(asstdRaw); }
    public void setAsstdRaw(String v) { this.asstdRaw = v; }

    /** 표시통화 */
    public String getDpcrn() { return DataPreprocessor.cleanString(dpcrnRaw); }
    public void setDpcrnRaw(String v) { this.dpcrnRaw = v; }

    /** 표시통화기준발행규모 */
    public String getDpcrAmtRaw() { return dpcrAmtRaw; }
    public BigDecimal getDpcrAmt() { return DataPreprocessor.parseAmount(dpcrAmtRaw); }
    public void setDpcrAmtRaw(String v) { this.dpcrAmtRaw = v; }

    /** 사용지역 */
    public String getUsarn() { return DataPreprocessor.cleanString(usarnRaw); }
    public void setUsarnRaw(String v) { this.usarnRaw = v; }

    /** 사용국가 */
    public String getUsntn() { return DataPreprocessor.cleanString(usntnRaw); }
    public void setUsntnRaw(String v) { this.usntnRaw = v; }

    /** 원화 교환 예정 여부 */
    public String getWnexplAt() { return DataPreprocessor.cleanString(wnexplAtRaw); }
    public void setWnexplAtRaw(String v) { this.wnexplAtRaw = v; }

    /** 인수기관명 */
    public String getUdtintnm() { return DataPreprocessor.cleanString(udtintnmRaw); }
    public void setUdtintnmRaw(String v) { this.udtintnmRaw = v; }

    /** 보증을 받은 경우(보증기관) */
    public String getGrtInt() { return DataPreprocessor.cleanString(grtIntRaw); }
    public void setGrtIntRaw(String v) { this.grtIntRaw = v; }

    /** 보증을 받은 경우(보증금액) - 9999999999 */
    public String getGrtAmtRaw() { return grtAmtRaw; }
    public BigDecimal getGrtAmt() { return DataPreprocessor.parseAmount(grtAmtRaw); }
    public void setGrtAmtRaw(String v) { this.grtAmtRaw = v; }

    /** 담보 제공의 경우(담보의 종류) */
    public String getIcmgMgknd() { return DataPreprocessor.cleanString(icmgMgkndRaw); }
    public void setIcmgMgkndRaw(String v) { this.icmgMgkndRaw = v; }

    /** 담보 제공의 경우(담보금액) - 9999999999 */
    public String getIcmgMgamtRaw() { return icmgMgamtRaw; }
    public BigDecimal getIcmgMgamt() { return DataPreprocessor.parseAmount(icmgMgamtRaw); }
    public void setIcmgMgamtRaw(String v) { this.icmgMgamtRaw = v; }

    /** 지분증권과 연계된 경우(행사대상증권) */
    public String getEstkExstk() { return DataPreprocessor.cleanString(estkExstkRaw); }
    public void setEstkExstkRaw(String v) { this.estkExstkRaw = v; }

    /** 지분증권과 연계된 경우(권리행사비율) */
    public String getEstkExrtRaw() { return estkExrtRaw; }
    public BigDecimal getEstkExrt() { return DataPreprocessor.parseAmount(estkExrtRaw); }
    public void setEstkExrtRaw(String v) { this.estkExrtRaw = v; }

    /** 지분증권과 연계된 경우(권리행사가격) - 9999999999 */
    public String getEstkExprcRaw() { return estkExprcRaw; }
    public BigDecimal getEstkExprc() { return DataPreprocessor.parseAmount(estkExprcRaw); }
    public void setEstkExprcRaw(String v) { this.estkExprcRaw = v; }

    /** 지분증권과 연계된 경우(권리행사기간) */
    public String getEstkExpd() { return DataPreprocessor.cleanString(estkExpdRaw); }
    public void setEstkExpdRaw(String v) { this.estkExpdRaw = v; }

    /** 주요사항보고서(접수번호) */
    public String getRptRcpn() { return DataPreprocessor.cleanString(rptRcpnRaw); }
    public void setRptRcpnRaw(String v) { this.rptRcpnRaw = v; }

    /** 파생결합사채해당여부 */
    public String getDrcbAt() { return DataPreprocessor.cleanString(drcbAtRaw); }
    public void setDrcbAtRaw(String v) { this.drcbAtRaw = v; }

    /** 파생결합사채(기초자산) */
    public String getDrcbUast() { return DataPreprocessor.cleanString(drcbUastRaw); }
    public void setDrcbUastRaw(String v) { this.drcbUastRaw = v; }

    /** 파생결합사채(옵션종류) */
    public String getDrcbOptknd() { return DataPreprocessor.cleanString(drcbOptkndRaw); }
    public void setDrcbOptkndRaw(String v) { this.drcbOptkndRaw = v; }

    /** 파생결합사채(만기일) */
    public String getDrcbMtd() { return DataPreprocessor.cleanString(drcbMtdRaw); }
    public void setDrcbMtdRaw(String v) { this.drcbMtdRaw = v; }

}
