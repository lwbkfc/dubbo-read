package com.lwb.socketrpc.client;

import com.lwb.socketrpc.api.HelloService;
import com.lwb.socketrpc.api.RpcFramework;

/**
 * Created by lwb on 2016/9/2.
 */
public class RpcConsumer {
    public static void main(String[] args) throws Exception {
        HelloService helloService = RpcFramework.refer(HelloService.class,"127.0.0.1",1234);
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String hello = helloService.hello("World "+i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }
}
