package com.lwb.single;

public class SingletonClass{
    private static SingletonClass instance=null;
    public static SingletonClass getInstance(){
        try {
            //为了测试方便，测试用例为SingleMain。如果去掉第二个if，不能保证是单例的。
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(instance==null){
            synchronized(SingletonClass.class){
                if (instance == null){
                    instance=new SingletonClass();
                }
            }
        }
        return instance;
    }
    private SingletonClass(){}
}