package com.learn.spring5.demo.ioc;

import com.learn.spring5.demo.config.LifeCycleCallBackConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LifeCycleCallBackConfig.class)
public class LifeCycleCallbackTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void name() {
        context.getBeanDefinitionNames();
    }
}