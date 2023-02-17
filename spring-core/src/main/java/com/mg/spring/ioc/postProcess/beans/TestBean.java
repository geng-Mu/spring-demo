package com.mg.spring.ioc.postProcess.beans;

public class TestBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println(this + "SpringBean实例化方法!");
    }

    public void destory(){
        System.out.println(this + "SpringBean销毁方法");
    }
}
