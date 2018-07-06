package com.mg.spring.di.constructor.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

@Getter
@Setter
public class TestConStructorDi {

    private String name;

    private ContructorDiSource contructorDiSource;

    public TestConStructorDi(String name, ContructorDiSource contructorDiSource) {
        this.name = name;
        this.contructorDiSource = contructorDiSource;
    }

    public void test(){
        System.out.println("测试" + this );
    }
}
