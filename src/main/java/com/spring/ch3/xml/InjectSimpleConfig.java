package com.spring.ch3.xml;

public class InjectSimpleConfig {
    private String name = "Alex Axent";
    private int age = 35;
    private float height = 1.86f;
    private boolean isProgrammer = true;
    private Long ageInSeconds = 1009843200L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}
