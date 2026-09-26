package com.easydart.dto.financial;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 단일회사 전체 재무제표 응답 DTO */
public class GetSingleCompanyFullFinancialsDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("reprt_code")
    private String reprtCodeRaw;

    @JsonProperty("bsns_year")
    private String bsnsYearRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("sj_div")
    private String sjDivRaw;

    @JsonProperty("sj_nm")
    private String sjNmRaw;

    @JsonProperty("account_id")
    private String accountIdRaw;

    @JsonProperty("account_nm")
    private String accountNmRaw;

    @JsonProperty("account_detail")
    private String accountDetailRaw;

    @JsonProperty("thstrm_nm")
    private String thstrmNmRaw;

    @JsonProperty("thstrm_amount")
    private String thstrmAmountRaw;

    @JsonProperty("thstrm_add_amount")
    private String thstrmAddAmountRaw;

    @JsonProperty("frmtrm_nm")
    private String frmtrmNmRaw;

    @JsonProperty("frmtrm_amount")
    private String frmtrmAmountRaw;

    @JsonProperty("frmtrm_q_nm")
    private String frmtrmQNmRaw;

    @JsonProperty("frmtrm_q_amount")
    private String frmtrmQAmountRaw;

    @JsonProperty("frmtrm_add_amount")
    private String frmtrmAddAmountRaw;

    @JsonProperty("bfefrmtrm_nm")
    private String bfefrmtrmNmRaw;

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

    /** 보고서 코드 - 1분기보고서 : 11013 반기보고서 : 11012 3분기보고서 : 11014 사업보고서 : 11011 */
    public String getReprtCodeRaw() { return reprtCodeRaw; }
    public BigDecimal getReprtCode() { return DataPreprocessor.parseAmount(reprtCodeRaw); }
    public void setReprtCodeRaw(String v) { this.reprtCodeRaw = v; }

    /** 사업 연도 - 2018 */
    public String getBsnsYear() { return DataPreprocessor.cleanString(bsnsYearRaw); }
    public void setBsnsYearRaw(String v) { this.bsnsYearRaw = v; }

    /** 고유번호 - 공시대상회사의 고유번호(8자리) */
    public String getCorpCodeRaw() { return corpCodeRaw; }
    public BigDecimal getCorpCode() { return DataPreprocessor.parseAmount(corpCodeRaw); }
    public void setCorpCodeRaw(String v) { this.corpCodeRaw = v; }

    /** 재무제표구분 - BS : 재무상태표 IS : 손익계산서 CIS : 포괄손익계산서 CF : 현금흐름표 SCE : 자본변동표 */
    public String getSjDiv() { return DataPreprocessor.cleanString(sjDivRaw); }
    public void setSjDivRaw(String v) { this.sjDivRaw = v; }

    /** 재무제표명 - ex) 재무상태표 또는 손익계산서 출력 */
    public String getSjNm() { return DataPreprocessor.cleanString(sjNmRaw); }
    public void setSjNmRaw(String v) { this.sjNmRaw = v; }

    /** 계정ID - XBRL 표준계정ID ※ 표준계정ID가 아닐경우 ""-표준계정코드 미사용-"" 표시 */
    public String getAccountIdRaw() { return accountIdRaw; }
    public BigDecimal getAccountId() { return DataPreprocessor.parseAmount(accountIdRaw); }
    public void setAccountIdRaw(String v) { this.accountIdRaw = v; }

    /** 계정명 - 계정명칭 ex) 자본총계 */
    public String getAccountNmRaw() { return accountNmRaw; }
    public BigDecimal getAccountNm() { return DataPreprocessor.parseAmount(accountNmRaw); }
    public void setAccountNmRaw(String v) { this.accountNmRaw = v; }

    /** 계정상세 - ※ 자본변동표에만 출력 ex) 계정 상세명칭 예시 - 자본 [member]|지배기업 소유주지분 - 자본 [m */
    public String getAccountDetailRaw() { return accountDetailRaw; }
    public BigDecimal getAccountDetail() { return DataPreprocessor.parseAmount(accountDetailRaw); }
    public void setAccountDetailRaw(String v) { this.accountDetailRaw = v; }

    /** 당기명 - ex) 제 13 기 */
    public String getThstrmNm() { return DataPreprocessor.cleanString(thstrmNmRaw); }
    public void setThstrmNmRaw(String v) { this.thstrmNmRaw = v; }

    /** 당기금액 - 9,999,999,999 ※ 분/반기 보고서이면서 (포괄)손익계산서 일 경우 [3개월] 금액 */
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

    /** 전기금액 - 9999999999 */
    public String getFrmtrmAmountRaw() { return frmtrmAmountRaw; }
    public BigDecimal getFrmtrmAmount() { return DataPreprocessor.parseAmount(frmtrmAmountRaw); }
    public void setFrmtrmAmountRaw(String v) { this.frmtrmAmountRaw = v; }

    /** 전기명(분/반기) - ex) 제 18 기 반기 */
    public String getFrmtrmQNm() { return DataPreprocessor.cleanString(frmtrmQNmRaw); }
    public void setFrmtrmQNmRaw(String v) { this.frmtrmQNmRaw = v; }

    /** 전기금액(분/반기) - 9,999,999,999 ※ 분/반기 보고서이면서 (포괄)손익계산서 일 경우 [3개월] 금액 */
    public String getFrmtrmQAmountRaw() { return frmtrmQAmountRaw; }
    public BigDecimal getFrmtrmQAmount() { return DataPreprocessor.parseAmount(frmtrmQAmountRaw); }
    public void setFrmtrmQAmountRaw(String v) { this.frmtrmQAmountRaw = v; }

    /** 전기누적금액 - 9999999999 */
    public String getFrmtrmAddAmountRaw() { return frmtrmAddAmountRaw; }
    public BigDecimal getFrmtrmAddAmount() { return DataPreprocessor.parseAmount(frmtrmAddAmountRaw); }
    public void setFrmtrmAddAmountRaw(String v) { this.frmtrmAddAmountRaw = v; }

    /** 전전기명 - ex) 제 11 기말(※ 사업보고서의 경우에만 출력) */
    public String getBfefrmtrmNm() { return DataPreprocessor.cleanString(bfefrmtrmNmRaw); }
    public void setBfefrmtrmNmRaw(String v) { this.bfefrmtrmNmRaw = v; }

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
