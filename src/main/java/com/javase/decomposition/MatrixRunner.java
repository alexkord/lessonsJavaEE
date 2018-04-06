package com.javase.decomposition;

public class MatrixRunner {
    public static void run() {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixCreator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is " + p);
            Matrix q = new Matrix(3 ,4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is " + q);
            Multiplicator mult = new Multiplicator();
            System.out.println("Matrices product is " + mult.multiply(p, q));
        } catch (MatrixException me) {

        }
    }
}
