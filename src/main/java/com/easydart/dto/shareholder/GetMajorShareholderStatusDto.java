package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 최대주주 현황 응답 DTO */
public class GetMajorShareholderStatusDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("nm")
    private String nmRaw;

    @JsonProperty("relate")
    private String relateRaw;

    @JsonProperty("stock_knd")
    private String stockKndRaw;

    @JsonProperty("bsis_posesn_stock_co")
    private String bsisPosesnStockCoRaw;

    @JsonProperty("bsis_posesn_stock_qota_rt")
    private String bsisPosesnStockQotaRtRaw;

    @JsonProperty("trmend_posesn_stock_co")
    private String trmendPosesnStockCoRaw;

    @JsonProperty("trmend_posesn_stock_qota_rt")
    private String trmendPosesnStockQotaRtRaw;

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

    /** 성명 - 홍길동 */
    public String getNm() { return DataPreprocessor.cleanString(nmRaw); }
    public void setNmRaw(String v) { this.nmRaw = v; }

    /** 관계 - 본인, 친인척 등 */
    public String getRelate() { return DataPreprocessor.cleanString(relateRaw); }
    public void setRelateRaw(String v) { this.relateRaw = v; }

    /** 주식 종류 - 보통주 등 */
    public String getStockKnd() { return DataPreprocessor.cleanString(stockKndRaw); }
    public void setStockKndRaw(String v) { this.stockKndRaw = v; }

    /** 기초 소유 주식 수 - 9999999999 */
    public String getBsisPosesnStockCoRaw() { return bsisPosesnStockCoRaw; }
    public BigDecimal getBsisPosesnStockCo() { return DataPreprocessor.parseAmount(bsisPosesnStockCoRaw); }
    public void setBsisPosesnStockCoRaw(String v) { this.bsisPosesnStockCoRaw = v; }

    /** 기초 소유 주식 지분 율 */
    public String getBsisPosesnStockQotaRtRaw() { return bsisPosesnStockQotaRtRaw; }
    public BigDecimal getBsisPosesnStockQotaRt() { return DataPreprocessor.parseAmount(bsisPosesnStockQotaRtRaw); }
    public void setBsisPosesnStockQotaRtRaw(String v) { this.bsisPosesnStockQotaRtRaw = v; }

    /** 기말 소유 주식 수 - 9999999999 */
    public String getTrmendPosesnStockCoRaw() { return trmendPosesnStockCoRaw; }
    public BigDecimal getTrmendPosesnStockCo() { return DataPreprocessor.parseAmount(trmendPosesnStockCoRaw); }
    public void setTrmendPosesnStockCoRaw(String v) { this.trmendPosesnStockCoRaw = v; }

    /** 기말 소유 주식 지분 율 */
    public String getTrmendPosesnStockQotaRtRaw() { return trmendPosesnStockQotaRtRaw; }
    public BigDecimal getTrmendPosesnStockQotaRt() { return DataPreprocessor.parseAmount(trmendPosesnStockQotaRtRaw); }
    public void setTrmendPosesnStockQotaRtRaw(String v) { this.trmendPosesnStockQotaRtRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
