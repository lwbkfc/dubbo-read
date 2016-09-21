package com.lwb.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lwb on 2016/9/20.
 */
public class HelloWorldTest {
    public static void main(String[] args) {
//        HelloWorldService helloWorldService = new HelloWorldImpl();
        InvocationHandler handler = new HelloWorldHandler(new HelloWorldImpl().getClass());

        HelloWorldService proxy = (HelloWorldService) Proxy.newProxyInstance(HelloWorldService.class.getClassLoader(),HelloWorldService.class.getInterfaces(),handler);
        proxy.sayHelloWorld();
        proxy.sayHelloWorld2();
    }

}
