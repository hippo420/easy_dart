package com.easydart.dto.personnel;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 이사·감사 전체의 보수현황(보수지급금액 - 유형별) 응답 DTO */
public class GetDirectorPayByTypeDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("se")
    private String seRaw;

    @JsonProperty("nmpr")
    private String nmprRaw;

    @JsonProperty("pymnt_totamt")
    private String pymntTotamtRaw;

    @JsonProperty("psn1_avrg_pymntamt")
    private String psn1AvrgPymntamtRaw;

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

    /** 회사명 - 공시대상회사명 */
    public String getCorpNameRaw() { return corpNameRaw; }
    public BigDecimal getCorpName() { return DataPreprocessor.parseAmount(corpNameRaw); }
    public void setCorpNameRaw(String v) { this.corpNameRaw = v; }

    /** 구분 */
    public String getSe() { return DataPreprocessor.cleanString(seRaw); }
    public void setSeRaw(String v) { this.seRaw = v; }

    /** 인원수 - 9999999999 */
    public String getNmpr() { return DataPreprocessor.cleanString(nmprRaw); }
    public void setNmprRaw(String v) { this.nmprRaw = v; }

    /** 보수총액 - 9999999999 */
    public String getPymntTotamtRaw() { return pymntTotamtRaw; }
    public BigDecimal getPymntTotamt() { return DataPreprocessor.parseAmount(pymntTotamtRaw); }
    public void setPymntTotamtRaw(String v) { this.pymntTotamtRaw = v; }

    /** 1인당 평균보수액 - 9999999999 */
    public String getPsn1AvrgPymntamtRaw() { return psn1AvrgPymntamtRaw; }
    public BigDecimal getPsn1AvrgPymntamt() { return DataPreprocessor.parseAmount(psn1AvrgPymntamtRaw); }
    public void setPsn1AvrgPymntamtRaw(String v) { this.psn1AvrgPymntamtRaw = v; }

    /** 비고 */
    public String getRm() { return DataPreprocessor.cleanString(rmRaw); }
    public void setRmRaw(String v) { this.rmRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
