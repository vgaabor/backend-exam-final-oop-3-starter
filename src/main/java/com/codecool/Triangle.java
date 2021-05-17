package com.codecool;

public class Triangle {
    private int base;
    private int baseHeight;

    public Triangle(int newBase, int newBaseHeight) {
        base = newBase;
        baseHeight = newBaseHeight;
    }

    public String speak() {
        return "I'm a triangle";
    }

}
