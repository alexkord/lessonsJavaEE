package com.javase.simple_mvc.model;

public class Account {
    private long id;
    private double amount;

    public Account(long id) {
        this.id = id;
    }

    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public void setAsset(double demand) {
        this.amount = demand;
    }

    public void addAsset(double transactionAmount) {
        this.amount += transactionAmount;
    }
}
