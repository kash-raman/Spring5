package com.learn.spring5.demo.ioc.example;

public class BeanNamingConvension {
    private String name;
    private String value;

    public BeanNamingConvension(String name, String value) {

        this.name = name;
        this.value = value;
        System.out.println("BeanNamingConvension XXXXXX" + toString());
    }

    public BeanNamingConvension() {
    }

    @Override
    public String toString() {
        return "BeanNamingConvension{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
