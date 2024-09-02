package com.hsbc.exceptions;

public class NoSuchStudentException extends Exception{
    public NoSuchStudentException() {
    }

    public NoSuchStudentException(String message) {
        super(message);
    }

    public NoSuchStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchStudentException(Throwable cause) {
        super(cause);
    }
}
