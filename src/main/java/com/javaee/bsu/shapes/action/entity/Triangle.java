package com.javaee.bsu.shapes.action.entity;

public class Triangle extends AbstractShape {
    private double b;
    private double angle;

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getAngle() {
        return angle;
    }

    public double getC() {
        double c = Math.sqrt((Math.pow(getA(), 2) + Math.pow(b, 2)) - 2 * getA() * b * Math.cos(angle));
        return c;
    }
}
