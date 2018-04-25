package com.spring.basic_of_spring.loggers;

import com.spring.basic_of_spring.beans.Event;

import java.io.IOException;

public interface EventLogger {
    void logEvent(Event event);
}
