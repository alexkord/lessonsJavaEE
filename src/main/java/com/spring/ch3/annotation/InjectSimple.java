package com.spring.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {
    @Value("Alex Axent")
    private String name;
    @Value("35")
    private int age;
    @Value("1.86")
    private float height;
    @Value("true")
    private boolean isProgrammer;
    @Value("1000990001122")
    private Long ageInSeconds;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimple-> \n" +
                "name : " + name + "\n" +
                "age : " + age + "\n" +
                "height : " + height + "\n" +
                "isProgrammer : " + isProgrammer + "\n" +
                "ageInSeconds : " + ageInSeconds;
    }
}
