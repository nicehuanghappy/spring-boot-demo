package com.bob.bat.common;

public enum ReturnCodeMsg {
    FAILED_DEMO("99999", "异常测试"),
    SUCCESS("00000", "交易成功"),
    FAILED_BUSINESS("99999", "应用程序主动抛出异常"),
    FAILED_UNCATCH("99999", "未捕获异常");


    private final String code;
    private final String message;

    ReturnCodeMsg(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
