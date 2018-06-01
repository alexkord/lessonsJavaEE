package com.javaee.bsu.shapes;

import com.javaee.bsu.shapes.action.IShapeAction;
import com.javaee.bsu.shapes.action.RectangleAction;
import com.javaee.bsu.shapes.action.TriangleAction;
import com.javaee.bsu.shapes.action.entity.Rectangle;
import com.javaee.bsu.shapes.action.entity.Triangle;
import static java.lang.Math.PI;

public class ActionMain {
    public static void main(String[] args) {
        IShapeAction<Rectangle> actionRect = new RectangleAction();
        IShapeAction<Triangle> actionTrian = new TriangleAction();
        try {
            Rectangle rectShape = new Rectangle(2, 3);
            System.out.println("Square rectangle: " + actionRect.computeSquare(rectShape));
            System.out.println("Perimeter rectangle: " + actionRect.computePerimeter(rectShape));

            Triangle trShape = new Triangle(3, 4, PI / 6);
            System.out.println("Square triangle: " + actionTrian.computeSquare(trShape));
            System.out.println("Perimeter triangle: " + actionTrian.computePerimeter(trShape));
        } catch (ClassCastException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
