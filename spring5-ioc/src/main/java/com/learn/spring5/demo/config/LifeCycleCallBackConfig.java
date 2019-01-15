package com.learn.spring5.demo.config;

import com.learn.spring5.demo.lifecycle.CallBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:callback.xml")
public class LifeCycleCallBackConfig {
    @Bean
    CallBack callBackMe() {
        return new CallBack();
    }

}
