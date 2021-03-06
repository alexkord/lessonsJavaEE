package com.spring.ch3.xml;

public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean isProgrammer;
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
