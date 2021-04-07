package com.java.design.patterns.patterns.bridge;

/**
 * This is a Shape superclass, which is parent for more
 * specialized Square and Cirlce subclasses.
 *
 * The more important attribute is that of Drawer, which acts as the bridge for
 * implementations of drawer classes. By having this as an attribute, allows for us
 * to compose concrete subclasses of Shape class at runtime, with any desired drawer.
 */
public class Shape {

    protected Drawer drawer;
public String draw(){
    return "implement draw method in subclasses";
}
}
