package com.java.explore.features.generic.bounded;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drwaing a Circle of radius: "+this.radius);
    }
}
