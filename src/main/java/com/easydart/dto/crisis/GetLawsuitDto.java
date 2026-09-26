package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 소송 등의 제기 응답 DTO */
public class GetLawsuitDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("icnm")
    private String icnmRaw;

    @JsonProperty("ac_ap")
    private String acApRaw;

    @JsonProperty("rq_cn")
    private String rqCnRaw;

    @JsonProperty("cpct")
    private String cpctRaw;

    @JsonProperty("ft_ctp")
    private String ftCtpRaw;

    @JsonProperty("lgd")
    private String lgdRaw;

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

    /** 사건의 명칭 */
    public String getIcnm() { return DataPreprocessor.cleanString(icnmRaw); }
    public void setIcnmRaw(String v) { this.icnmRaw = v; }

    /** 원고ㆍ신청인 */
    public String getAcAp() { return DataPreprocessor.cleanString(acApRaw); }
    public void setAcApRaw(String v) { this.acApRaw = v; }

    /** 청구내용 */
    public String getRqCn() { return DataPreprocessor.cleanString(rqCnRaw); }
    public void setRqCnRaw(String v) { this.rqCnRaw = v; }

    /** 관할법원 */
    public String getCpct() { return DataPreprocessor.cleanString(cpctRaw); }
    public void setCpctRaw(String v) { this.cpctRaw = v; }

    /** 향후대책 */
    public String getFtCtp() { return DataPreprocessor.cleanString(ftCtpRaw); }
    public void setFtCtpRaw(String v) { this.ftCtpRaw = v; }

    /** 제기일자 */
    public String getLgdRaw() { return lgdRaw; }
    public String getLgd() { return DataPreprocessor.formatDate(lgdRaw); }
    public void setLgdRaw(String v) { this.lgdRaw = v; }

    /** 확인일자 */
    public String getCfd() { return DataPreprocessor.cleanString(cfdRaw); }
    public void setCfdRaw(String v) { this.cfdRaw = v; }

}
