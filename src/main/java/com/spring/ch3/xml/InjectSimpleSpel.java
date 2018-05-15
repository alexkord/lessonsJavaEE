package com.spring.ch3.xml;

public class InjectSimpleSpel {
    private String name;
    private int age;
    private float height;
    private boolean isProgrammer;
    private Long ageInSeconds;

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



