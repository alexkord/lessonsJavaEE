package com.javaee.bsu.shapes.action;

import com.javaee.bsu.shapes.action.entity.AbstractShape;

public abstract class PentagonAction implements IShapeAction {
    @Override
    public double computePerimeter(AbstractShape shape) {
        return 0;
    }
}
