package com.easydart.dto.financial;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 단일회사 주요계정 응답 DTO */
public class GetSingleCompanyKeyAccountsDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("bsns_year")
    private String bsnsYearRaw;

    @JsonProperty("stock_code")
    private String stockCodeRaw;

    @JsonProperty("reprt_code")
    private String reprtCodeRaw;

    @JsonProperty("account_nm")
    private String accountNmRaw;

    @JsonProperty("fs_div")
    private String fsDivRaw;

    @JsonProperty("fs_nm")
    private String fsNmRaw;

    @JsonProperty("sj_div")
    private String sjDivRaw;

    @JsonProperty("sj_nm")
    private String sjNmRaw;

    @JsonProperty("thstrm_nm")
    private String thstrmNmRaw;

    @JsonProperty("thstrm_dt")
    private String thstrmDtRaw;

    @JsonProperty("thstrm_amount")
    private String thstrmAmountRaw;

    @JsonProperty("thstrm_add_amount")
    private String thstrmAddAmountRaw;

    @JsonProperty("frmtrm_nm")
    private String frmtrmNmRaw;

    @JsonProperty("frmtrm_dt")
    private String frmtrmDtRaw;

    @JsonProperty("frmtrm_amount")
    private String frmtrmAmountRaw;

    @JsonProperty("frmtrm_add_amount")
    private String frmtrmAddAmountRaw;

    @JsonProperty("bfefrmtrm_nm")
    private String bfefrmtrmNmRaw;

    @JsonProperty("bfefrmtrm_dt")
    private String bfefrmtrmDtRaw;

    @JsonProperty("bfefrmtrm_amount")
    private String bfefrmtrmAmountRaw;

    @JsonProperty("ord")
    private String ordRaw;

    @JsonProperty("currency")
    private String currencyRaw;

    // === 전처리된 접근자 ===

    /** 접수번호 - 접수번호(14자리) ※ 공시뷰어 연결에 이용예시 - PC용 : https://dart.fss.or.kr/ds */
    public String getRceptNo() { return DataPreprocessor.cleanString(rceptNoRaw); }
    public void setRceptNoRaw(String v) { this.rceptNoRaw = v; }

    /** 사업 연도 - 2019 */
    public String getBsnsYear() { return DataPreprocessor.cleanString(bsnsYearRaw); }
    public void setBsnsYearRaw(String v) { this.bsnsYearRaw = v; }

    /** 종목 코드 - 상장회사의 종목코드(6자리) */
    public String getStockCodeRaw() { return stockCodeRaw; }
    public BigDecimal getStockCode() { return DataPreprocessor.parseAmount(stockCodeRaw); }
    public void setStockCodeRaw(String v) { this.stockCodeRaw = v; }

    /** 보고서 코드 - 1분기보고서 : 11013 반기보고서 : 11012 3분기보고서 : 11014 사업보고서 : 11011 */
    public String getReprtCodeRaw() { return reprtCodeRaw; }
    public BigDecimal getReprtCode() { return DataPreprocessor.parseAmount(reprtCodeRaw); }
    public void setReprtCodeRaw(String v) { this.reprtCodeRaw = v; }

    /** 계정명 - ex) 자본총계 */
    public String getAccountNmRaw() { return accountNmRaw; }
    public BigDecimal getAccountNm() { return DataPreprocessor.parseAmount(accountNmRaw); }
    public void setAccountNmRaw(String v) { this.accountNmRaw = v; }

    /** 개별/연결구분 - OFS:재무제표, CFS:연결재무제표 */
    public String getFsDiv() { return DataPreprocessor.cleanString(fsDivRaw); }
    public void setFsDivRaw(String v) { this.fsDivRaw = v; }

    /** 개별/연결명 - ex) 연결재무제표 또는 재무제표 출력 */
    public String getFsNm() { return DataPreprocessor.cleanString(fsNmRaw); }
    public void setFsNmRaw(String v) { this.fsNmRaw = v; }

    /** 재무제표구분 - BS:재무상태표, IS:손익계산서 */
    public String getSjDiv() { return DataPreprocessor.cleanString(sjDivRaw); }
    public void setSjDivRaw(String v) { this.sjDivRaw = v; }

    /** 재무제표명 - ex) 재무상태표 또는 손익계산서 출력 */
    public String getSjNm() { return DataPreprocessor.cleanString(sjNmRaw); }
    public void setSjNmRaw(String v) { this.sjNmRaw = v; }

    /** 당기명 - ex) 제 13 기 3분기말 */
    public String getThstrmNm() { return DataPreprocessor.cleanString(thstrmNmRaw); }
    public void setThstrmNmRaw(String v) { this.thstrmNmRaw = v; }

    /** 당기일자 - ex) 2018.09.30 현재 */
    public String getThstrmDtRaw() { return thstrmDtRaw; }
    public String getThstrmDt() { return DataPreprocessor.formatDate(thstrmDtRaw); }
    public void setThstrmDtRaw(String v) { this.thstrmDtRaw = v; }

    /** 당기금액 - 9999999999 */
    public String getThstrmAmountRaw() { return thstrmAmountRaw; }
    public BigDecimal getThstrmAmount() { return DataPreprocessor.parseAmount(thstrmAmountRaw); }
    public void setThstrmAmountRaw(String v) { this.thstrmAmountRaw = v; }

    /** 당기누적금액 - 9999999999 */
    public String getThstrmAddAmountRaw() { return thstrmAddAmountRaw; }
    public BigDecimal getThstrmAddAmount() { return DataPreprocessor.parseAmount(thstrmAddAmountRaw); }
    public void setThstrmAddAmountRaw(String v) { this.thstrmAddAmountRaw = v; }

    /** 전기명 - ex) 제 12 기말 */
    public String getFrmtrmNm() { return DataPreprocessor.cleanString(frmtrmNmRaw); }
    public void setFrmtrmNmRaw(String v) { this.frmtrmNmRaw = v; }

    /** 전기일자 - ex) 2017.01.01 ~ 2017.12.31 */
    public String getFrmtrmDtRaw() { return frmtrmDtRaw; }
    public String getFrmtrmDt() { return DataPreprocessor.formatDate(frmtrmDtRaw); }
    public void setFrmtrmDtRaw(String v) { this.frmtrmDtRaw = v; }

    /** 전기금액 - 9999999999 */
    public String getFrmtrmAmountRaw() { return frmtrmAmountRaw; }
    public BigDecimal getFrmtrmAmount() { return DataPreprocessor.parseAmount(frmtrmAmountRaw); }
    public void setFrmtrmAmountRaw(String v) { this.frmtrmAmountRaw = v; }

    /** 전기누적금액 - 9999999999 */
    public String getFrmtrmAddAmountRaw() { return frmtrmAddAmountRaw; }
    public BigDecimal getFrmtrmAddAmount() { return DataPreprocessor.parseAmount(frmtrmAddAmountRaw); }
    public void setFrmtrmAddAmountRaw(String v) { this.frmtrmAddAmountRaw = v; }

    /** 전전기명 - ex) 제 11 기말(※ 사업보고서의 경우에만 출력) */
    public String getBfefrmtrmNm() { return DataPreprocessor.cleanString(bfefrmtrmNmRaw); }
    public void setBfefrmtrmNmRaw(String v) { this.bfefrmtrmNmRaw = v; }

    /** 전전기일자 - ex) 2016.12.31 현재(※ 사업보고서의 경우에만 출력) */
    public String getBfefrmtrmDtRaw() { return bfefrmtrmDtRaw; }
    public String getBfefrmtrmDt() { return DataPreprocessor.formatDate(bfefrmtrmDtRaw); }
    public void setBfefrmtrmDtRaw(String v) { this.bfefrmtrmDtRaw = v; }

    /** 전전기금액 - 9,999,999,999(※ 사업보고서의 경우에만 출력) */
    public String getBfefrmtrmAmountRaw() { return bfefrmtrmAmountRaw; }
    public BigDecimal getBfefrmtrmAmount() { return DataPreprocessor.parseAmount(bfefrmtrmAmountRaw); }
    public void setBfefrmtrmAmountRaw(String v) { this.bfefrmtrmAmountRaw = v; }

    /** 계정과목 정렬순서 */
    public String getOrd() { return DataPreprocessor.cleanString(ordRaw); }
    public void setOrdRaw(String v) { this.ordRaw = v; }

    /** 통화 단위 */
    public String getCurrency() { return DataPreprocessor.cleanString(currencyRaw); }
    public void setCurrencyRaw(String v) { this.currencyRaw = v; }

}
