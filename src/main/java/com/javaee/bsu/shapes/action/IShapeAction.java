package com.javaee.bsu.shapes.action;

import com.javaee.bsu.shapes.action.entity.AbstractShape;

public interface IShapeAction <T extends AbstractShape> {
    double computeSquare(T shape);
    double computePerimeter(T shape);
}
