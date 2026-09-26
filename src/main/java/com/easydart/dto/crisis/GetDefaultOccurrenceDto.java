package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 부도발생 응답 DTO */
public class GetDefaultOccurrenceDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("df_cn")
    private String dfCnRaw;

    @JsonProperty("df_amt")
    private String dfAmtRaw;

    @JsonProperty("df_bnk")
    private String dfBnkRaw;

    @JsonProperty("dfd")
    private String dfdRaw;

    @JsonProperty("df_rs")
    private String dfRsRaw;

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

    /** 부도내용 */
    public String getDfCn() { return DataPreprocessor.cleanString(dfCnRaw); }
    public void setDfCnRaw(String v) { this.dfCnRaw = v; }

    /** 부도금액 - 9999999999 */
    public String getDfAmtRaw() { return dfAmtRaw; }
    public BigDecimal getDfAmt() { return DataPreprocessor.parseAmount(dfAmtRaw); }
    public void setDfAmtRaw(String v) { this.dfAmtRaw = v; }

    /** 부도발생은행 */
    public String getDfBnk() { return DataPreprocessor.cleanString(dfBnkRaw); }
    public void setDfBnkRaw(String v) { this.dfBnkRaw = v; }

    /** 최종부도(당좌거래정지)일자 */
    public String getDfd() { return DataPreprocessor.cleanString(dfdRaw); }
    public void setDfdRaw(String v) { this.dfdRaw = v; }

    /** 부도사유 및 경위 */
    public String getDfRs() { return DataPreprocessor.cleanString(dfRsRaw); }
    public void setDfRsRaw(String v) { this.dfRsRaw = v; }

}
