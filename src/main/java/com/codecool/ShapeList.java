package com.codecool;

import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> Shapes;

    public void ShapeList() {
        this.Shapes = new ArrayList<Shape>();
    }

    public void add(Shape newShape) {
        this.Shapes.add(newShape);
    }

    public Shape getLargest() {
        if (this.Shapes.isEmpty()) {
            return null;
        } else {
            int maxArea = 0;
            Shape maxShape = null;

            for (int i = 0; i < this.Shapes.size(); i++) {
                if (maxArea < this.Shapes.get(i).getArea()) {
                    maxArea = this.Shapes.get(i).getArea();
                    maxShape = this.Shapes.get(i);
                }
            }
            return maxShape;
        }
    }

    public String compareArea(Shape shapeA, Shape shapeB) {
        if (shapeA.getArea() == shapeB.getArea()) {
            return "Equal areas";
        } else {
            return (shapeA.getArea() > shapeB.getArea() ? shapeA.speak() : shapeB.speak());
        }
    }
}
