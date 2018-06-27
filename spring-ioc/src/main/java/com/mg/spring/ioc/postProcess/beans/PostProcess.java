package com.mg.spring.ioc.postProcess.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcess implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("针对所有的springBean在实例化的时候执行,在init方法之前!");
//        此处的bean即为实例化的bean对象
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("针对所有的springBean在对象销毁的时候执行,在destory方法之前!");
        return bean;
    }
}
