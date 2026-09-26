package com.easydart.dto.shareholder;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 최대주주 변동현황 응답 DTO */
public class GetMajorShareholderChangesDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("change_on")
    private String changeOnRaw;

    @JsonProperty("mxmm_shrholdr_nm")
    private String mxmmShrholdrNmRaw;

    @JsonProperty("posesn_stock_co")
    private String posesnStockCoRaw;

    @JsonProperty("qota_rt")
    private String qotaRtRaw;

    @JsonProperty("change_cause")
    private String changeCauseRaw;

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

    /** 변동 일 - YYYY.MM.DD */
    public String getChangeOnRaw() { return changeOnRaw; }
    public String getChangeOn() { return DataPreprocessor.formatDate(changeOnRaw); }
    public void setChangeOnRaw(String v) { this.changeOnRaw = v; }

    /** 최대 주주 명 - 홍길동 */
    public String getMxmmShrholdrNm() { return DataPreprocessor.cleanString(mxmmShrholdrNmRaw); }
    public void setMxmmShrholdrNmRaw(String v) { this.mxmmShrholdrNmRaw = v; }

    /** 소유 주식 수 - 9999999999 */
    public String getPosesnStockCoRaw() { return posesnStockCoRaw; }
    public BigDecimal getPosesnStockCo() { return DataPreprocessor.parseAmount(posesnStockCoRaw); }
    public void setPosesnStockCoRaw(String v) { this.posesnStockCoRaw = v; }

    /** 지분 율 */
    public String getQotaRtRaw() { return qotaRtRaw; }
    public BigDecimal getQotaRt() { return DataPreprocessor.parseAmount(qotaRtRaw); }
    public void setQotaRtRaw(String v) { this.qotaRtRaw = v; }

    /** 변동 원인 */
    public String getChangeCause() { return DataPreprocessor.cleanString(changeCauseRaw); }
    public void setChangeCauseRaw(String v) { this.changeCauseRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
