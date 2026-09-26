package com.easydart.dto.personnel;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 직원 현황 응답 DTO */
public class GetEmployeeStatusDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("fo_bbm")
    private String foBbmRaw;

    @JsonProperty("sexdstn")
    private String sexdstnRaw;

    @JsonProperty("reform_bfe_emp_co_rgllbr")
    private String reformBfeEmpCoRgllbrRaw;

    @JsonProperty("reform_bfe_emp_co_cnttk")
    private String reformBfeEmpCoCnttkRaw;

    @JsonProperty("reform_bfe_emp_co_etc")
    private String reformBfeEmpCoEtcRaw;

    @JsonProperty("rgllbr_co")
    private String rgllbrCoRaw;

    @JsonProperty("rgllbr_abacpt_labrr_co")
    private String rgllbrAbacptLabrrCoRaw;

    @JsonProperty("cnttk_co")
    private String cnttkCoRaw;

    @JsonProperty("cnttk_abacpt_labrr_co")
    private String cnttkAbacptLabrrCoRaw;

    @JsonProperty("sm")
    private String smRaw;

    @JsonProperty("avrg_cnwk_sdytrn")
    private String avrgCnwkSdytrnRaw;

    @JsonProperty("fyer_salary_totamt")
    private String fyerSalaryTotamtRaw;

    @JsonProperty("jan_salary_am")
    private String janSalaryAmRaw;

    @JsonProperty("rm")
    private String rmRaw;

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

    /** 법인명 */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 사 업부문 */
    public String getFoBbm() { return DataPreprocessor.cleanString(foBbmRaw); }
    public void setFoBbmRaw(String v) { this.foBbmRaw = v; }

    /** 성별 - 남, 여 */
    public String getSexdstn() { return DataPreprocessor.cleanString(sexdstnRaw); }
    public void setSexdstnRaw(String v) { this.sexdstnRaw = v; }

    /** 개정 전 직원 수 정규직 */
    public String getReformBfeEmpCoRgllbrRaw() { return reformBfeEmpCoRgllbrRaw; }
    public BigDecimal getReformBfeEmpCoRgllbr() { return DataPreprocessor.parseAmount(reformBfeEmpCoRgllbrRaw); }
    public void setReformBfeEmpCoRgllbrRaw(String v) { this.reformBfeEmpCoRgllbrRaw = v; }

    /** 개정 전 직원 수 계약직 */
    public String getReformBfeEmpCoCnttkRaw() { return reformBfeEmpCoCnttkRaw; }
    public BigDecimal getReformBfeEmpCoCnttk() { return DataPreprocessor.parseAmount(reformBfeEmpCoCnttkRaw); }
    public void setReformBfeEmpCoCnttkRaw(String v) { this.reformBfeEmpCoCnttkRaw = v; }

    /** 개정 전 직원 수 기타 */
    public String getReformBfeEmpCoEtcRaw() { return reformBfeEmpCoEtcRaw; }
    public BigDecimal getReformBfeEmpCoEtc() { return DataPreprocessor.parseAmount(reformBfeEmpCoEtcRaw); }
    public void setReformBfeEmpCoEtcRaw(String v) { this.reformBfeEmpCoEtcRaw = v; }

    /** 정규직 수 - 상근, 비상근 */
    public String getRgllbrCoRaw() { return rgllbrCoRaw; }
    public BigDecimal getRgllbrCo() { return DataPreprocessor.parseAmount(rgllbrCoRaw); }
    public void setRgllbrCoRaw(String v) { this.rgllbrCoRaw = v; }

    /** 정규직 단시간 근로자 수 - 대표이사, 이사, 사외이사 등 */
    public String getRgllbrAbacptLabrrCoRaw() { return rgllbrAbacptLabrrCoRaw; }
    public BigDecimal getRgllbrAbacptLabrrCo() { return DataPreprocessor.parseAmount(rgllbrAbacptLabrrCoRaw); }
    public void setRgllbrAbacptLabrrCoRaw(String v) { this.rgllbrAbacptLabrrCoRaw = v; }

    /** 계약직 수 - 9999999999 */
    public String getCnttkCoRaw() { return cnttkCoRaw; }
    public BigDecimal getCnttkCo() { return DataPreprocessor.parseAmount(cnttkCoRaw); }
    public void setCnttkCoRaw(String v) { this.cnttkCoRaw = v; }

    /** 계약직 단시간 근로자 수 - 9999999999 */
    public String getCnttkAbacptLabrrCoRaw() { return cnttkAbacptLabrrCoRaw; }
    public BigDecimal getCnttkAbacptLabrrCo() { return DataPreprocessor.parseAmount(cnttkAbacptLabrrCoRaw); }
    public void setCnttkAbacptLabrrCoRaw(String v) { this.cnttkAbacptLabrrCoRaw = v; }

    /** 합계 - 9999999999 */
    public String getSm() { return DataPreprocessor.cleanString(smRaw); }
    public void setSmRaw(String v) { this.smRaw = v; }

    /** 평균 근속 연수 - 9999999999 */
    public String getAvrgCnwkSdytrnRaw() { return avrgCnwkSdytrnRaw; }
    public BigDecimal getAvrgCnwkSdytrn() { return DataPreprocessor.parseAmount(avrgCnwkSdytrnRaw); }
    public void setAvrgCnwkSdytrnRaw(String v) { this.avrgCnwkSdytrnRaw = v; }

    /** 연간 급여 총액 - 9999999999 */
    public String getFyerSalaryTotamtRaw() { return fyerSalaryTotamtRaw; }
    public BigDecimal getFyerSalaryTotamt() { return DataPreprocessor.parseAmount(fyerSalaryTotamtRaw); }
    public void setFyerSalaryTotamtRaw(String v) { this.fyerSalaryTotamtRaw = v; }

    /** 1인평균 급여 액 - 9999999999 */
    public String getJanSalaryAmRaw() { return janSalaryAmRaw; }
    public BigDecimal getJanSalaryAm() { return DataPreprocessor.parseAmount(janSalaryAmRaw); }
    public void setJanSalaryAmRaw(String v) { this.janSalaryAmRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
