package com.javase.simple_mvc.model;

public class Card {
    public final int ID = (int)(Math.random() * 10_000_000);
    public final long BANK_ID;

    public Card(long BANK_ID) {
        this.BANK_ID = BANK_ID;
    }
}
