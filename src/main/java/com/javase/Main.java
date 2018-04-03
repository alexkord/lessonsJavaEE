package com.javase;

import com.javase.param_class.Message;
import com.javase.simple_mvc.controller.TransferAction;
import com.javase.simple_mvc.model.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static String password = "ABCD";

    public static void main(String[] args) {
        Message message = new Message();
        message.setValue("Hello");
        System.out.println(message.getValue());
        message.setValue(12);
    }

    public static void workWithAccount() {
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

    private static String input() {
        String x;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a value: ");
                x = sc.next();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Please enter the correct value: ");
                continue;
            }
        }
        return x;
    }

    public static void checkPassword() {
        System.out.print("Enter a password: ");
        String pass = input();
        checkPassword();
    }

    private void checkInput(String val) {
        if (val.equalsIgnoreCase(password)) {
            System.out.println("Success!!!");
        } else {
            System.out.println("Try again");
            checkPassword();
        }
    }
}
