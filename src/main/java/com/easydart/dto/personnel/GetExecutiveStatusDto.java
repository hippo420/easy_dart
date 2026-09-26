package com.easydart.dto.personnel;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 임원 현황 응답 DTO */
public class GetExecutiveStatusDto {

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

    @JsonProperty("sexdstn")
    private String sexdstnRaw;

    @JsonProperty("birth_ym")
    private String birthYmRaw;

    @JsonProperty("ofcps")
    private String ofcpsRaw;

    @JsonProperty("rgist_exctv_at")
    private String rgistExctvAtRaw;

    @JsonProperty("fte_at")
    private String fteAtRaw;

    @JsonProperty("chrg_job")
    private String chrgJobRaw;

    @JsonProperty("main_career")
    private String mainCareerRaw;

    @JsonProperty("mxmm_shrholdr_relate")
    private String mxmmShrholdrRelateRaw;

    @JsonProperty("hffc_pd")
    private String hffcPdRaw;

    @JsonProperty("tenure_end_on")
    private String tenureEndOnRaw;

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

    /** 성별 - 남 */
    public String getSexdstn() { return DataPreprocessor.cleanString(sexdstnRaw); }
    public void setSexdstnRaw(String v) { this.sexdstnRaw = v; }

    /** 출생 년월 - YYYY년 MM월 */
    public String getBirthYmRaw() { return birthYmRaw; }
    public String getBirthYm() { return DataPreprocessor.formatDate(birthYmRaw); }
    public void setBirthYmRaw(String v) { this.birthYmRaw = v; }

    /** 직위 - 회장, 사장, 사외이사 등 */
    public String getOfcps() { return DataPreprocessor.cleanString(ofcpsRaw); }
    public void setOfcpsRaw(String v) { this.ofcpsRaw = v; }

    /** 등기 임원 여부 - 등기임원, 미등기임원 등 */
    public String getRgistExctvAt() { return DataPreprocessor.cleanString(rgistExctvAtRaw); }
    public void setRgistExctvAtRaw(String v) { this.rgistExctvAtRaw = v; }

    /** 상근 여부 - 상근, 비상근 */
    public String getFteAt() { return DataPreprocessor.cleanString(fteAtRaw); }
    public void setFteAtRaw(String v) { this.fteAtRaw = v; }

    /** 담당 업무 - 대표이사, 이사, 사외이사 등 */
    public String getChrgJob() { return DataPreprocessor.cleanString(chrgJobRaw); }
    public void setChrgJobRaw(String v) { this.chrgJobRaw = v; }

    /** 주요 경력 */
    public String getMainCareer() { return DataPreprocessor.cleanString(mainCareerRaw); }
    public void setMainCareerRaw(String v) { this.mainCareerRaw = v; }

    /** 최대 주주 관계 */
    public String getMxmmShrholdrRelate() { return DataPreprocessor.cleanString(mxmmShrholdrRelateRaw); }
    public void setMxmmShrholdrRelateRaw(String v) { this.mxmmShrholdrRelateRaw = v; }

    /** 재직 기간 */
    public String getHffcPd() { return DataPreprocessor.cleanString(hffcPdRaw); }
    public void setHffcPdRaw(String v) { this.hffcPdRaw = v; }

    /** 임기 만료 일 */
    public String getTenureEndOnRaw() { return tenureEndOnRaw; }
    public String getTenureEndOn() { return DataPreprocessor.formatDate(tenureEndOnRaw); }
    public void setTenureEndOnRaw(String v) { this.tenureEndOnRaw = v; }

    /** 결산기준일 - YYYY-MM-DD */
    public String getStlmDtRaw() { return stlmDtRaw; }
    public String getStlmDt() { return DataPreprocessor.formatDate(stlmDtRaw); }
    public void setStlmDtRaw(String v) { this.stlmDtRaw = v; }

}
