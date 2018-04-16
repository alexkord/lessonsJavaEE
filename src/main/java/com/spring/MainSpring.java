package com.spring;

import com.spring.first.example.HelloWorldMessageProvider;
import com.spring.first.example.MessageProvider;
import com.spring.first.example.MessageRenderer;
import com.spring.first.example.StandardOutMessageRenderer;

public class MainSpring {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
