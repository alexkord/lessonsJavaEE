package com.javaee.bsu.entity;

public class Order {
    private int id;
    static int bonus;
    public final int MIN_MAX = 8 + (int) (Math.random() * 5);
    public final static int PURHASE_TAX = 6;

    public double calculatePrice(double price, int counter) {
        double amount;
        amount = (price- bonus) * counter;
        double tax = amount * PURHASE_TAX /100;
        return amount * tax;
    }
}
