package com.javase.simple_mvc.controller;

import com.javase.simple_mvc.model.Account;

public class AcountClassRunner {
    public static void run() {
        Account account1 = new Account(78031864L, 258.5);
        Account account2 = new Account(78031865L, 12.1);
        TransferAction.transactionAmount = 10;
        TransferAction.transferIntoAccount(account1, account2);
        System.out.println(account2.getAmount());
        System.out.println(account1.getAmount());
        System.out.println("*********************");
        TransferAction.transactionAmount = 11.5;
        TransferAction.transferIntoAccount(account2, account1);
        System.out.println(account2.getAmount());
        System.out.println(account1.getAmount());
    }
}
