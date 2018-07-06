package com.mg.spring.di.constructor;

import com.mg.spring.di.constructor.beans.TestConStructorDi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConStructorDiApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-construct.xml");
        TestConStructorDi di = (TestConStructorDi)context.getBean("constructor");
        di.test();
        System.out.println(di.getContructorDiSource().getName());
    }
}
