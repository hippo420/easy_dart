package com.easydart;

/**
 * OpenDart API 호출 예외.
 * statusCode로 오류 유형을 구분할 수 있습니다.
 *
 * <pre>
 * try {
 *     dartClient.shareholder().getCapitalChanges(...);
 * } catch (DartApiException e) {
 *     switch (e.getStatusCode()) {
 *         case UNREGISTERED_KEY:
 *         case DISABLED_KEY:
 *             // 인증키 문제
 *             break;
 *         case REQUEST_EXCEEDED:
 *             // 요청 한도 초과 → 재시도 대기
 *             break;
 *         case MAINTENANCE:
 *             // 점검 시간 → 나중에 재시도
 *             break;
 *         default:
 *             // 기타 오류
 *     }
 * }
 * </pre>
 */
public class DartApiException extends RuntimeException {

    private final DartStatusCode statusCode;

    public DartApiException(DartStatusCode statusCode, String apiName) {
        super(statusCode + " - API: " + apiName);
        this.statusCode = statusCode;
    }

    public DartApiException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = DartStatusCode.UNDEFINED_ERROR;
    }

    public DartApiException(String message) {
        super(message);
        this.statusCode = DartStatusCode.UNDEFINED_ERROR;
    }

    /** OpenDart 상태 코드 enum */
    public DartStatusCode getStatusCode() { return statusCode; }

    /** OpenDart 상태 코드 문자열 (예: "010") */
    public String getRawCode() { return statusCode.getCode(); }
}
