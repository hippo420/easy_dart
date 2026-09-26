package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 회생절차 개시신청 응답 DTO */
public class GetReorganizationApplicationDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("apcnt")
    private String apcntRaw;

    @JsonProperty("cpct")
    private String cpctRaw;

    @JsonProperty("rq_rs")
    private String rqRsRaw;

    @JsonProperty("rqd")
    private String rqdRaw;

    @JsonProperty("ft_ctp_sc")
    private String ftCtpScRaw;

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

    /** 신청인 (회사와의 관계) */
    public String getApcntRaw() { return apcntRaw; }
    public BigDecimal getApcnt() { return DataPreprocessor.parseAmount(apcntRaw); }
    public void setApcntRaw(String v) { this.apcntRaw = v; }

    /** 관할법원 */
    public String getCpct() { return DataPreprocessor.cleanString(cpctRaw); }
    public void setCpctRaw(String v) { this.cpctRaw = v; }

    /** 신청사유 */
    public String getRqRs() { return DataPreprocessor.cleanString(rqRsRaw); }
    public void setRqRsRaw(String v) { this.rqRsRaw = v; }

    /** 신청일자 */
    public String getRqd() { return DataPreprocessor.cleanString(rqdRaw); }
    public void setRqdRaw(String v) { this.rqdRaw = v; }

    /** 향후대책 및 일정 */
    public String getFtCtpSc() { return DataPreprocessor.cleanString(ftCtpScRaw); }
    public void setFtCtpScRaw(String v) { this.ftCtpScRaw = v; }

}
