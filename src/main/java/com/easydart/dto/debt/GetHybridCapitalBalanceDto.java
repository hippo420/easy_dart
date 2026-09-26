package com.easydart.dto.debt;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 신종자본증권 미상환 잔액 응답 DTO */
public class GetHybridCapitalBalanceDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("remndr_exprtn1")
    private String remndrExprtn1Raw;

    @JsonProperty("remndr_exprtn2")
    private String remndrExprtn2Raw;

    @JsonProperty("yy1_below")
    private String yy1BelowRaw;

    @JsonProperty("yy1_excess_yy5_below")
    private String yy1ExcessYy5BelowRaw;

    @JsonProperty("yy5_excess_yy10_below")
    private String yy5ExcessYy10BelowRaw;

    @JsonProperty("yy10_excess_yy15_below")
    private String yy10ExcessYy15BelowRaw;

    @JsonProperty("yy15_excess_yy20_below")
    private String yy15ExcessYy20BelowRaw;

    @JsonProperty("yy20_excess_yy30_below")
    private String yy20ExcessYy30BelowRaw;

    @JsonProperty("yy30_excess")
    private String yy30ExcessRaw;

    @JsonProperty("sm")
    private String smRaw;

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

    /** 잔여만기 */
    public String getRemndrExprtn1() { return DataPreprocessor.cleanString(remndrExprtn1Raw); }
    public void setRemndrExprtn1Raw(String v) { this.remndrExprtn1Raw = v; }

    /** 잔여만기 */
    public String getRemndrExprtn2() { return DataPreprocessor.cleanString(remndrExprtn2Raw); }
    public void setRemndrExprtn2Raw(String v) { this.remndrExprtn2Raw = v; }

    /** 1년 이하 - 9999999999 */
    public String getYy1Below() { return DataPreprocessor.cleanString(yy1BelowRaw); }
    public void setYy1BelowRaw(String v) { this.yy1BelowRaw = v; }

    /** 1년초과 5년이하 - 9999999999 */
    public String getYy1ExcessYy5Below() { return DataPreprocessor.cleanString(yy1ExcessYy5BelowRaw); }
    public void setYy1ExcessYy5BelowRaw(String v) { this.yy1ExcessYy5BelowRaw = v; }

    /** 5년초과 10년이하 - 9999999999 */
    public String getYy5ExcessYy10Below() { return DataPreprocessor.cleanString(yy5ExcessYy10BelowRaw); }
    public void setYy5ExcessYy10BelowRaw(String v) { this.yy5ExcessYy10BelowRaw = v; }

    /** 10년초과 15년이하 - 9999999999 */
    public String getYy10ExcessYy15Below() { return DataPreprocessor.cleanString(yy10ExcessYy15BelowRaw); }
    public void setYy10ExcessYy15BelowRaw(String v) { this.yy10ExcessYy15BelowRaw = v; }

    /** 15년초과 20년이하 - 9999999999 */
    public String getYy15ExcessYy20Below() { return DataPreprocessor.cleanString(yy15ExcessYy20BelowRaw); }
    public void setYy15ExcessYy20BelowRaw(String v) { this.yy15ExcessYy20BelowRaw = v; }

    /** 20년초과 30년이하 - 9999999999 */
    public String getYy20ExcessYy30Below() { return DataPreprocessor.cleanString(yy20ExcessYy30BelowRaw); }
    public void setYy20ExcessYy30BelowRaw(String v) { this.yy20ExcessYy30BelowRaw = v; }

    /** 30년초과 - 9999999999 */
    public String getYy30Excess() { return DataPreprocessor.cleanString(yy30ExcessRaw); }
    public void setYy30ExcessRaw(String v) { this.yy30ExcessRaw = v; }

    /** 합계 - 9999999999 */
    public String getSm() { return DataPreprocessor.cleanString(smRaw); }
    public void setSmRaw(String v) { this.smRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
