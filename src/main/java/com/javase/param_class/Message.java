package com.javase.param_class;

public class Message <T extends Object> {
    private T value;

    public Message() {
    }

    public Message(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
