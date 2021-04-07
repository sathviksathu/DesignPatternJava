package com.java.explore.features.superclass;

/**
 * This is an abstract class.
 * FEW BULLET POINTS NOW:
 * 1. It can have it's own member variables(final/non-final)
 * 2. It can have methods with concrete implementation like getDesc()
 * 3. It can have abstract methods like draw() and scale()
 * 4. Presence of any one abstract methods deems to make the entire class abstract.
 */
public abstract class Shape {
    private final String desc = "This is a geometric Shape";
    private String nonFinalDesc = "This is a non-final member variable";
    public void getDesc(){
        System.out.println(""+desc);
    }
    private void privGetDesc(){
        System.out.println("This is private and not accessible outside class");
    }
    public abstract void draw();
    public abstract void scale(int scaleFactor);
}
