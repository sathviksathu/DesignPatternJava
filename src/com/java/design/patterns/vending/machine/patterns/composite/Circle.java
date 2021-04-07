package com.java.design.patterns.vending.machine.patterns.composite;

/**
 * Leaf node objects of GraphicObject class.
 * This is signified by the fact that, they dont hold any List<> kind datastructure
 * which is responsible for giving the instance an oppurtunity to hold references of other objects.
 *
 * Also these are the nodes, where most of the magic happens, and almost all the calls
 * are delegated to until this point. No delegation is possible after this, and hence
 * any terminal logic that application needs to be handled must be written here.
 */
public class Circle extends GraphicObject{
    public Circle(String color) {
        this.name = "Circle";
        this.color = color;
    }
}
