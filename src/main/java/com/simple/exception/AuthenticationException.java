package com.simple.exception;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/15
 *
 * 权限认证异常处理类
 */
public class AuthenticationException extends RuntimeException {

    public AuthenticationException() {
    }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public AuthenticationException(Throwable throwable) {
        super(throwable);
    }
}
