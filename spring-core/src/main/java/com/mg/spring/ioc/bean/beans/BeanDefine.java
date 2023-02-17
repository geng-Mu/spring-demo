package com.mg.spring.ioc.bean.beans;

public class BeanDefine {

    private String name;

    private String scope;

    private boolean lazyInit;

    private String initMethod;

    private String destoryMethod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getInitMethod() {
        return initMethod;
    }

    public void setInitMethod(String initMethod) {
        this.initMethod = initMethod;
    }

    public String getDestoryMethod() {
        return destoryMethod;
    }

    public void setDestoryMethod(String destoryMethod) {
        this.destoryMethod = destoryMethod;
    }

    public void init(){
        System.out.println("springBeanc初始化方法!");
    }

    public void destory(){
        System.out.println("springBean销毁方法!");
    }

    @Override
    public String toString() {
        return "BeanDefine{" +
                "name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", lazyInit=" + lazyInit +
                ", initMethod='" + initMethod + '\'' +
                ", destoryMethod='" + destoryMethod + '\'' +
                '}';
    }
}
