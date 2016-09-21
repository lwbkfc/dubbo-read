package com.lwb.java.proxy;

/**
 * Created by lwb on 2016/9/20.
 */
public class HelloWorldImpl implements HelloWorldService {
    @Override
    public void sayHelloWorld() {
        System.out.println("HelloWorld!");
    }

    @Override
    public void sayHelloWorld2() {
        System.out.println("llllllllllllllllllllllll");
    }
}
