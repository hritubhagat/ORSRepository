package com.bhagat.hritu.exception;

public class DuplicateUserException extends Exception {

    /**
     * Serial Version ID
     */
    private static final long serialVersionUID = -5633256440529039185L;

    public DuplicateUserException() {

    }

    public DuplicateUserException(String msg) {
        super(msg);
    }
}
