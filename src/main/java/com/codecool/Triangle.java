package com.codecool;

public class Triangle extends Shape{
    private int base;
    private int baseHeight;

    public Triangle(int newBase, int newBaseHeight) {
        this.base = newBase;
        this.baseHeight = newBaseHeight;
    }

    @Override
    public int getArea() {
        return this.base * this.baseHeight / 2;
    }

    @Override
    public String speak() {
        return "I'm a triangle";
    }

}
