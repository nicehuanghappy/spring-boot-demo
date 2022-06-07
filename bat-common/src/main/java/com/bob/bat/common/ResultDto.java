package com.bob.bat.common;

/**
 * @author hwy
 */
public class ResultDto<T> {

    private String code;
    private String message;
    private T data;

    private ResultDto() {
    }

    private ResultDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResultDto<T> success(T data) {
        return new ResultDto<>(ReturnCodeMsg.SUCCESS.getCode(), ReturnCodeMsg.SUCCESS.getMessage(), data);
    }

    public static <T> ResultDto<T> success() {
        return new ResultDto<>(ReturnCodeMsg.SUCCESS.getCode(), ReturnCodeMsg.SUCCESS.getMessage(), null);
    }

    public static <T> ResultDto<T> failed(ReturnCodeMsg codeMessage) {
        return new ResultDto<>(codeMessage.getCode(), codeMessage.getMessage(), null);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
