package com.easydart.dto.registration;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 증권예탁증권 응답 DTO */
public class GetDepositaryReceiptRegistrationDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("sbd")
    private String sbdRaw;

    @JsonProperty("pymd")
    private String pymdRaw;

    @JsonProperty("sband")
    private String sbandRaw;

    @JsonProperty("asand")
    private String asandRaw;

    @JsonProperty("asstd")
    private String asstdRaw;

    @JsonProperty("exstk")
    private String exstkRaw;

    @JsonProperty("exprc")
    private String exprcRaw;

    @JsonProperty("expd")
    private String expdRaw;

    @JsonProperty("rpt_rcpn")
    private String rptRcpnRaw;

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

    /** 청약기일 */
    public String getSbd() { return DataPreprocessor.cleanString(sbdRaw); }
    public void setSbdRaw(String v) { this.sbdRaw = v; }

    /** 납입기일 */
    public String getPymd() { return DataPreprocessor.cleanString(pymdRaw); }
    public void setPymdRaw(String v) { this.pymdRaw = v; }

    /** 청약공고일 */
    public String getSband() { return DataPreprocessor.cleanString(sbandRaw); }
    public void setSbandRaw(String v) { this.sbandRaw = v; }

    /** 배정공고일 */
    public String getAsand() { return DataPreprocessor.cleanString(asandRaw); }
    public void setAsandRaw(String v) { this.asandRaw = v; }

    /** 배정기준일 */
    public String getAsstd() { return DataPreprocessor.cleanString(asstdRaw); }
    public void setAsstdRaw(String v) { this.asstdRaw = v; }

    /** 신주인수권에 관한 사항(행사대상증권) */
    public String getExstk() { return DataPreprocessor.cleanString(exstkRaw); }
    public void setExstkRaw(String v) { this.exstkRaw = v; }

    /** 신주인수권에 관한 사항(행사가격) - 9999999999 */
    public String getExprcRaw() { return exprcRaw; }
    public BigDecimal getExprc() { return DataPreprocessor.parseAmount(exprcRaw); }
    public void setExprcRaw(String v) { this.exprcRaw = v; }

    /** 신주인수권에 관한 사항(행사기간) */
    public String getExpd() { return DataPreprocessor.cleanString(expdRaw); }
    public void setExpdRaw(String v) { this.expdRaw = v; }

    /** 주요사항보고서(접수번호) */
    public String getRptRcpn() { return DataPreprocessor.cleanString(rptRcpnRaw); }
    public void setRptRcpnRaw(String v) { this.rptRcpnRaw = v; }

}
