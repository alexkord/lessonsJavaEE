package com.spring.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:parent.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:app-context.xml");
        child.setParent(parent);
        child.refresh();

        SimpleTarget simpleTarget1 = (SimpleTarget) child.getBean("target1");
        SimpleTarget simpleTarget2 = (SimpleTarget) child.getBean("target2");
        SimpleTarget simpleTarget3 = (SimpleTarget) child.getBean("target3");

        System.out.println(simpleTarget1.getVal());
        System.out.println(simpleTarget2.getVal());
        System.out.println(simpleTarget3.getVal());
    }
}
