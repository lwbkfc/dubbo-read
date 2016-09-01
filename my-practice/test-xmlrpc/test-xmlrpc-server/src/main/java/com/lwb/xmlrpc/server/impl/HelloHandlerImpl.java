package com.lwb.xmlrpc.server.impl;


import com.lwb.xmlrpc.server.ServicesHandler;

/**
 * Created by lwb on 2016/9/1.
 */
public class HelloHandlerImpl implements ServicesHandler {
    public String execute(String str) {
        return "hello "+str+"!";
    }
}
