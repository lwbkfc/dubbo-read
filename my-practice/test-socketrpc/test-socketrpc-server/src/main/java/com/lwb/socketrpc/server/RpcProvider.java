package com.lwb.socketrpc.server;

import com.lwb.socketrpc.api.HelloService;
import com.lwb.socketrpc.api.HelloServiceImpl;
import com.lwb.socketrpc.api.RpcFramework;

/**
 * Created by lwb on 2016/9/2.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
        RpcFramework.export(helloService,1234);
    }
}
