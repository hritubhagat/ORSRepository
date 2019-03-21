package com.bhagat.hritu.exception;

/**
 * ApplicationException is propagated from service classes when a business logic exception occurs.
 * 
 * @author sappraja
 * @version 1.0
 *
 */
public class ApplicationException extends Exception{
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -3175515910093191328L;

    /**
     * @param msg
     *            : Error message description
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}
