package com.learn.spring5.demo.ioc.example;

public class NonStaticFactoryClass {
    public NonStaticFactoryClass() {
    }

    public static StaticFactoryMethod getClient() {
        return StaticFactoryMethod.createInstance();
    }
}
