package com.spring.basic_of_spring;

public class FileEventLogger implements EventLogger {
    private String filename;

    @Override
    public void logEvent(Event event) {
        event.setMsg(filename);
    }
}
