package com.spring.first.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void runSpringContext() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("app-context.xml");
        MessageRenderer mr = (MessageRenderer) ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
