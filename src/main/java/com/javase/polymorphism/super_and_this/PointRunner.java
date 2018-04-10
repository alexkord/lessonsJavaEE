package com.javase.polymorphism.super_and_this;

public class PointRunner {
    public static void run() {
        PointReport d = new PointReport();
        d.printReport(new Point1D(-7));
        d.printReport(new Point2D(3, 4));
        d.printReport(new Point3D(3, 4, 5));
    }
}
