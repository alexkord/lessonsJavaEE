package com.spring.ch3;

import com.spring.ch3.annotation.InjectSimpleSpel;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();
        InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(injectSimpleSpel);
    }
}
