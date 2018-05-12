package com.spring.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.refresh();
        ctx.load("classpath:app-context-annotation.xml");
        MessageProvider provider = (MessageProvider) ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(provider.getMessage());
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load("classpath:app-context-annotation.xml");
//        context.refresh();
//        MessageProvider provider = (MessageProvider) context.getBean("messageProvider", MessageProvider.class);
//        System.out.println(provider.getMessage());
    }
}
