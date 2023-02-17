package com.mg.spring.ioc.beanFactory;

import com.mg.spring.ioc.beanFactory.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryApp {
    public static void main(String[] args) {
        //XmlBeanFactory已经过时,不推荐使用
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-factory.xml"));
        Person person = (Person) beanFactory.getBean("per");
        person.setAge(18);
        person.setName("geng-mu");
        person.soutInfo();
    }
}
