package com.easydart.dto.crisis;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 영업정지 응답 DTO */
public class GetBusinessSuspensionDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("bsnsp_rm")
    private String bsnspRmRaw;

    @JsonProperty("bsnsp_amt")
    private String bsnspAmtRaw;

    @JsonProperty("rsl")
    private String rslRaw;

    @JsonProperty("sl_vs")
    private String slVsRaw;

    @JsonProperty("ls_atn")
    private String lsAtnRaw;

    @JsonProperty("krx_stt_atn")
    private String krxSttAtnRaw;

    @JsonProperty("bsnsp_cn")
    private String bsnspCnRaw;

    @JsonProperty("bsnsp_rs")
    private String bsnspRsRaw;

    @JsonProperty("ft_ctp")
    private String ftCtpRaw;

    @JsonProperty("bsnsp_af")
    private String bsnspAfRaw;

    @JsonProperty("bsnspd")
    private String bsnspdRaw;

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

    /** 영업정지 분야 */
    public String getBsnspRm() { return DataPreprocessor.cleanString(bsnspRmRaw); }
    public void setBsnspRmRaw(String v) { this.bsnspRmRaw = v; }

    /** 영업정지 내역(영업정지금액) - 9999999999 */
    public String getBsnspAmtRaw() { return bsnspAmtRaw; }
    public BigDecimal getBsnspAmt() { return DataPreprocessor.parseAmount(bsnspAmtRaw); }
    public void setBsnspAmtRaw(String v) { this.bsnspAmtRaw = v; }

    /** 영업정지 내역(최근매출총액) - 9999999999 */
    public String getRslRaw() { return rslRaw; }
    public BigDecimal getRsl() { return DataPreprocessor.parseAmount(rslRaw); }
    public void setRslRaw(String v) { this.rslRaw = v; }

    /** 영업정지 내역(매출액 대비) */
    public String getSlVsRaw() { return slVsRaw; }
    public BigDecimal getSlVs() { return DataPreprocessor.parseAmount(slVsRaw); }
    public void setSlVsRaw(String v) { this.slVsRaw = v; }

    /** 영업정지 내역(대규모법인여부) */
    public String getLsAtn() { return DataPreprocessor.cleanString(lsAtnRaw); }
    public void setLsAtnRaw(String v) { this.lsAtnRaw = v; }

    /** 영업정지 내역(거래소 의무공시 해당 여부) */
    public String getKrxSttAtn() { return DataPreprocessor.cleanString(krxSttAtnRaw); }
    public void setKrxSttAtnRaw(String v) { this.krxSttAtnRaw = v; }

    /** 영업정지 내용 */
    public String getBsnspCn() { return DataPreprocessor.cleanString(bsnspCnRaw); }
    public void setBsnspCnRaw(String v) { this.bsnspCnRaw = v; }

    /** 영업정지사유 */
    public String getBsnspRs() { return DataPreprocessor.cleanString(bsnspRsRaw); }
    public void setBsnspRsRaw(String v) { this.bsnspRsRaw = v; }

    /** 향후대책 */
    public String getFtCtp() { return DataPreprocessor.cleanString(ftCtpRaw); }
    public void setFtCtpRaw(String v) { this.ftCtpRaw = v; }

    /** 영업정지영향 */
    public String getBsnspAf() { return DataPreprocessor.cleanString(bsnspAfRaw); }
    public void setBsnspAfRaw(String v) { this.bsnspAfRaw = v; }

    /** 영업정지일자 */
    public String getBsnspdRaw() { return bsnspdRaw; }
    public String getBsnspd() { return DataPreprocessor.formatDate(bsnspdRaw); }
    public void setBsnspdRaw(String v) { this.bsnspdRaw = v; }

    /** 이사회결의일(결정일) */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 사외이사 참석여부(참석) - 9999999999 */
    public String getOdAAtT() { return DataPreprocessor.cleanString(odAAtTRaw); }
    public void setOdAAtTRaw(String v) { this.odAAtTRaw = v; }

    /** 사외이사 참석여부(불참) - 9999999999 */
    public String getOdAAtB() { return DataPreprocessor.cleanString(odAAtBRaw); }
    public void setOdAAtBRaw(String v) { this.odAAtBRaw = v; }

    /** 감사(감사위원) 참석여부 */
    public String getAdtAAtn() { return DataPreprocessor.cleanString(adtAAtnRaw); }
    public void setAdtAAtnRaw(String v) { this.adtAAtnRaw = v; }

}
