package com.spring.ch3;

import com.spring.ch3.annotation.InjectSimple;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

//        ctx.load("classpath:app-context-annotation.xml");
//        ctx.refresh();
////        MessageProvider provider = (MessageProvider) ctx.getBean("messageProviderConfig", MessageProvider.class);
////        System.out.println(provider.getMessage());
////
////        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
////        context.load("classpath:app-context.xml");
////        context.refresh();
////        ConstructorConfusion constructorConfusion = (ConstructorConfusion) context.getBean("constructorConfusion");
////        System.out.println(constructorConfusion);
//
//        com.spring.ch3.annotation.ConstructorConfusion constructorConfusion1 = (com.spring.ch3.annotation.ConstructorConfusion) ctx.getBean("constructorConfusionAnnotation");
//        System.out.println(constructorConfusion1);
//        ctx.load("classpath:app-context.xml");
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();
        InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(injectSimple);

    }
}
