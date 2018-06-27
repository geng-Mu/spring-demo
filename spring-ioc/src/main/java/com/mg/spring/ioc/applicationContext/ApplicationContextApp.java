package com.mg.spring.ioc.applicationContext;

import com.mg.spring.ioc.beanFactory.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextApp {
    public static void main(String[] args) {
        //ApplicaitonContext接口最常使用的几种实现:
        //1.ClassPathXmlApplicationContext:此种实现spring会从classpath中读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Person person = (Person)context.getBean("per");
        person.setName("geng-Mu");
        person.setAge(18);
        person.soutInfo();

        //2.FileSystemXmlApplciationContext:此实现spring从给定路径加载配置文件
//        ApplicationContext context = new FileSystemXmlApplicationContext("E:/github/spring-demo/spring-ioc/src/main/resources/spring-context.xml");
//        Person person = (Person)context.getBean("per");
//        person.setName("geng-Mu");
//        person.setAge(18);
//        person.soutInfo();


        //3.WebXmlApplicationContext:次实现spring从Web应用程序范围内加载配置文件(spring-mvc模块有demo)


    }
}
