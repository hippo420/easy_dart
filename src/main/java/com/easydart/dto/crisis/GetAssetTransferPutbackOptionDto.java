package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 자산양수도(기타), 풋백옵션 응답 DTO */
public class GetAssetTransferPutbackOptionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("rp_rsn")
    private String rpRsnRaw;

    @JsonProperty("ast_inhtrf_prc")
    private String astInhtrfPrcRaw;

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

    /** 보고 사유 */
    public String getRpRsn() { return DataPreprocessor.cleanString(rpRsnRaw); }
    public void setRpRsnRaw(String v) { this.rpRsnRaw = v; }

    /** 자산양수ㆍ도 가액 - 9999999999 */
    public String getAstInhtrfPrcRaw() { return astInhtrfPrcRaw; }
    public BigDecimal getAstInhtrfPrc() { return DataPreprocessor.parseAmount(astInhtrfPrcRaw); }
    public void setAstInhtrfPrcRaw(String v) { this.astInhtrfPrcRaw = v; }

}
