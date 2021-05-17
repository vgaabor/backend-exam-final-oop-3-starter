package com.codecool;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int newA, int newB) {
        this.sideB = newA;
        this.sideB = newB;
    }

    @Override
    public int getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public String speak() {
        return "I'm a rectangle";
    }
}
