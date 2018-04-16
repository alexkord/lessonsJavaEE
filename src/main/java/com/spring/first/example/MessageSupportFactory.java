package com.spring.first.example;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageRenderer messageRenderer;
    private MessageProvider messageProvider;

    private MessageSupportFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/oleg_cherednichenko/IdeaProjects/lessonsJavaEE/src/main/java/com/spring/first/example/msf.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            messageRenderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
