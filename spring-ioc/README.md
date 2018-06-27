#spring-ioc
spring IOC容器是spring框架的核心,其底层是依赖于Java的反射机制;

#核心内容
1.BeanFactory
    对Bean进行维护的工厂,使用了工厂模式(设计模式)

2.ApplicationContext
    ApplicationContext继承了BeanFactory的子接口,提供了bean的获取等方法.

#IOC和DI的区别:
IOC比较偏向与一种思想,即之前我们需要自己维护的对象现在交给spring去维护
DI比较偏向于一种具体的实现,即在维护对象的时候,如果依赖于其他对象,spring通过DI实现(被注入对象依赖IOC容器配置依赖对象)
相同点:其底层都是依赖于Java的反射机制实现的.

#本模块主要介绍
1.BeanFactory:BeanFactory 目前使用很少,但仍可在轻量级应用中使用，比如移动设备或者基于 applet 的应用程序。
2.ApplicationContext:相对于BeanFactory,拥有更多的功能
3.springBean的实例化
     


