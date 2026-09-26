package com.easydart.preprocessor;

import java.math.BigDecimal;
import java.util.Map;

/**
 * OpenDart API 응답 데이터 전처리 유틸리티.
 *
 * 처리 내용:
 * 1. 문자열 공백 제거 (trim)
 * 2. "-" 값을 null로 변환 (한국 재무데이터의 N/A 표기)
 * 3. 숫자 문자열의 쉼표 제거 후 BigDecimal 변환
 * 4. 법인구분 코드 → 한글 변환 (Y=유가, K=코스닥, N=코넥스, E=기타)
 * 5. 보고서 코드 → 한글 변환 (11011=사업보고서 등)
 */
public final class DataPreprocessor {

    private DataPreprocessor() {}

    private static final Map<String, String> CORP_CLS_MAP = Map.of(
            "Y", "유가증권시장",
            "K", "코스닥",
            "N", "코넥스",
            "E", "기타"
    );

    private static final Map<String, String> REPRT_CODE_MAP = Map.of(
            "11011", "사업보고서",
            "11012", "반기보고서",
            "11013", "1분기보고서",
            "11014", "3분기보고서"
    );

    /**
     * 문자열 정규화: null/공백/"-" → null, 그 외 trim
     */
    public static String cleanString(String value) {
        if (value == null) return null;
        String trimmed = value.trim();
        if (trimmed.isEmpty() || "-".equals(trimmed) || "—".equals(trimmed)) return null;
        return trimmed;
    }

    /**
     * 숫자 문자열 정규화: 쉼표 제거 후 반환. null/"–"/"-" → null
     */
    public static String cleanNumber(String value) {
        String cleaned = cleanString(value);
        if (cleaned == null) return null;
        return cleaned.replace(",", "").replace(" ", "");
    }

    /**
     * 숫자 문자열 → BigDecimal 변환. 파싱 실패 시 null 반환
     */
    public static BigDecimal parseAmount(String value) {
        String cleaned = cleanNumber(value);
        if (cleaned == null) return null;
        try {
            return new BigDecimal(cleaned);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * 법인구분 코드 → 한글명
     * Y=유가증권시장, K=코스닥, N=코넥스, E=기타
     */
    public static String resolveCorpCls(String corpCls) {
        if (corpCls == null) return null;
        return CORP_CLS_MAP.getOrDefault(corpCls.trim(), corpCls.trim());
    }

    /**
     * 보고서 코드 → 한글명
     * 11011=사업보고서, 11012=반기보고서, 11013=1분기보고서, 11014=3분기보고서
     */
    public static String resolveReprtCode(String reprtCode) {
        if (reprtCode == null) return null;
        return REPRT_CODE_MAP.getOrDefault(reprtCode.trim(), reprtCode.trim());
    }

    /**
     * 비율 문자열 정규화: "12.34" → "12.34", null/"-" → null
     */
    public static BigDecimal parseRate(String value) {
        return parseAmount(value);
    }

    /**
     * 날짜 문자열 정규화: "20231231" → "2023-12-31" (8자리인 경우)
     */
    public static String formatDate(String value) {
        String cleaned = cleanString(value);
        if (cleaned == null) return null;
        if (cleaned.length() == 8 && cleaned.chars().allMatch(Character::isDigit)) {
            return cleaned.substring(0, 4) + "-" + cleaned.substring(4, 6) + "-" + cleaned.substring(6, 8);
        }
        return cleaned;
    }
}
