package com.spring.dependecy_types.dependency_pull;

import com.spring.ch3.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPull {
    public void pullExample() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        MessageRenderer mr = (MessageRenderer) ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
