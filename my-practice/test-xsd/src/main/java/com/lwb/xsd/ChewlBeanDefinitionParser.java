package com.lwb.xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * Created by lwb on 2016/9/1.
 */
public class ChewlBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    private final Class<?> beanClass;
    private final boolean required;

    public ChewlBeanDefinitionParser(Class<?> beanClass, boolean required) {
        this.beanClass = beanClass;
        this.required = required;
    }

    protected Class getBeanClass(Element element){
        return Chewl.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder builder){
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String profession = element.getAttribute("profession");
        String address = element.getAttribute("address");
        String phone = element.getAttribute("phone");
        if (StringUtils.hasText(id)){
            builder.addPropertyValue("id",id);
        }
        if (StringUtils.hasText(name)){
            builder.addPropertyValue("name",name);
        }
        if (StringUtils.hasText(age)){
            builder.addPropertyValue("age",age);
        }
        if (StringUtils.hasText(profession)){
            builder.addPropertyValue("profession",profession);
        }
        if (StringUtils.hasText(address)){
            builder.addPropertyValue("address",address);
        }
        if (StringUtils.hasText(phone)){
            builder.addPropertyValue("phone",phone);
        }
    }
}




















































