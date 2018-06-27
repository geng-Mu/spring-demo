package com.mg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Test test = (Test)context.getBean("test");
        test.test();
    }
}
