package com.javaee.bsu.shapes.action.entity;

public abstract class AbstractShape {
    private double a;

    public AbstractShape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}
