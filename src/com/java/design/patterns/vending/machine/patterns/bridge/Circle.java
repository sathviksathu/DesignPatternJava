package com.java.design.patterns.vending.machine.patterns.bridge;

/**
 * Special subclass of Shape, which HAS-A Drawer as an attribute
 * that can be built into the objects during run/compile time, instead of static binding in code itself.
 *
 * This is the essence of Bridge pattern, which decouples dependencies between a class's objects
 * and their attributes. So that, rather than static binding Object of the class can be composed
 * at run-time with expected attribute property.
 *
 * This greatly allows both Shape subclasses and Drawer implementations to grow independently.
 * As any Drawer implementation can be instantiated when creating object of shape subclass.
 * The functionality that Drawer is expected to bring in, can then be delegated to specific
 * implementations of drawer instance.
 *
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Drawer drawer) {
        this.radius = radius;
        this.drawer = drawer;
    }

    @Override
    public String draw() {
        return "A circle with radius "+radius+" "+drawer.draw();
    }
}
