package com.codecool;

import java.util.ArrayList;

public class ShapeList {
    private ArrayList Shapes;

    public void add(Shape newShape) {
        Shapes.add(newShape);
    }

    public Shape getLargest() {
        return (com.codecool.Shape) Shapes.get(0);
    }

    public String compareArea(Shape shapeA, Shape shapeB) {
        if (shapeA.getArea() == shapeB.getArea()) {
            return "Equal areas";
        } else {
            return (shapeA.getArea() > shapeB.getArea() ? shapeA.speak() : shapeB.speak());
        }
    }
}
