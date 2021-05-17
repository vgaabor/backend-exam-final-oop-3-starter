package com.codecool;

public class Square extends Shape {
    private int side;

    public Square(int newSide) {
        this.side = newSide;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    @Override
    public String speak() {
        return "I'm a square";
    }

}
