package com.spring.basic_of_spring;

public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
