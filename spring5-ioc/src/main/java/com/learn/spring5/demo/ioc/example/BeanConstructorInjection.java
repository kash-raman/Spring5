package com.learn.spring5.demo.ioc.example;

import org.springframework.stereotype.Component;

public class BeanConstructorInjection {
    public BeanConstructorInjection() {
        this.name=null;
    }

    public BeanConstructorInjection(String name) {
        this.name = name;
        System.out.println(name);
    }

    private String name;
}
