package com.spring.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();
        MessageProvider messageProvider = (MessageProvider) ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:app-context-annotation.xml");
        context.refresh();
        MessageRenderer messageRenderer = (MessageRenderer) context.getBean("messageRenderer");
        messageRenderer.render();
    }
}
