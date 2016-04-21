package com.simple.exception;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/21
 */
public class LoginException extends RuntimeException {

    public LoginException() {
        super();
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message,Throwable cause) {
        super(cause);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
