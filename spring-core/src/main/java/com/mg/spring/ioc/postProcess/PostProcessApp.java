package com.mg.spring.ioc.postProcess;

import com.mg.spring.ioc.postProcess.beans.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessApp {
    public static void main(String[] args) {
        /**
         * 实现BeanPostProcess接口对Bean的生命周期管理和init/destory管理的区别
         * 1.BeanPostProcess接口对所有的spirngBean的实例化都生效,而init/destory只对设置了这个属性的bean生效
         * 2.执行顺序:postProcessBeforeInitialization>init-method>postProcessAfterInitialization
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-postProcess.xml");
        TestBean testBean = (TestBean)context.getBean("test");
        testBean.setName("testBean");
        System.out.println(testBean.getName());
        TestBean test = (TestBean)context.getBean("test");
        ((ClassPathXmlApplicationContext) context).close();
    }
}
