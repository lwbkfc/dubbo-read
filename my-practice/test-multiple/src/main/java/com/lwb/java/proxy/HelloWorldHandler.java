package com.lwb.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lwb on 2016/9/20.
 */
public class HelloWorldHandler implements InvocationHandler {
    private Object object;

    public HelloWorldHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //调用之前

        //调用原始对象方法
        result = method.invoke(object,args);

        //调用之后

        return null;
    }

    private void doBefore(){
        System.out.println("before method invoke");
    }
    private void doAfter(){
        System.out.println("after method invoke");
    }
}





























