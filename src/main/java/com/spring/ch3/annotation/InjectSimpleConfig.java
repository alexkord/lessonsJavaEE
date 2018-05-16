package com.spring.ch3.annotation;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "Alex Axent";
    private int age = 35;
    private float height = 1.86f;
    private boolean isProgrammer = true;
    private Long ageInSeconds = 1009843200L;
}
