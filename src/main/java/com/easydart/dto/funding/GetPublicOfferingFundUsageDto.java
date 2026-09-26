package com.easydart.dto.funding;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 공모자금의 사용내역 응답 DTO */
public class GetPublicOfferingFundUsageDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("se_nm")
    private String seNmRaw;

    @JsonProperty("tm")
    private String tmRaw;

    @JsonProperty("pay_de")
    private String payDeRaw;

    @JsonProperty("pay_amount")
    private String payAmountRaw;

    @JsonProperty("on_dclrt_cptal_use_plan")
    private String onDclrtCptalUsePlanRaw;

    @JsonProperty("real_cptal_use_sttus")
    private String realCptalUseSttusRaw;

    @JsonProperty("rs_cptal_use_plan_useprps")
    private String rsCptalUsePlanUseprpsRaw;

    @JsonProperty("rs_cptal_use_plan_prcure_amount")
    private String rsCptalUsePlanPrcureAmountRaw;

    @JsonProperty("real_cptal_use_dtls_cn")
    private String realCptalUseDtlsCnRaw;

    @JsonProperty("real_cptal_use_dtls_amount")
    private String realCptalUseDtlsAmountRaw;

    @JsonProperty("dffrnc_occrrnc_resn")
    private String dffrncOccrrncResnRaw;

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

    /** 구분 */
    public String getSeNm() { return DataPreprocessor.cleanString(seNmRaw); }
    public void setSeNmRaw(String v) { this.seNmRaw = v; }

    /** 회차 - 회차 ③ 2019년 12월 9일부터 추가됨 */
    public String getTm() { return DataPreprocessor.cleanString(tmRaw); }
    public void setTmRaw(String v) { this.tmRaw = v; }

    /** 납입일 */
    public String getPayDeRaw() { return payDeRaw; }
    public String getPayDe() { return DataPreprocessor.formatDate(payDeRaw); }
    public void setPayDeRaw(String v) { this.payDeRaw = v; }

    /** 납입금액 - 9,999,999,999 ① 2018년 1월 18일까지 사용됨 */
    public String getPayAmountRaw() { return payAmountRaw; }
    public BigDecimal getPayAmount() { return DataPreprocessor.parseAmount(payAmountRaw); }
    public void setPayAmountRaw(String v) { this.payAmountRaw = v; }

    /** 신고서상 자금사용 계획 - 신고서상 자금사용 계획 ① 2018년 1월 18일까지 사용됨 */
    public String getOnDclrtCptalUsePlanRaw() { return onDclrtCptalUsePlanRaw; }
    public BigDecimal getOnDclrtCptalUsePlan() { return DataPreprocessor.parseAmount(onDclrtCptalUsePlanRaw); }
    public void setOnDclrtCptalUsePlanRaw(String v) { this.onDclrtCptalUsePlanRaw = v; }

    /** 실제 자금사용 현황 - 실제 자금사용 현황 ① 2018년 1월 18일까지 사용됨 */
    public String getRealCptalUseSttusRaw() { return realCptalUseSttusRaw; }
    public BigDecimal getRealCptalUseSttus() { return DataPreprocessor.parseAmount(realCptalUseSttusRaw); }
    public void setRealCptalUseSttusRaw(String v) { this.realCptalUseSttusRaw = v; }

    /** 증권신고서 등의 자금사용 계획(사용용도) - 증권신고서 등의 자금사용 계획(사용용도) ② 2018년 1월 19일부터 추가됨 */
    public String getRsCptalUsePlanUseprpsRaw() { return rsCptalUsePlanUseprpsRaw; }
    public BigDecimal getRsCptalUsePlanUseprps() { return DataPreprocessor.parseAmount(rsCptalUsePlanUseprpsRaw); }
    public void setRsCptalUsePlanUseprpsRaw(String v) { this.rsCptalUsePlanUseprpsRaw = v; }

    /** 증권신고서 등의 자금사용 계획(조달금액) - 9,999,999,999 ② 2018년 1월 19일부터 추가됨 */
    public String getRsCptalUsePlanPrcureAmountRaw() { return rsCptalUsePlanPrcureAmountRaw; }
    public BigDecimal getRsCptalUsePlanPrcureAmount() { return DataPreprocessor.parseAmount(rsCptalUsePlanPrcureAmountRaw); }
    public void setRsCptalUsePlanPrcureAmountRaw(String v) { this.rsCptalUsePlanPrcureAmountRaw = v; }

    /** 실제 자금사용 내역(내용) - 실제 자금사용 내역(내용) ② 2018년 1월 19일부터 추가됨 */
    public String getRealCptalUseDtlsCnRaw() { return realCptalUseDtlsCnRaw; }
    public BigDecimal getRealCptalUseDtlsCn() { return DataPreprocessor.parseAmount(realCptalUseDtlsCnRaw); }
    public void setRealCptalUseDtlsCnRaw(String v) { this.realCptalUseDtlsCnRaw = v; }

    /** 실제 자금사용 내역(금액) - 9,999,999,999 ② 2018년 1월 19일부터 추가됨 */
    public String getRealCptalUseDtlsAmountRaw() { return realCptalUseDtlsAmountRaw; }
    public BigDecimal getRealCptalUseDtlsAmount() { return DataPreprocessor.parseAmount(realCptalUseDtlsAmountRaw); }
    public void setRealCptalUseDtlsAmountRaw(String v) { this.realCptalUseDtlsAmountRaw = v; }

    /** 차이발생 사유 등 */
    public String getDffrncOccrrncResn() { return DataPreprocessor.cleanString(dffrncOccrrncResnRaw); }
    public void setDffrncOccrrncResnRaw(String v) { this.dffrncOccrrncResnRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
