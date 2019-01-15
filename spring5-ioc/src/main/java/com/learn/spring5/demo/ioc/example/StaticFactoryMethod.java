package com.learn.spring5.demo.ioc.example;

public class StaticFactoryMethod {
    private static StaticFactoryMethod staticFactoryMethod = new StaticFactoryMethod();

    private StaticFactoryMethod() {
    }

    public static StaticFactoryMethod createInstance() {
        return staticFactoryMethod;
    }
}
