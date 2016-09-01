package com.lwb.xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by lwb on 2016/9/1.
 */
public class StudentBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    private final Class<?> beanClass;
    private final boolean required;

    public StudentBeanDefinitionParser(Class<?> beanClass, boolean required) {
        this.beanClass = beanClass;
        this.required = required;
    }

    protected Class getBeanClass(Element element){
        return Student.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        String username = element.getAttribute("username");
        String password = element.getAttribute("password");
        if (StringUtils.hasText(id)){
            builder.addPropertyValue("id",id);
        }
        if (StringUtils.hasText(username)){
            builder.addPropertyValue("username",username);
        }
        if (StringUtils.hasText(password)){
            builder.addPropertyValue("password",password);
        }
    }
}
