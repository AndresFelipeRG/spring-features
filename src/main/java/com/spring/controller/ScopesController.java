package com.spring.controller;

import com.spring.model.HelloMessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ScopesController {

    @Autowired
    HelloMessageGenerator requestScopedBean;

    @Autowired
    HelloMessageGenerator applicationScopedBean;

    @Autowired
    HelloMessageGenerator sessionScopedBean;


    @RequestMapping("/scopes/request")
    public String getRequestScopedMessage(){
        if(requestScopedBean.getMessage() == null) {
            requestScopedBean.setMessage("uuid: " + UUID.randomUUID());
        }

        return  requestScopedBean.getMessage();
    }

    @RequestMapping("/scopes/session")
    public String getSessionScopedMessage(){
        if(sessionScopedBean.getMessage() == null ){
            sessionScopedBean.setMessage("uuid: " + UUID.randomUUID());
        }
        return sessionScopedBean.getMessage();
    }
    @RequestMapping("/scopes/applications")
    public String getApplicationScopedMessage(){
        if(applicationScopedBean.getMessage() == null ){
            applicationScopedBean.setMessage("uuid: " + UUID.randomUUID());
        }
        return applicationScopedBean.getMessage();
    }
}
