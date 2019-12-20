package com.spring4.SpringTransaction.Exception;

/**
 * @Classname AccountException
 * @Description TODO
 * @Date 2019-12-20 14:22
 * @Created by Justin
 */
public class AccountException extends RuntimeException {

    public AccountException() {
        super();
    }

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(Throwable cause) {
        super(cause);
    }

    protected AccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
