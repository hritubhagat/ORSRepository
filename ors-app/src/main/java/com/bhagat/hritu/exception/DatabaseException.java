package com.bhagat.hritu.exception;

/**
 * DatabaseException is created and propagated from DAO classes when an unhandled database exception occurs.
 * 
 * @author sappraja
 * @version 1.0
 *
 */
public class DatabaseException extends Exception {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -5853751500997331142L;

    /**
     * @param msg
     *            : Error message description
     */
    public DatabaseException(String msg) {
        super(msg);
    }
}
