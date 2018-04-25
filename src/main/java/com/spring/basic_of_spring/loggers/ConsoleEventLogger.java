package com.spring.basic_of_spring.loggers;

import com.spring.basic_of_spring.beans.Event;

public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
