package com.learn.spring5.demo.ioc.example;

public class BeanConstructorInjection {
    private String name;

    public BeanConstructorInjection() {
        this.name = null;
    }

    public BeanConstructorInjection(String name) {
        this.name = name;
        System.out.println(name);
    }
}
