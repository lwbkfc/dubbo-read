package com.lwb.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by lwb on 2016/9/1.
 */
public class ChewlNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("chewl",new ChewlBeanDefinitionParser(Chewl.class,true));
    }
}
