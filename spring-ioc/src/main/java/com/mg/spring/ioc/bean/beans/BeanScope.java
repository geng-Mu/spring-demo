package com.mg.spring.ioc.bean.beans;

public class BeanScope {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println(this + "SpringBean初始化!");
    }
}
