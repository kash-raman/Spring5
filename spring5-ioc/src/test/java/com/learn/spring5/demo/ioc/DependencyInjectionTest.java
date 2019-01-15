package com.learn.spring5.demo.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class DependencyInjectionTest {
    @Test
    public void testInnerClassBeanNamingConversion() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependency-injection.xml");
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.asList(beanNames));
    }
}
