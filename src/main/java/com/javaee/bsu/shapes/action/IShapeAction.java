package com.javaee.bsu.shapes.action;

import com.javaee.bsu.shapes.action.entity.AbstractShape;

public interface IShapeAction extends ILineGroupAction {
    double computeSquare(AbstractShape shape);
}
