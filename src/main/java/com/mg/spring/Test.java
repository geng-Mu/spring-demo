package com.mg.spring;

import lombok.Data;

@Data
public class Test {

    private String name;

    public void test(){
        System.out.println("SpringTest");
    }
}
