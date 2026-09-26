package com.easydart.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

/**
 * OpenDart API 공통 응답 래퍼.
 * status: "000" 이면 정상, 그 외는 오류.
 */
public class DartResponse<T> {

    @JsonProperty("status")
    private String status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("list")
    private List<T> list;

    /** 단건 응답용 (list가 없는 경우) */
    @JsonProperty("data")
    private T data;

    public boolean isSuccess() {
        return "000".equals(status);
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<T> getList() {
        return list != null ? list : Collections.emptyList();
    }
    public void setList(List<T> list) { this.list = list; }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}
