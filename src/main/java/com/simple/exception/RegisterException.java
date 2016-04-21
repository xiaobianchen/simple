package com.simple.exception;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/21
 */
public class RegisterException extends RuntimeException {

    public RegisterException() {
        super();
    }

    public RegisterException(String message) {
        super(message);
    }

    public RegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterException(Throwable cause) {
        super(cause);
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}