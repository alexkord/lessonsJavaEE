package com.javaee.bsu.enums;

public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (ShapeAnonymClass f : ShapeAnonymClass.values()) {
            f.setShape(3, i--);
            System.out.println(f + " area = " + f.computeSquare());
        }
    }
}
