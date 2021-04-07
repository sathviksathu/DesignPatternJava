package com.java.design.patterns.vending.machine.patterns.bridge;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(4,new RasterDrawer());
        Shape square = new Square(5,new VectorDrawer());

        System.out.println(circle.draw());
        System.out.println(square.draw());

    }
}
