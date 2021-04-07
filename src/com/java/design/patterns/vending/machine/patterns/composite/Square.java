package com.java.design.patterns.vending.machine.patterns.composite;

/**
 * Leaf node objects of GraphicObject class.
 * For other but necessary information look in Circle.java
 */
public class Square extends GraphicObject{

    public Square(String color) {
       this.name = "Square";
       this.color = color;
    }
}
