package com.lwb.spi.impl;

import com.lwb.spi.HelloService;

/**
 * Created by lwb on 2016/8/31.
 */
public class TextHelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Text Hello.");
    }
}
