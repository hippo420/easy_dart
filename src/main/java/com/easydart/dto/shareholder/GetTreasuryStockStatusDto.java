package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 자기주식 취득 및 처분 현황 응답 DTO */
public class GetTreasuryStockStatusDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("acqs_mth1")
    private String acqsMth1Raw;

    @JsonProperty("acqs_mth2")
    private String acqsMth2Raw;

    @JsonProperty("acqs_mth3")
    private String acqsMth3Raw;

    @JsonProperty("stock_knd")
    private String stockKndRaw;

    @JsonProperty("bsis_qy")
    private String bsisQyRaw;

    @JsonProperty("change_qy_acqs")
    private String changeQyAcqsRaw;

    @JsonProperty("change_qy_dsps")
    private String changeQyDspsRaw;

    @JsonProperty("change_qy_incnr")
    private String changeQyIncnrRaw;

    @JsonProperty("trmend_qy")
    private String trmendQyRaw;

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

    /** 취득방법 대분류 - 배당가능이익범위 이내 취득, 기타취득, 총계 등 */
    public String getAcqsMth1() { return DataPreprocessor.cleanString(acqsMth1Raw); }
    public void setAcqsMth1Raw(String v) { this.acqsMth1Raw = v; }

    /** 취득방법 중분류 - 직접취득, 신탁계약에 의한취득, 기타취득, 총계 등 */
    public String getAcqsMth2() { return DataPreprocessor.cleanString(acqsMth2Raw); }
    public void setAcqsMth2Raw(String v) { this.acqsMth2Raw = v; }

    /** 취득방법 소분류 - 장내직접취득, 장외직접취득, 공개매수, 주식매수청구권행사, 수탁자보유물량, 현물보유량, 기타취득, 소계, 총 */
    public String getAcqsMth3() { return DataPreprocessor.cleanString(acqsMth3Raw); }
    public void setAcqsMth3Raw(String v) { this.acqsMth3Raw = v; }

    /** 주식 종류 - 보통주, 우선주 등 */
    public String getStockKnd() { return DataPreprocessor.cleanString(stockKndRaw); }
    public void setStockKndRaw(String v) { this.stockKndRaw = v; }

    /** 기초 수량 - 9999999999 */
    public String getBsisQyRaw() { return bsisQyRaw; }
    public BigDecimal getBsisQy() { return DataPreprocessor.parseAmount(bsisQyRaw); }
    public void setBsisQyRaw(String v) { this.bsisQyRaw = v; }

    /** 변동 수량 취득 - 9999999999 */
    public String getChangeQyAcqsRaw() { return changeQyAcqsRaw; }
    public BigDecimal getChangeQyAcqs() { return DataPreprocessor.parseAmount(changeQyAcqsRaw); }
    public void setChangeQyAcqsRaw(String v) { this.changeQyAcqsRaw = v; }

    /** 변동 수량 처분 - 9999999999 */
    public String getChangeQyDspsRaw() { return changeQyDspsRaw; }
    public BigDecimal getChangeQyDsps() { return DataPreprocessor.parseAmount(changeQyDspsRaw); }
    public void setChangeQyDspsRaw(String v) { this.changeQyDspsRaw = v; }

    /** 변동 수량 소각 - 9999999999 */
    public String getChangeQyIncnrRaw() { return changeQyIncnrRaw; }
    public BigDecimal getChangeQyIncnr() { return DataPreprocessor.parseAmount(changeQyIncnrRaw); }
    public void setChangeQyIncnrRaw(String v) { this.changeQyIncnrRaw = v; }

    /** 기말 수량 - 9999999999 */
    public String getTrmendQyRaw() { return trmendQyRaw; }
    public BigDecimal getTrmendQy() { return DataPreprocessor.parseAmount(trmendQyRaw); }
    public void setTrmendQyRaw(String v) { this.trmendQyRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
