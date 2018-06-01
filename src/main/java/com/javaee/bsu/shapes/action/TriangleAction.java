package com.javaee.bsu.shapes.action;

import com.javaee.bsu.shapes.action.entity.Triangle;

public class TriangleAction implements IShapeAction<Triangle> {

    @Override
    public double computeSquare(Triangle shape) {
        return 1 / 2 * shape.getA() * shape.getB() * Math.sin(shape.getAngle());
    }

    @Override
    public double computePerimeter(Triangle shape) {
        return shape.getA() + shape.getB() + shape.getC();
    }
}
