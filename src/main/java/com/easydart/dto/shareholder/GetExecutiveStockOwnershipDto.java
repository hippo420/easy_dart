package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 임원ㆍ주요주주 소유보고 응답 DTO */
public class GetExecutiveStockOwnershipDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("rcept_dt")
    private String rceptDtRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("repror")
    private String reprorRaw;

    @JsonProperty("isu_exctv_rgist_at")
    private String isuExctvRgistAtRaw;

    @JsonProperty("isu_exctv_ofcps")
    private String isuExctvOfcpsRaw;

    @JsonProperty("isu_main_shrholdr")
    private String isuMainShrholdrRaw;

    @JsonProperty("sp_stock_lmp_cnt")
    private String spStockLmpCntRaw;

    @JsonProperty("sp_stock_lmp_irds_cnt")
    private String spStockLmpIrdsCntRaw;

    @JsonProperty("sp_stock_lmp_rate")
    private String spStockLmpRateRaw;

    @JsonProperty("sp_stock_lmp_irds_rate")
    private String spStockLmpIrdsRateRaw;

    // === 전처리된 접근자 ===

    /** 접수번호 - 접수번호(14자리) ※ 공시뷰어 연결에 이용예시 - PC용 : https://dart.fss.or.kr/ds */
    public String getRceptNo() { return DataPreprocessor.cleanString(rceptNoRaw); }
    public void setRceptNoRaw(String v) { this.rceptNoRaw = v; }

    /** 접수일자 - 공시 접수일자(YYYY-MM-DD) */
    public String getRceptDtRaw() { return rceptDtRaw; }
    public String getRceptDt() { return DataPreprocessor.formatDate(rceptDtRaw); }
    public void setRceptDtRaw(String v) { this.rceptDtRaw = v; }

    /** 고유번호 - 공시대상회사의 고유번호(8자리) */
    public String getCorpCodeRaw() { return corpCodeRaw; }
    public BigDecimal getCorpCode() { return DataPreprocessor.parseAmount(corpCodeRaw); }
    public void setCorpCodeRaw(String v) { this.corpCodeRaw = v; }

    /** 회사명 */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 보고자 - 보고자명 */
    public String getRepror() { return DataPreprocessor.cleanString(reprorRaw); }
    public void setReprorRaw(String v) { this.reprorRaw = v; }

    /** 발행 회사 관계 임원(등기여부) - 등기임원, 비등기임원 등 */
    public String getIsuExctvRgistAt() { return DataPreprocessor.cleanString(isuExctvRgistAtRaw); }
    public void setIsuExctvRgistAtRaw(String v) { this.isuExctvRgistAtRaw = v; }

    /** 발행 회사 관계 임원 직위 - 대표이사, 이사, 전무 등 */
    public String getIsuExctvOfcps() { return DataPreprocessor.cleanString(isuExctvOfcpsRaw); }
    public void setIsuExctvOfcpsRaw(String v) { this.isuExctvOfcpsRaw = v; }

    /** 발행 회사 관계 주요 주주 - 10%이상주주 등 */
    public String getIsuMainShrholdr() { return DataPreprocessor.cleanString(isuMainShrholdrRaw); }
    public void setIsuMainShrholdrRaw(String v) { this.isuMainShrholdrRaw = v; }

    /** 특정 증권 등 소유 수 - 9999999999 */
    public String getSpStockLmpCntRaw() { return spStockLmpCntRaw; }
    public BigDecimal getSpStockLmpCnt() { return DataPreprocessor.parseAmount(spStockLmpCntRaw); }
    public void setSpStockLmpCntRaw(String v) { this.spStockLmpCntRaw = v; }

    /** 특정 증권 등 소유 증감 수 - 9999999999 */
    public String getSpStockLmpIrdsCntRaw() { return spStockLmpIrdsCntRaw; }
    public BigDecimal getSpStockLmpIrdsCnt() { return DataPreprocessor.parseAmount(spStockLmpIrdsCntRaw); }
    public void setSpStockLmpIrdsCntRaw(String v) { this.spStockLmpIrdsCntRaw = v; }

    /** 특정 증권 등 소유 비율 */
    public String getSpStockLmpRateRaw() { return spStockLmpRateRaw; }
    public BigDecimal getSpStockLmpRate() { return DataPreprocessor.parseAmount(spStockLmpRateRaw); }
    public void setSpStockLmpRateRaw(String v) { this.spStockLmpRateRaw = v; }

    /** 특정 증권 등 소유 증감 비율 */
    public String getSpStockLmpIrdsRateRaw() { return spStockLmpIrdsRateRaw; }
    public BigDecimal getSpStockLmpIrdsRate() { return DataPreprocessor.parseAmount(spStockLmpIrdsRateRaw); }
    public void setSpStockLmpIrdsRateRaw(String v) { this.spStockLmpIrdsRateRaw = v; }

}
