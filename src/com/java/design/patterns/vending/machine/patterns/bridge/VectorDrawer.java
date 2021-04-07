package com.java.design.patterns.vending.machine.patterns.bridge;

/**
 * Class that implements Drawer and defines draw functionality using
 * vector methods.
 */
public class VectorDrawer implements Drawer {
    @Override
    public String draw() {
        return "Drawing using Vector methods...";
    }
}
