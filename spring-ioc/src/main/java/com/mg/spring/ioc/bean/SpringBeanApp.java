package com.mg.spring.ioc.bean;

import com.mg.spring.ioc.bean.beans.BeanScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanApp {
    public static void main(String[] args) {
        /**
         * SpringBean的定义:spring的配置属性包括id,class,scope,lazy-init,init-method,destory-method
         */
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
//        BeanDefine define = (BeanDefine)context.getBean("define");
//        System.out.println(define.toString());
//        context.registerShutdownHook();

        /**
         * SpringBean的作用域(通过SpringBean配置中的scope属性来实现):
         * 1.singleton:当scope的属性为singleton时,Spring容器中只存在一个当前类的实例对象
         * 2.prototype:当scope的属性为propetype是,每次从容器中获取当前类的实例时,都会返回一个新的实例对象
         *
         * WebApplicationContenxt环境中还包括以下作用域:
         * 1.requeset:每次Http请求时,spring容器都会创建一个新的实例
         * 2.session:同一个Http Session共享一个bean实例,不同的Session中使用不同的bean实例
         * 3.global-session:一般应用于Portlet应用环境
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        BeanScope singleton = (BeanScope)context.getBean("singletonScope");
        BeanScope singleton2 = (BeanScope)context.getBean("singletonScope");
        System.out.println("singleton = " + singleton + "|| singleton2 = " + singleton2);
        System.out.println(singleton == singleton2);
        //只用当调用对象的时候,容器才会实例化对象
        BeanScope propotype = (BeanScope)context.getBean("prototypeScope");
        BeanScope propotype2 = (BeanScope)context.getBean("prototypeScope");
        System.out.println("propotype = " + propotype + "|| propotype2 = " + propotype2);
        System.out.println(propotype == propotype2);

        /**
         *  SpringBean生命周期
         *  pringBean在实例化之前会调用init-method.在销毁前会调用destory-method
         */
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
//        context.registerShutdownHook();
    }
}
