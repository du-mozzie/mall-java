package com.du.common.exception;

import lombok.Getter;

@Getter
public class BizException extends RuntimeException{

    private String message;

    private Integer code;


    public BizException() {
        super();
    }

    public BizException(String message) {
        this.message = message;
        this.code = 500;
    }

    public BizException(BizExceptionEnum bizExceptionEnum) {
        this.message = bizExceptionEnum.getMsg();
        this.code = bizExceptionEnum.getCode();
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    protected BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
