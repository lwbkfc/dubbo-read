package com.lwb.springmvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.MockMvcClientHttpRequestFactory;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by lwb on 2016/9/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class MockMvcClientHttpRequestFactoryTests {
    @Autowired
    private WebApplicationContext wac;

    private RestTemplate restTemplate;

    @Before
    public void setup(){
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();

        this.restTemplate = new RestTemplate(new MockMvcClientHttpRequestFactory(mockMvc));
    }

    @Test
    public void test() throws Exception{
        String result = this.restTemplate.getForObject("/fish",String.class);
        System.out.println(result);
        System.out.println(MyWebConfig.hello);
        assertEquals("fish",result);
    }
    @EnableWebMvc
    @Configuration
    @ComponentScan(basePackageClasses = MockMvcClientHttpRequestFactoryTests.class)
    static class MyWebConfig extends WebMvcConfigurerAdapter{
        private final static String hello = "world 2222";
    }

    @Controller
    static class MyController{
        @RequestMapping(value = "/foo",method = RequestMethod.GET)
        @ResponseBody
        public String handle(){
            return "bar";
        }
    }
}


































