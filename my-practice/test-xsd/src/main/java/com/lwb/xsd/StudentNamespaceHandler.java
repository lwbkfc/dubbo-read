package com.lwb.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by lwb on 2016/9/1.
 */
public class StudentNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("student",new StudentBeanDefinitionParser(Student.class,true));
    }
}
