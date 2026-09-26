package com.easydart.dto.financial;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 다중회사 주요 재무지표 응답 DTO */
public class GetMultiCompanyFinancialIndexDto {

    @JsonProperty("reprt_code")
    private String reprtCodeRaw;

    @JsonProperty("bsns_year")
    private String bsnsYearRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("stock_code")
    private String stockCodeRaw;

    @JsonProperty("stlm_dt")
    private String stlmDtRaw;

    @JsonProperty("idx_cl_code")
    private String idxClCodeRaw;

    @JsonProperty("idx_cl_nm")
    private String idxClNmRaw;

    @JsonProperty("idx_code")
    private String idxCodeRaw;

    @JsonProperty("idx_nm")
    private String idxNmRaw;

    @JsonProperty("idx_val")
    private String idxValRaw;

    // === 전처리된 접근자 ===

    /** 보고서 코드 - 1분기보고서 : 11013 반기보고서 : 11012 3분기보고서 : 11014 사업보고서 : 11011 */
    public String getReprtCodeRaw() { return reprtCodeRaw; }
    public BigDecimal getReprtCode() { return DataPreprocessor.parseAmount(reprtCodeRaw); }
    public void setReprtCodeRaw(String v) { this.reprtCodeRaw = v; }

    /** 사업 연도 - 2023 */
    public String getBsnsYear() { return DataPreprocessor.cleanString(bsnsYearRaw); }
    public void setBsnsYearRaw(String v) { this.bsnsYearRaw = v; }

    /** 고유번호 - 공시대상회사의 고유번호(8자리) */
    public String getCorpCodeRaw() { return corpCodeRaw; }
    public BigDecimal getCorpCode() { return DataPreprocessor.parseAmount(corpCodeRaw); }
    public void setCorpCodeRaw(String v) { this.corpCodeRaw = v; }

    /** 종목 코드 - 상장회사의 종목코드(6자리) */
    public String getStockCodeRaw() { return stockCodeRaw; }
    public BigDecimal getStockCode() { return DataPreprocessor.parseAmount(stockCodeRaw); }
    public void setStockCodeRaw(String v) { this.stockCodeRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

    /** 지표분류코드 - 수익성지표 : M210000 안정성지표 : M220000 성장성지표 : M230000 활동성지표 : M240 */
    public String getIdxClCodeRaw() { return idxClCodeRaw; }
    public BigDecimal getIdxClCode() { return DataPreprocessor.parseAmount(idxClCodeRaw); }
    public void setIdxClCodeRaw(String v) { this.idxClCodeRaw = v; }

    /** 지표분류명 - 수익성지표,안정성지표,성장성지표,활동성지표 */
    public String getIdxClNm() { return DataPreprocessor.cleanString(idxClNmRaw); }
    public void setIdxClNmRaw(String v) { this.idxClNmRaw = v; }

    /** 지표코드 - ex) M211000 */
    public String getIdxCodeRaw() { return idxCodeRaw; }
    public BigDecimal getIdxCode() { return DataPreprocessor.parseAmount(idxCodeRaw); }
    public void setIdxCodeRaw(String v) { this.idxCodeRaw = v; }

    /** 지표명 - ex) 영업이익률 */
    public String getIdxNm() { return DataPreprocessor.cleanString(idxNmRaw); }
    public void setIdxNmRaw(String v) { this.idxNmRaw = v; }

    /** 지표값 - ex) 0.256 */
    public String getIdxValRaw() { return idxValRaw; }
    public BigDecimal getIdxVal() { return DataPreprocessor.parseAmount(idxValRaw); }
    public void setIdxValRaw(String v) { this.idxValRaw = v; }

}
