package com.spring.basic_of_spring;

import java.io.IOException;

public interface EventLogger {
    void logEvent(Event event) throws IOException;
}
