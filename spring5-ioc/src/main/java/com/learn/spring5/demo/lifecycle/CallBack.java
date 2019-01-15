package com.learn.spring5.demo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CallBack implements InitializingBean, DisposableBean {
    @PostConstruct
    public void postConstruct() {
        System.out.println("im in postConstruct");
    }

    public void init() {
        System.out.println("im in init ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in afterPropertiesSet");
    }

    public void sout() {
        System.out.println("im here");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DEstroy Me");
    }

    public void destroyConfig() throws Exception {
        System.out.println("DEstroy Config");
    }

    @PreDestroy
    public void Destroyanno() throws Exception {
        System.out.println("DEstroy Anootation");
    }

    public void close() {
        System.out.println("im in close method..");
    }
//
//    public void  shutdown() {
//        System.out.println("im in shutdown method..");
//    }
}
