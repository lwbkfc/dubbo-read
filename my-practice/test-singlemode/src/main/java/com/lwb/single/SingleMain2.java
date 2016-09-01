package com.lwb.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lwb on 2016/8/31.
 */
public class SingleMain2 {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        while (true){
            for (int i=0;i<1000;i++){


                cachedThreadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(SingletonClass.getInstance());
                    }
                });
            }
        }

    }
}
