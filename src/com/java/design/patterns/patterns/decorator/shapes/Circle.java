package com.java.design.patterns.patterns.decorator.shapes;

/**
 * This is the first level of decoration on top of your primitive shape,
 * where we are adding a radius and giving it info suggesting that, it's a Circle of certain radius.
 */
public class Circle implements Shape{
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void resize(int factor){
        this.radius*=factor;
    }

    @Override
    public String info() {
        return "This is a circle of radius "+radius;
    }
}
