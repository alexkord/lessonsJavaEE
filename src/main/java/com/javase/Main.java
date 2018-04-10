package com.javase;

import com.javase.decomposition.MatrixRunner;
import com.javase.enumeration.MelomanRunner;
import com.javase.enumeration.TaxiRunner;
import com.javase.polymorphism.CardRunner;
import com.javase.polymorphism.super_and_this.PointBuildRunner;
import com.javase.polymorphism.super_and_this.PointRunner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static String password = "ABCD";

    public static void main(String[] args) {

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
//                continue;
            }
        }
        return x;
    }

    private static void checkPassword() {
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
