package com.easydart.dto.overseas;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 해외 증권시장 주권등 상장폐지 결정 응답 DTO */
public class GetOverseasDelistingDecisionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("dlststk_ostk_cnt")
    private String dlststkOstkCntRaw;

    @JsonProperty("dlststk_estk_cnt")
    private String dlststkEstkCntRaw;

    @JsonProperty("lstex_nt")
    private String lstexNtRaw;

    @JsonProperty("dlstrq_prd")
    private String dlstrqPrdRaw;

    @JsonProperty("dlst_prd")
    private String dlstPrdRaw;

    @JsonProperty("dlst_rs")
    private String dlstRsRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("od_a_at_t")
    private String odAAtTRaw;

    @JsonProperty("od_a_at_b")
    private String odAAtBRaw;

    @JsonProperty("adt_a_atn")
    private String adtAAtnRaw;

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

    /** 상장폐지주식 종류ㆍ수(주)(보통주식) - 9999999999 */
    public String getDlststkOstkCntRaw() { return dlststkOstkCntRaw; }
    public BigDecimal getDlststkOstkCnt() { return DataPreprocessor.parseAmount(dlststkOstkCntRaw); }
    public void setDlststkOstkCntRaw(String v) { this.dlststkOstkCntRaw = v; }

    /** 상장폐지주식 종류ㆍ수(주)(기타주식) - 9999999999 */
    public String getDlststkEstkCntRaw() { return dlststkEstkCntRaw; }
    public BigDecimal getDlststkEstkCnt() { return DataPreprocessor.parseAmount(dlststkEstkCntRaw); }
    public void setDlststkEstkCntRaw(String v) { this.dlststkEstkCntRaw = v; }

    /** 상장거래소(소재국가) */
    public String getLstexNt() { return DataPreprocessor.cleanString(lstexNtRaw); }
    public void setLstexNtRaw(String v) { this.lstexNtRaw = v; }

    /** 폐지신청예정일자 */
    public String getDlstrqPrdRaw() { return dlstrqPrdRaw; }
    public String getDlstrqPrd() { return DataPreprocessor.formatDate(dlstrqPrdRaw); }
    public void setDlstrqPrdRaw(String v) { this.dlstrqPrdRaw = v; }

    /** 폐지(예정)일자 */
    public String getDlstPrdRaw() { return dlstPrdRaw; }
    public String getDlstPrd() { return DataPreprocessor.formatDate(dlstPrdRaw); }
    public void setDlstPrdRaw(String v) { this.dlstPrdRaw = v; }

    /** 폐지사유 */
    public String getDlstRs() { return DataPreprocessor.cleanString(dlstRsRaw); }
    public void setDlstRsRaw(String v) { this.dlstRsRaw = v; }

    /** 이사회결의일(확인일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사 참석여부(참석(명)) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사 참석여부(불참(명)) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(감사위원)참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

}
