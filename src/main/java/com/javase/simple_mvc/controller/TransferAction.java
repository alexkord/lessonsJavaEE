package com.javase.simple_mvc.controller;

import com.javase.simple_mvc.model.Account;

public class TransferAction {
    public static double transactionAmount;
    private int id;


    public static boolean transferIntoAccount(Account from, Account to) {
        double demand = from.getAmount() - transactionAmount;
        if (demand >= 0) {
            from.setAsset(demand);
            to.addAsset(transactionAmount);
            return true;
        } else {
            return false;
        }
    }
}
