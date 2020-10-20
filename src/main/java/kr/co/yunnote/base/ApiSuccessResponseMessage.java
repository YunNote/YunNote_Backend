package kr.co.yunnote.base;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ApiSuccessResponseMessage<T> {
    private int statusCode;
    private String message;

    private Map<String , T> data = new HashMap<String, T>();

    public ApiSuccessResponseMessage(StatusInfo statusInfo) {
        this.statusCode = statusInfo.getStatusCode();
        this.message = statusInfo.getStatusMessage();
    }

    public ApiSuccessResponseMessage appendData(String key, T data) {
        this.data.put(key, data);
        return this;
    }
}
