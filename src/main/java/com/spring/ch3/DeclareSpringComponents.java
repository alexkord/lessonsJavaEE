package com.spring.ch3;

import com.spring.ch3.annotation.InjectSimpleSpel;
import com.spring.ch3.xml.InjectRef;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml-bean-factory-config.xml");
        ctx.refresh();
        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }
}
