package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 채권은행 등의 관리절차 개시 응답 DTO */
public class GetCreditorBankManagementStartDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("mngt_pcbg_dd")
    private String mngtPcbgDdRaw;

    @JsonProperty("mngt_int")
    private String mngtIntRaw;

    @JsonProperty("mngt_pd")
    private String mngtPdRaw;

    @JsonProperty("mngt_rs")
    private String mngtRsRaw;

    @JsonProperty("cfd")
    private String cfdRaw;

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

    /** 관리절차개시 결정일자 */
    public String getMngtPcbgDdRaw() { return mngtPcbgDdRaw; }
    public String getMngtPcbgDd() { return DataPreprocessor.formatDate(mngtPcbgDdRaw); }
    public void setMngtPcbgDdRaw(String v) { this.mngtPcbgDdRaw = v; }

    /** 관리기관 */
    public String getMngtInt() { return DataPreprocessor.cleanString(mngtIntRaw); }
    public void setMngtIntRaw(String v) { this.mngtIntRaw = v; }

    /** 관리기간 */
    public String getMngtPd() { return DataPreprocessor.cleanString(mngtPdRaw); }
    public void setMngtPdRaw(String v) { this.mngtPdRaw = v; }

    /** 관리사유 */
    public String getMngtRs() { return DataPreprocessor.cleanString(mngtRsRaw); }
    public void setMngtRsRaw(String v) { this.mngtRsRaw = v; }

    /** 확인일자 */
    public String getCfd() { return DataPreprocessor.cleanString(cfdRaw); }
    public void setCfdRaw(String v) { this.cfdRaw = v; }

}
