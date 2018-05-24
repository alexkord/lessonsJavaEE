package com.javaee.bsu.inheritance;

public class CreditCardAction extends AbstractCardAction {

    @Override
    public void doPayment(double paymentAmount) {
        System.out.println("complete from credit card");
    }
}
