package com.codecool;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int newA, int newB) {
        sideA = newA;
        sideB = newB;
    }

    public String speak() {
        return "I'm a rectangle";
    }
}
