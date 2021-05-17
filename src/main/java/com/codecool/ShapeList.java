package com.codecool;

import java.util.ArrayList;

public class ShapeList {
    private ArrayList Shape;

    public void add(Shape newShape) {
        Shape.add(newShape);
    }

    public Shape getLargest() {
        return (com.codecool.Shape) Shape.get(0);
    }
}
