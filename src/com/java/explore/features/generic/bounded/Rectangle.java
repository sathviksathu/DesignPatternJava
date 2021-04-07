package com.java.explore.features.generic.bounded;

public class Rectangle extends Shape {
    private int breadth;
    private int height;

    public Rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle of breadth: "+this.breadth+" height: "+this.height);
    }
}
