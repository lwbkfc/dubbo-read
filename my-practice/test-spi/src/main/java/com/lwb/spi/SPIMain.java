package com.lwb.spi;

import java.util.ServiceLoader;

/**
 * Created by lwb on 2016/8/31.
 */
public class SPIMain {
    public static void main(String[] args) {
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);

        for (HelloService in:loaders){
            in.sayHello();
        }
    }
}
