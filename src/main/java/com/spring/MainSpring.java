package com.spring;

import com.spring.first.example.*;

public class MainSpring {
    public static void main(String[] args) {
//        MessageRenderer mr = new StandardOutMessageRenderer();
//        MessageProvider mp = new HelloWorldMessageProvider();
//        mr.setMessageProvider(mp);
//        mr.render();

        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}