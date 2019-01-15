package com.learn.spring5.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DemoListener implements ApplicationListener<ApplicationEvent> {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("event " + event);
    }


}
