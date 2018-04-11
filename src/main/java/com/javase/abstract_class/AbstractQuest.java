package com.javase.abstract_class;

public abstract class AbstractQuest {
    private long id;
    private String questContent;

    public abstract boolean check(Answer ans);
}
