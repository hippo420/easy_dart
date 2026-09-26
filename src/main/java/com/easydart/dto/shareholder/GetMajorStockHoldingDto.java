package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 대량보유 상황보고 응답 DTO */
public class GetMajorStockHoldingDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("rcept_dt")
    private String rceptDtRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("report_tp")
    private String reportTpRaw;

    @JsonProperty("repror")
    private String reprorRaw;

    @JsonProperty("stkqy")
    private String stkqyRaw;

    @JsonProperty("stkqy_irds")
    private String stkqyIrdsRaw;

    @JsonProperty("stkrt")
    private String stkrtRaw;

    @JsonProperty("stkrt_irds")
    private String stkrtIrdsRaw;

    @JsonProperty("ctr_stkqy")
    private String ctrStkqyRaw;

    @JsonProperty("ctr_stkrt")
    private String ctrStkrtRaw;

    @JsonProperty("report_resn")
    private String reportResnRaw;

    // === 전처리된 접근자 ===

    /** 접수번호 - 접수번호(14자리) ※ 공시뷰어 연결에 이용예시 - PC용 : https://dart.fss.or.kr/ds */
    public String getRceptNo() { return DataPreprocessor.cleanString(rceptNoRaw); }
    public void setRceptNoRaw(String v) { this.rceptNoRaw = v; }

    /** 접수일자 - 공시 접수일자(YYYYMMDD) */
    public String getRceptDtRaw() { return rceptDtRaw; }
    public String getRceptDt() { return DataPreprocessor.formatDate(rceptDtRaw); }
    public void setRceptDtRaw(String v) { this.rceptDtRaw = v; }

    /** 고유번호 - 공시대상회사의 고유번호(8자리) */
    public String getCorpCodeRaw() { return corpCodeRaw; }
    public BigDecimal getCorpCode() { return DataPreprocessor.parseAmount(corpCodeRaw); }
    public void setCorpCodeRaw(String v) { this.corpCodeRaw = v; }

    /** 회사명 - 공시대상회사의 종목명(상장사) 또는 법인명(기타법인) */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 보고구분 - 주식등의 대량보유상황 보고구분 */
    public String getReportTp() { return DataPreprocessor.cleanString(reportTpRaw); }
    public void setReportTpRaw(String v) { this.reportTpRaw = v; }

    /** 대표보고자 */
    public String getRepror() { return DataPreprocessor.cleanString(reprorRaw); }
    public void setReprorRaw(String v) { this.reprorRaw = v; }

    /** 보유주식등의 수 */
    public String getStkqyRaw() { return stkqyRaw; }
    public BigDecimal getStkqy() { return DataPreprocessor.parseAmount(stkqyRaw); }
    public void setStkqyRaw(String v) { this.stkqyRaw = v; }

    /** 보유주식등의 증감 */
    public String getStkqyIrdsRaw() { return stkqyIrdsRaw; }
    public BigDecimal getStkqyIrds() { return DataPreprocessor.parseAmount(stkqyIrdsRaw); }
    public void setStkqyIrdsRaw(String v) { this.stkqyIrdsRaw = v; }

    /** 보유비율 */
    public String getStkrtRaw() { return stkrtRaw; }
    public BigDecimal getStkrt() { return DataPreprocessor.parseAmount(stkrtRaw); }
    public void setStkrtRaw(String v) { this.stkrtRaw = v; }

    /** 보유비율 증감 */
    public String getStkrtIrdsRaw() { return stkrtIrdsRaw; }
    public BigDecimal getStkrtIrds() { return DataPreprocessor.parseAmount(stkrtIrdsRaw); }
    public void setStkrtIrdsRaw(String v) { this.stkrtIrdsRaw = v; }

    /** 주요체결 주식등의 수 */
    public String getCtrStkqyRaw() { return ctrStkqyRaw; }
    public BigDecimal getCtrStkqy() { return DataPreprocessor.parseAmount(ctrStkqyRaw); }
    public void setCtrStkqyRaw(String v) { this.ctrStkqyRaw = v; }

    /** 주요체결 보유비율 */
    public String getCtrStkrtRaw() { return ctrStkrtRaw; }
    public BigDecimal getCtrStkrt() { return DataPreprocessor.parseAmount(ctrStkrtRaw); }
    public void setCtrStkrtRaw(String v) { this.ctrStkrtRaw = v; }

    /** 보고사유 */
    public String getReportResn() { return DataPreprocessor.cleanString(reportResnRaw); }
    public void setReportResnRaw(String v) { this.reportResnRaw = v; }

}
