package com.bhagat.hritu.controller;

import com.bhagat.hritu.session.OrsSession;

public abstract class AbstractController {

    protected OrsSession orsSession;

    public OrsSession getOrsSession() {
        return orsSession;
    }

    public void setOrsSession(OrsSession orsSession) {
        this.orsSession = orsSession;
    }
}
