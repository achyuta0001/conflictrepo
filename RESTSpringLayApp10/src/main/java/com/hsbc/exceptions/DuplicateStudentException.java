package com.hsbc.exceptions;

public class DuplicateStudentException extends Exception{
    public DuplicateStudentException() {
    }

    public DuplicateStudentException(String message) {
        super(message);
    }

    public DuplicateStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateStudentException(Throwable cause) {
        super(cause);
    }
}
