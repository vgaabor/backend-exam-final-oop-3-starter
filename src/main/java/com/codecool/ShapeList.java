package com.codecool;

import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> Shapes;

    public void ShapeList() {
        this.Shapes = new ArrayList<Shape>();
    }

    public void add(Shape newShape) {
        Shapes.add(newShape);
    }

    public Shape getLargest() {
        int maxArea = 0;
        Shape maxShape = new Shape();
        for (int i = 0; i < this.Shapes.size(); i++) {
            if (maxArea < this.Shapes.get(i).getArea()) {
                maxArea = this.Shapes.get(i).getArea();
                maxShape = this.Shapes.get(i);
            }
        }
        return maxShape;
    }

    public String compareArea(Shape shapeA, Shape shapeB) {
        if (shapeA.getArea() == shapeB.getArea()) {
            return "Equal areas";
        } else {
            return (shapeA.getArea() > shapeB.getArea() ? shapeA.speak() : shapeB.speak());
        }
    }
}
