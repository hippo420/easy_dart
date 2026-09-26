package com.easydart.dto.overseas;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 해외 증권시장 주권등 상장폐지 응답 DTO */
public class GetOverseasDelistingDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("lstex_nt")
    private String lstexNtRaw;

    @JsonProperty("dlststk_ostk_cnt")
    private String dlststkOstkCntRaw;

    @JsonProperty("dlststk_estk_cnt")
    private String dlststkEstkCntRaw;

    @JsonProperty("tredd")
    private String treddRaw;

    @JsonProperty("dlst_rs")
    private String dlstRsRaw;

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

    /** 상장거래소 및 소재국가 */
    public String getLstexNt() { return DataPreprocessor.cleanString(lstexNtRaw); }
    public void setLstexNtRaw(String v) { this.lstexNtRaw = v; }

    /** 상장폐지주식의 종류(보통주식(주)) - 9999999999 */
    public String getDlststkOstkCntRaw() { return dlststkOstkCntRaw; }
    public BigDecimal getDlststkOstkCnt() { return DataPreprocessor.parseAmount(dlststkOstkCntRaw); }
    public void setDlststkOstkCntRaw(String v) { this.dlststkOstkCntRaw = v; }

    /** 상장폐지주식의 종류(기타주식(주)) - 9999999999 */
    public String getDlststkEstkCntRaw() { return dlststkEstkCntRaw; }
    public BigDecimal getDlststkEstkCnt() { return DataPreprocessor.parseAmount(dlststkEstkCntRaw); }
    public void setDlststkEstkCntRaw(String v) { this.dlststkEstkCntRaw = v; }

    /** 매매거래종료일 */
    public String getTreddRaw() { return treddRaw; }
    public String getTredd() { return DataPreprocessor.formatDate(treddRaw); }
    public void setTreddRaw(String v) { this.treddRaw = v; }

    /** 폐지사유 */
    public String getDlstRs() { return DataPreprocessor.cleanString(dlstRsRaw); }
    public void setDlstRsRaw(String v) { this.dlstRsRaw = v; }

    /** 확인일자 */
    public String getCfd() { return DataPreprocessor.cleanString(cfdRaw); }
    public void setCfdRaw(String v) { this.cfdRaw = v; }

}
