package com.easydart.dto.personnel;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 사외이사 및 그 변동현황 응답 DTO */
public class GetOutsideDirectorStatusDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("drctr_co")
    private String drctrCoRaw;

    @JsonProperty("otcmp_drctr_co")
    private String otcmpDrctrCoRaw;

    @JsonProperty("apnt")
    private String apntRaw;

    @JsonProperty("rlsofc")
    private String rlsofcRaw;

    @JsonProperty("mdstrm_resig")
    private String mdstrmResigRaw;

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

    /** 이사의 수 - 9999999999 */
    public String getDrctrCoRaw() { return drctrCoRaw; }
    public BigDecimal getDrctrCo() { return DataPreprocessor.parseAmount(drctrCoRaw); }
    public void setDrctrCoRaw(String v) { this.drctrCoRaw = v; }

    /** 사외이사 수 - 9999999999 */
    public String getOtcmpDrctrCoRaw() { return otcmpDrctrCoRaw; }
    public BigDecimal getOtcmpDrctrCo() { return DataPreprocessor.parseAmount(otcmpDrctrCoRaw); }
    public void setOtcmpDrctrCoRaw(String v) { this.otcmpDrctrCoRaw = v; }

    /** 사외이사 변동현황(선임) - 9999999999 */
    public String getApnt() { return DataPreprocessor.cleanString(apntRaw); }
    public void setApntRaw(String v) { this.apntRaw = v; }

    /** 사외이사 변동현황(해임) - 9999999999 */
    public String getRlsofc() { return DataPreprocessor.cleanString(rlsofcRaw); }
    public void setRlsofcRaw(String v) { this.rlsofcRaw = v; }

    /** 사외이사 변동현황(중도퇴임) - 9999999999 */
    public String getMdstrmResig() { return DataPreprocessor.cleanString(mdstrmResigRaw); }
    public void setMdstrmResigRaw(String v) { this.mdstrmResigRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
