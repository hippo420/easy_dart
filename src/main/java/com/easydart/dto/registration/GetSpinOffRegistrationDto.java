package com.easydart.dto.registration;

import com.easydart.preprocessor.DataPreprocessor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** 분할 응답 DTO */
public class GetSpinOffRegistrationDto {

    @JsonProperty("rcept_no")
    private String rceptNoRaw;

    @JsonProperty("corp_cls")
    private String corpClsRaw;

    @JsonProperty("corp_code")
    private String corpCodeRaw;

    @JsonProperty("corp_name")
    private String corpNameRaw;

    @JsonProperty("stn")
    private String stnRaw;

    @JsonProperty("bddd")
    private String bdddRaw;

    @JsonProperty("ctrd")
    private String ctrdRaw;

    @JsonProperty("gmtsck_shddstd")
    private String gmtsckShddstdRaw;

    @JsonProperty("ap_gmtsck")
    private String apGmtsckRaw;

    @JsonProperty("aprskh_pd_bgd")
    private String aprskhPdBgdRaw;

    @JsonProperty("aprskh_pd_edd")
    private String aprskhPdEddRaw;

    @JsonProperty("aprskh_prc")
    private String aprskhPrcRaw;

    @JsonProperty("mgdt_etc")
    private String mgdtEtcRaw;

    @JsonProperty("rt_vl")
    private String rtVlRaw;

    @JsonProperty("exevl_int")
    private String exevlIntRaw;

    @JsonProperty("grtmn_etc")
    private String grtmnEtcRaw;

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

    /** 형태 */
    public String getStn() { return DataPreprocessor.cleanString(stnRaw); }
    public void setStnRaw(String v) { this.stnRaw = v; }

    /** 이사회 결의일 */
    public String getBdddRaw() { return bdddRaw; }
    public String getBddd() { return DataPreprocessor.formatDate(bdddRaw); }
    public void setBdddRaw(String v) { this.bdddRaw = v; }

    /** 계약일 */
    public String getCtrd() { return DataPreprocessor.cleanString(ctrdRaw); }
    public void setCtrdRaw(String v) { this.ctrdRaw = v; }

    /** 주주총회를 위한 주주확정일 */
    public String getGmtsckShddstd() { return DataPreprocessor.cleanString(gmtsckShddstdRaw); }
    public void setGmtsckShddstdRaw(String v) { this.gmtsckShddstdRaw = v; }

    /** 승인을 위한 주주총회일 */
    public String getApGmtsck() { return DataPreprocessor.cleanString(apGmtsckRaw); }
    public void setApGmtsckRaw(String v) { this.apGmtsckRaw = v; }

    /** 주식매수청구권 행사 기간 및 가격(시작일) */
    public String getAprskhPdBgd() { return DataPreprocessor.cleanString(aprskhPdBgdRaw); }
    public void setAprskhPdBgdRaw(String v) { this.aprskhPdBgdRaw = v; }

    /** 주식매수청구권 행사 기간 및 가격(종료일) */
    public String getAprskhPdEdd() { return DataPreprocessor.cleanString(aprskhPdEddRaw); }
    public void setAprskhPdEddRaw(String v) { this.aprskhPdEddRaw = v; }

    /** 주식매수청구권 행사 기간 및 가격((주식매수청구가격-회사제시)) */
    public String getAprskhPrcRaw() { return aprskhPrcRaw; }
    public BigDecimal getAprskhPrc() { return DataPreprocessor.parseAmount(aprskhPrcRaw); }
    public void setAprskhPrcRaw(String v) { this.aprskhPrcRaw = v; }

    /** 합병기일등 */
    public String getMgdtEtcRaw() { return mgdtEtcRaw; }
    public String getMgdtEtc() { return DataPreprocessor.formatDate(mgdtEtcRaw); }
    public void setMgdtEtcRaw(String v) { this.mgdtEtcRaw = v; }

    /** 비율 또는 가액 */
    public String getRtVlRaw() { return rtVlRaw; }
    public BigDecimal getRtVl() { return DataPreprocessor.parseAmount(rtVlRaw); }
    public void setRtVlRaw(String v) { this.rtVlRaw = v; }

    /** 외부평가기관 */
    public String getExevlInt() { return DataPreprocessor.cleanString(exevlIntRaw); }
    public void setExevlIntRaw(String v) { this.exevlIntRaw = v; }

    /** 지급 교부금 등 */
    public String getGrtmnEtc() { return DataPreprocessor.cleanString(grtmnEtcRaw); }
    public void setGrtmnEtcRaw(String v) { this.grtmnEtcRaw = v; }

    /** 주요사항보고서(접수번호) */
    public String getRptRcpn() { return DataPreprocessor.cleanString(rptRcpnRaw); }
    public void setRptRcpnRaw(String v) { this.rptRcpnRaw = v; }

}
