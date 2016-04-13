package com.simple.exception;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/13
 */
public class DuplicationException extends RuntimeException {

    public DuplicationException() {
    }

    public DuplicationException(String message) {
        super(message);
    }

    public DuplicationException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public DuplicationException(Throwable throwable) {
        super(throwable);
    }
}
