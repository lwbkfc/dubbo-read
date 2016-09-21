package com.lwb.socketrpc.api;

/**
 * Created by lwb on 2016/9/2.
 */
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "hello "+name;
    }
}
