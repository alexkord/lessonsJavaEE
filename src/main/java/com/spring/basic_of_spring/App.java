package com.spring.basic_of_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;
    private Event event;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public App() {
    }

    public void logEvent(String msg) {
        //String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }

    public static void startAppContext() {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        app.logEvent("Hello, Alex");
    }
}
