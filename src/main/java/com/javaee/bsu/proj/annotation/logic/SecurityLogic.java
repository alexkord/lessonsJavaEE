package com.javaee.bsu.proj.annotation.logic;

import com.javaee.bsu.proj.annotation.SecurityLevelEnum;

import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum level, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for (Object arg : args) {
            argsString.append(arg.toString() + " :");
        }
        argsString.setLength(argsString.length() - 1);
        System.out.println(String.format("Method %S was invoked with parameters: %s", method.getName(),
                argsString.toString()));
        switch (level) {
            case LOW:
                System.out.println("LOW level of security service: " + level);
                break;
            case NORMAL:
                System.out.println("NORMAL level of security service: " + level);
                break;
            case HIGH:
                System.out.println("HIGH level of security service: " + level);
        }
    }
}
