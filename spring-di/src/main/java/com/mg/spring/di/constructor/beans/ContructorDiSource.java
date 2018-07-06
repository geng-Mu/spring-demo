package com.mg.spring.di.constructor.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContructorDiSource {

    public ContructorDiSource(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sourceMethod(){
        System.out.println(this + " : " +this.getName());
    }
}
