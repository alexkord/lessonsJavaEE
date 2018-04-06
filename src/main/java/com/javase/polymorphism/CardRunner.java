package com.javase.polymorphism;

public class CardRunner {
    public static void run() {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
        dc1.doPayment(15.5);
        dc2.doPayment(21.2);
        cc.doPayment(7.0);
        cc.checkCreditLimit();
    }
}
