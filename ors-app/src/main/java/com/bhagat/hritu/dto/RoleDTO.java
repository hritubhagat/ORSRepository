package com.bhagat.hritu.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public final class RoleDTO extends BaseDTO{
    
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -5397410180952053187L;
    /**
     *  Predefined role constants.
     */
    public static final Integer ROLE_ADMIN=1;
    public static final Integer ROLE_STUDENT=2;
    public static final Integer ROLE_COLLEGE=3;
    public static final Integer ROLE_KIOSK=4;
    
    /**
     * Role name
     */
    private String name;
    
    /**
     * Role description
     */
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
