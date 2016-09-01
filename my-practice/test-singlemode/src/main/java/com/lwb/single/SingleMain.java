package com.lwb.single;

/**
 * Created by lwb on 2016/8/31.
 */
public class SingleMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("t1 "+SingletonClass.getInstance());
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                     System.out.println("t2 "+SingletonClass.getInstance());
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("t3 "+SingletonClass.getInstance());
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
