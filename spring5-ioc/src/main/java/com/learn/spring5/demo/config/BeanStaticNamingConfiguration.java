package com.learn.spring5.demo.config;

import com.learn.spring5.demo.ioc.example.NonStaticFactoryClass;
import com.learn.spring5.demo.ioc.example.StaticFactoryMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanStaticNamingConfiguration {

    @Bean
    private static StaticFactoryMethod clientInstanceService() {
        return StaticFactoryMethod.createInstance();
    }

    @Bean
    static StaticFactoryMethod clientService0() {
        System.out.println("inside clientService)))))))");
        return StaticFactoryMethod.createInstance();
    }

    @Bean
    NonStaticFactoryClass factoryClass() {
        return new NonStaticFactoryClass();
    }

    @Bean
    NonStaticFactoryClass factoryDuplicate() {
        return factoryClass();//TODO has 2 beans. How many instance in run time?
    }

    @Bean
    StaticFactoryMethod factoryMethod() {
        return NonStaticFactoryClass.getClient();
    }


}
