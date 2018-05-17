package com.spring.ch3.annotation;

import org.springframework.stereotype.Controller;

@Controller("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "Alex Axent";
    private int age = 35;
    private float height = 1.86f;
    private boolean programmer = true;
    private Long ageInSeconds = 100984300L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}
