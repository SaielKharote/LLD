package org.saiel.DesignPatterns.Creational.Builder.exceptions;

public class InvalidYoeException extends RuntimeException {
    public InvalidYoeException() {
    }

    public InvalidYoeException(String message) {
        super(message);
    }

    public InvalidYoeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYoeException(Throwable cause) {
        super(cause);
    }

    public InvalidYoeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
