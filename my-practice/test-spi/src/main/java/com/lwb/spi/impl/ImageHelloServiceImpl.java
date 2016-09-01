package com.lwb.spi.impl;

import com.lwb.spi.HelloService;

/**
 * Created by lwb on 2016/8/31.
 */
public class ImageHelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Image Hello");
    }
}
