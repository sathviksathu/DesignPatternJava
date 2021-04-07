package com.java.design.patterns.vending.machine.patterns.decorator.shapes;

/**
 * Here's where the action is happening, as you can see that "Shape" has been
 * declared as an embedded variable of this class. Also, it has a constructor which takes
 * Shape as a parameter, this is what is the very essence of the decorator pattern, it allows you
 * to pass the very interface it implements to be passed on as a parameter, so that it can decorate
 * on top of that, in this case by providing a color to the shape.
 *
 * This is like having String as a member variable and decorating it with getNumberofVowels functionality.
 *
 * You can build "a square", "a circle", "a transparent square", or "a transparent circle" and
 * pass them into this constructor and decorate them with "red color" so you can get a "colored shape" or
 * "colored transparent shape". This is the CRUX of RECURSIVE COMPOSTION. One of the coolest feature of
 * decorator pattern.
 */
public class ColoredShape implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape() {
    }

    public ColoredShape(Shape shape,String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info()+ " of color " + this.color ;
    }
}
