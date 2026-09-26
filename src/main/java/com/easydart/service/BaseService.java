package com.easydart.service;

import com.easydart.DartApiException;
import com.easydart.DartStatusCode;
import com.easydart.dto.common.DartResponse;

import java.util.Collections;
import java.util.List;

abstract class BaseService {

    /**
     * 응답을 검증하고 list를 반환합니다.
     * - "000" (SUCCESS): list 반환
     * - "013" (NO_DATA): 빈 리스트 반환 (예외 없음)
     * - 나머지 오류 코드: DartApiException 발생
     */
    protected <T> List<T> extractList(DartResponse<T> resp, String apiName) {
        if (resp == null) {
            throw new DartApiException(DartStatusCode.UNDEFINED_ERROR, apiName);
        }

        DartStatusCode code = DartStatusCode.of(resp.getStatus());

        if (code.isSuccess()) {
            return resp.getList();
        }
        if (code.isNoData()) {
            return Collections.emptyList();
        }
        throw new DartApiException(code, apiName);
    }
}
