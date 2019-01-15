package com.learn.spring5.demo.ioc.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("default")
@Component
public class OneThing {

    @Bean
    public BeanConstructorInjection beanConstructorInjection() {
        return new BeanConstructorInjection();
    }

    @Bean
    public BeanConstructorInjection beanConstructorInjection_2() {
        return new BeanConstructorInjection(randomInstanceString());
    }

    @Bean
    public BeanConstructorInjection beanConstructorInjection_3() {
        return new BeanConstructorInjection(randomInstanceString());
    }

    @Bean
    String randomInstanceString() {
        double a = Math.random();
        //this value chages every time.
        return String.valueOf(a);
    }

}
