package com.lwb.xsd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lwb on 2016/9/1.
 */
public class TestNameSpace {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Chewl chewl =(Chewl) context.getBean("test");
        System.out.println(chewl);
    }

}
