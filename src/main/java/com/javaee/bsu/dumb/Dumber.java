package com.javaee.bsu.dumb;

public class Dumber extends Dumb {
    int id = 9;

    public Dumber() {
        System.out.println("Dumber constructor");
        id = this.getId();
        System.out.println("id = " + id);
    }

    @Override
    int getId() {
        return id;
    }
}
