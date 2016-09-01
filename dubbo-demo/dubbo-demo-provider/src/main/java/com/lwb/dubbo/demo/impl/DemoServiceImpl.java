package com.lwb.dubbo.demo.impl;

import com.lwb.dubbo.demo.api.DemoService;

/**
 * Created by lwb on 2016/8/31.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello() {
        return "hello world demo";
    }
}
