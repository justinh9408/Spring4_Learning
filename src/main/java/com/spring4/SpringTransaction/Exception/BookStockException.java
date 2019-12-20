package com.spring4.SpringTransaction.Exception;

/**
 * @Classname BookStockException
 * @Description TODO
 * @Date 2019-12-20 14:21
 * @Created by Justin
 */
public class BookStockException extends RuntimeException {
    public BookStockException() {
        super();
    }

    public BookStockException(String message) {
        super(message);
    }

    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockException(Throwable cause) {
        super(cause);
    }

    protected BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
