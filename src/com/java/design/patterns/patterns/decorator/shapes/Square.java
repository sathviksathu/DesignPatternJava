package com.java.design.patterns.patterns.decorator.shapes;

/**
 * This is the first level of decoration on top of your primitive shape,
 * where we are adding a radius and giving it info suggesting that, it's a Circle of certain radius.
 */
public class Square implements Shape{
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public void resize(int factor){
        this.side*=factor;
    }

    @Override
    public String info() {
        return "This is a Square of side "+side;
    }
}
