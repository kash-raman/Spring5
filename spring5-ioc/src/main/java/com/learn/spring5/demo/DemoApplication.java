package com.learn.spring5.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        new SpringApplication(DemoApplication.class).run(args);

//	var ctx= new SpringApplication(DemoApplication.class);
//		ctx.addListeners(new DemoListener());
//			ctx .run(args);

    }

    @Order(3)
    @Bean
    public ApplicationRunner roadRunner() {
        return args -> System.out.println("Road..... Road... road");
    }
}
