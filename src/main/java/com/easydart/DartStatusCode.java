package com.easydart;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * OpenDart API 응답 상태 코드
 */
public enum DartStatusCode {

    SUCCESS          ("000", "정상",                            false),
    NO_DATA          ("013", "조회된 데이터가 없습니다.",               false),

    UNREGISTERED_KEY ("010", "등록되지 않은 키입니다.",                  true),
    DISABLED_KEY     ("011", "사용할 수 없는 키입니다. (일시 사용 중지)",   true),
    INACCESSIBLE_IP  ("012", "접근할 수 없는 IP입니다.",                 true),
    FILE_NOT_FOUND   ("014", "파일이 존재하지 않습니다.",                 true),
    REQUEST_EXCEEDED ("020", "요청 제한을 초과하였습니다. (일일 20,000건)", true),
    COMPANY_EXCEEDED ("021", "조회 가능한 회사 개수가 초과하였습니다. (최대 100건)", true),
    INVALID_FIELD    ("100", "필드의 부적절한 값입니다.",                 true),
    IMPROPER_ACCESS  ("101", "부적절한 접근입니다.",                     true),
    MAINTENANCE      ("800", "시스템 점검으로 인한 서비스가 중지 중입니다.",  true),
    UNDEFINED_ERROR  ("900", "정의되지 않은 오류가 발생하였습니다.",         true),
    EXPIRED_ACCOUNT  ("901", "개인정보 보유기간이 만료된 계정입니다. opendart@fss.or.kr 문의", true),

    UNKNOWN          ("???", "알 수 없는 상태 코드입니다.",               true);

    private final String code;
    private final String message;
    private final boolean isError;

    private static final Map<String, DartStatusCode> CODE_MAP = Arrays.stream(values())
            .collect(Collectors.toMap(DartStatusCode::getCode, Function.identity()));

    DartStatusCode(String code, String message, boolean isError) {
        this.code = code;
        this.message = message;
        this.isError = isError;
    }

    public String getCode() { return code; }
    public String getMessage() { return message; }

    /** 오류 상태 여부 (true = 예외 발생 대상) */
    public boolean isError() { return isError; }

    /** 정상 응답 여부 */
    public boolean isSuccess() { return this == SUCCESS; }

    /** 데이터 없음 (정상이지만 결과가 빈 경우) */
    public boolean isNoData() { return this == NO_DATA; }

    /** 코드 문자열로 enum 조회. 미정의 코드는 UNKNOWN 반환 */
    public static DartStatusCode of(String code) {
        if (code == null) return UNKNOWN;
        return CODE_MAP.getOrDefault(code.trim(), UNKNOWN);
    }

    public static Optional<DartStatusCode> find(String code) {
        if (code == null) return Optional.empty();
        return Optional.ofNullable(CODE_MAP.get(code.trim()));
    }

    @Override
    public String toString() {
        return "[" + code + "] " + message;
    }
}
