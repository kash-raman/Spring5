package com.learn.spring5.demo.ioc.example;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanNamingInnerBean {

    String name;

    @Autowired
    public BeanNamingInnerBean(String name) {
        this.name = name;
    }

    public BeanNamingInnerBean() {
    }
}

class InnerBean {
    String value;

    public InnerBean() {
    }

    public InnerBean(String value) {
        this.value = value;
    }
}
