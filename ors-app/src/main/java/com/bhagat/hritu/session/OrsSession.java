package com.bhagat.hritu.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.bhagat.hritu.dto.UserDTO;

@Component
@Scope(
        value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrsSession implements Serializable{
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1710795684093632168L;
    
    private UserDTO user;

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
