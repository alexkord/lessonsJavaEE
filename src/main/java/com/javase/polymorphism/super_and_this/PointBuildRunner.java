package com.javase.polymorphism.super_and_this;

public class PointBuildRunner {
    public static void run() {
        Point2DCreator br = new Point3DCreator();
        Point2D p = br.createPoint();
        System.out.println(br.createPoint());
    }
}
