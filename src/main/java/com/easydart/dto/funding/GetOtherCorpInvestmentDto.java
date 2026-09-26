package com.easydart.dto.funding;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 타법인 출자현황 응답 DTO */
public class GetOtherCorpInvestmentDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("inv_prm")
    private String invPrmRaw;

    @JsonProperty("frst_acqs_de")
    private String frstAcqsDeRaw;

    @JsonProperty("invstmnt_purps")
    private String invstmntPurpsRaw;

    @JsonProperty("frst_acqs_amount")
    private String frstAcqsAmountRaw;

    @JsonProperty("bsis_blce_qy")
    private String bsisBlceQyRaw;

    @JsonProperty("bsis_blce_qota_rt")
    private String bsisBlceQotaRtRaw;

    @JsonProperty("bsis_blce_acntbk_amount")
    private String bsisBlceAcntbkAmountRaw;

    @JsonProperty("incrs_dcrs_acqs_dsps_qy")
    private String incrsDcrsAcqsDspsQyRaw;

    @JsonProperty("incrs_dcrs_acqs_dsps_amount")
    private String incrsDcrsAcqsDspsAmountRaw;

    @JsonProperty("incrs_dcrs_evl_lstmn")
    private String incrsDcrsEvlLstmnRaw;

    @JsonProperty("trmend_blce_qy")
    private String trmendBlceQyRaw;

    @JsonProperty("trmend_blce_qota_rt")
    private String trmendBlceQotaRtRaw;

    @JsonProperty("trmend_blce_acntbk_amount")
    private String trmendBlceAcntbkAmountRaw;

    @JsonProperty("recent_bsns_year_fnnr_sttus_tot_assets")
    private String recentBsnsYearFnnrSttusTotAssetsRaw;

    @JsonProperty("recent_bsns_year_fnnr_sttus_thstrm_ntpf")
    private String recentBsnsYearFnnrSttusThstrmNtpfRaw;

    @JsonProperty("stlm_dt")
    private String stlmDtRaw;

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

    /** 법인명 */
    public String getInvPrm() { return DataPreprocessor.cleanString(invPrmRaw); }
    public void setInvPrmRaw(String v) { this.invPrmRaw = v; }

    /** 최초 취득 일자 - 최초취득일자(YYYYMMDD) */
    public String getFrstAcqsDeRaw() { return frstAcqsDeRaw; }
    public String getFrstAcqsDe() { return DataPreprocessor.formatDate(frstAcqsDeRaw); }
    public void setFrstAcqsDeRaw(String v) { this.frstAcqsDeRaw = v; }

    /** 출자 목적 - 출자목적(자회사 등) */
    public String getInvstmntPurps() { return DataPreprocessor.cleanString(invstmntPurpsRaw); }
    public void setInvstmntPurpsRaw(String v) { this.invstmntPurpsRaw = v; }

    /** 최초 취득 금액 - 9999999999 */
    public String getFrstAcqsAmountRaw() { return frstAcqsAmountRaw; }
    public BigDecimal getFrstAcqsAmount() { return DataPreprocessor.parseAmount(frstAcqsAmountRaw); }
    public void setFrstAcqsAmountRaw(String v) { this.frstAcqsAmountRaw = v; }

    /** 기초 잔액 수량 - 9999999999 */
    public String getBsisBlceQyRaw() { return bsisBlceQyRaw; }
    public BigDecimal getBsisBlceQy() { return DataPreprocessor.parseAmount(bsisBlceQyRaw); }
    public void setBsisBlceQyRaw(String v) { this.bsisBlceQyRaw = v; }

    /** 기초 잔액 지분 율 */
    public String getBsisBlceQotaRtRaw() { return bsisBlceQotaRtRaw; }
    public BigDecimal getBsisBlceQotaRt() { return DataPreprocessor.parseAmount(bsisBlceQotaRtRaw); }
    public void setBsisBlceQotaRtRaw(String v) { this.bsisBlceQotaRtRaw = v; }

    /** 기초 잔액 장부 가액 - 9999999999 */
    public String getBsisBlceAcntbkAmountRaw() { return bsisBlceAcntbkAmountRaw; }
    public BigDecimal getBsisBlceAcntbkAmount() { return DataPreprocessor.parseAmount(bsisBlceAcntbkAmountRaw); }
    public void setBsisBlceAcntbkAmountRaw(String v) { this.bsisBlceAcntbkAmountRaw = v; }

    /** 증가 감소 취득 처분 수량 - 9999999999 */
    public String getIncrsDcrsAcqsDspsQyRaw() { return incrsDcrsAcqsDspsQyRaw; }
    public BigDecimal getIncrsDcrsAcqsDspsQy() { return DataPreprocessor.parseAmount(incrsDcrsAcqsDspsQyRaw); }
    public void setIncrsDcrsAcqsDspsQyRaw(String v) { this.incrsDcrsAcqsDspsQyRaw = v; }

    /** 증가 감소 취득 처분 금액 - 9999999999 */
    public String getIncrsDcrsAcqsDspsAmountRaw() { return incrsDcrsAcqsDspsAmountRaw; }
    public BigDecimal getIncrsDcrsAcqsDspsAmount() { return DataPreprocessor.parseAmount(incrsDcrsAcqsDspsAmountRaw); }
    public void setIncrsDcrsAcqsDspsAmountRaw(String v) { this.incrsDcrsAcqsDspsAmountRaw = v; }

    /** 증가 감소 평가 손액 - 9999999999 */
    public String getIncrsDcrsEvlLstmn() { return DataPreprocessor.cleanString(incrsDcrsEvlLstmnRaw); }
    public void setIncrsDcrsEvlLstmnRaw(String v) { this.incrsDcrsEvlLstmnRaw = v; }

    /** 기말 잔액 수량 - 9999999999 */
    public String getTrmendBlceQyRaw() { return trmendBlceQyRaw; }
    public BigDecimal getTrmendBlceQy() { return DataPreprocessor.parseAmount(trmendBlceQyRaw); }
    public void setTrmendBlceQyRaw(String v) { this.trmendBlceQyRaw = v; }

    /** 기말 잔액 지분 율 */
    public String getTrmendBlceQotaRtRaw() { return trmendBlceQotaRtRaw; }
    public BigDecimal getTrmendBlceQotaRt() { return DataPreprocessor.parseAmount(trmendBlceQotaRtRaw); }
    public void setTrmendBlceQotaRtRaw(String v) { this.trmendBlceQotaRtRaw = v; }

    /** 기말 잔액 장부 가액 - 9999999999 */
    public String getTrmendBlceAcntbkAmountRaw() { return trmendBlceAcntbkAmountRaw; }
    public BigDecimal getTrmendBlceAcntbkAmount() { return DataPreprocessor.parseAmount(trmendBlceAcntbkAmountRaw); }
    public void setTrmendBlceAcntbkAmountRaw(String v) { this.trmendBlceAcntbkAmountRaw = v; }

    /** 최근 사업 연도 재무 현황 총 자산 - 9999999999 */
    public String getRecentBsnsYearFnnrSttusTotAssets() { return DataPreprocessor.cleanString(recentBsnsYearFnnrSttusTotAssetsRaw); }
    public void setRecentBsnsYearFnnrSttusTotAssetsRaw(String v) { this.recentBsnsYearFnnrSttusTotAssetsRaw = v; }

    /** 최근 사업 연도 재무 현황 당기 순이익 - 9999999999 */
    public String getRecentBsnsYearFnnrSttusThstrmNtpf() { return DataPreprocessor.cleanString(recentBsnsYearFnnrSttusThstrmNtpfRaw); }
    public void setRecentBsnsYearFnnrSttusThstrmNtpfRaw(String v) { this.recentBsnsYearFnnrSttusThstrmNtpfRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
