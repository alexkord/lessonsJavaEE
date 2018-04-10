package com.javase.polymorphism;

public class Coin {
    private double diameter;

    public Coin(double diameter) {
        initDiameter(diameter);
    }

    private final void initDiameter(double value) {
        if (value > 0) {
            this.diameter = value;
        } else {
            System.out.println("Negative diameter");
        }
    }
}
