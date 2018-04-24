package com.spring.basic_of_spring;

public class FileEventLogger implements EventLogger {

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    private String filename;

    @Override
    public void logEvent(Event event) {
        event.setMsg(filename);
    }
}
