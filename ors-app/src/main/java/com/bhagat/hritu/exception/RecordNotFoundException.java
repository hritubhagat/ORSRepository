package com.bhagat.hritu.exception;

/**
 * RecordNotFoundException is generated and propagated from service classes when a business logic exception occurs.
 * 
 * @author sappraja
 * @version 1.0
 *
 */
public class RecordNotFoundException extends Exception{
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -3175515910093191328L;

    /**
     * @param msg
     *            : Error message description
     */
    public RecordNotFoundException(String msg) {
        super(msg);
    }
}
