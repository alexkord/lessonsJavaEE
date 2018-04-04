package com.javase.immutable_object;

public class ImmutableObject implements Viewer {
    private int id;
    private String name;

    public ImmutableObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object show(Object o) {
        return this;
    }

    @Override
    public String toString() {
        return "id = " + id + "; name: " + name;
    }
}
