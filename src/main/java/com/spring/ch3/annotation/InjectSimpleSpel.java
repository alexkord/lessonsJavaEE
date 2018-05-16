package com.spring.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfig.name}")
    private String name;

    @Value("#{injectSimpleConfig.age}")
    private int age;

    @Value("#{injectSimpleConfig.height}")
    private float height;

    @Value("#{injectSimpleConfig.programmer}")
    private boolean isProgrammer;

    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

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



