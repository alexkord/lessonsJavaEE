package com.javaee.bsu.dumb;

public class Dumb extends Object {
    {
        this.id = 6;
    }
    int id;

    public Dumb() {
        System.out.println("Dumb constructor");
        this.id = getId();
        System.out.println("id = " + id);
    }

    int getId() {
        System.out.println("getId() Dumb class");
        return id;
    }
}

