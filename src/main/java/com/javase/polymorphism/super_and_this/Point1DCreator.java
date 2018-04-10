package com.javase.polymorphism.super_and_this;

public class Point1DCreator {
    public Point1D createPoint() {
        System.out.println("Point1D");
        return new Point1D(1);
    }
}

class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}

class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}
