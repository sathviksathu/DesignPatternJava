package com.java.design.patterns.bridge;

public class Square extends Shape{
    private int side;

    public Square(int side, Drawer drawer) {
        this.side = side;
        this.drawer = drawer;
    }

    @Override
    public String draw() {
        return "A Square with side "+ side + " "+drawer.draw();
    }
}
