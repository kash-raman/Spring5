package com.learn.spring5.demo.config;

import com.learn.spring5.demo.ioc.example.BeanNamingConvension;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource(locations = "classpath:java-bean-naming-context.xml")
@ComponentScan("com.learn.spring5.demo.ioc.example")
@Import(BeanStaticNamingConfiguration.class)
public class BeanNamingConfiguration {

    @Bean({"beanedId", "beanId", "d"})
    public BeanNamingConvension beanedId() {
        return new BeanNamingConvension();
    }

    @Bean
    public BeanNamingConvension beanedAnother() {
        return new BeanNamingConvension(oneInstanceOnly(), null);
    }

    @Bean
    public BeanNamingConvension beanParamId() {
        return new BeanNamingConvension(oneInstanceOnly(), oneInstanceOnly());
    }

    //TODO inner class
    @Bean
    String oneInstanceOnly() {
        int a = RandomUtils.nextInt();
        return String.valueOf(a);
    }

}
