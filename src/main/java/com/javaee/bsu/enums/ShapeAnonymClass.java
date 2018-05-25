package com.javaee.bsu.enums;

public enum ShapeAnonymClass {
    RECTANGLE, SQUARE, TRIANGLE {
        public double computeSquare() {
            return this.getA() * this.getB() / 2;
        }
    };
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
