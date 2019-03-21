package com.bhagat.hritu.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class is the parent class of all the DTOs in the application. It contains generic attributes.
 * @author sappraja
 * @version 1.0
 */
public abstract class BaseDTO implements Serializable{
    
    /**
     *  Serial version ID
     */
    private static final long serialVersionUID = 1213586626796459534L;

    /**
     * Non Business primary key
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    protected Long id; 
    
    /**
     * Contains user id of the user who created this database record.
     */
    protected String createdBy;
    
    /**
     * Contains user id of the user who modified this database record.
     */
    protected String modifiedBy;
    
    /**
     * Contains creation timestamp of this database record.
     */
    protected Timestamp createdDatetime;
    
    /**
     * Contains modified timestamp of this database record.
     */
    protected Timestamp modifiedDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Timestamp getModifiedDatetime() {
        return modifiedDatetime;
    }

    public void setModifiedDatetime(Timestamp modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }
    
    
    
}
