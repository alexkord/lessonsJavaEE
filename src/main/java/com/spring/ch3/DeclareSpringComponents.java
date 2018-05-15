package com.spring.ch3;

import com.spring.ch3.xml.ConstructorConfusion;
import com.spring.ch3.annotation.InjectSimple;
import com.spring.ch3.xml.InjectSimpleSpel;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();
        InjectSimpleSpel cc = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(cc);
    }
}
