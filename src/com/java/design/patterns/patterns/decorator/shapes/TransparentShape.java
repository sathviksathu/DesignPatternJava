package com.java.design.patterns.patterns.decorator.shapes;

/**
 * Here's where the action is happening, as you can see that "Shape" has been
 * declared as an embedded variable of this class. Also, it has a constructor which takes
 * Shape as a parameter, this is what is the very essence of the decorator pattern, it allows you
 * to pass the very interface it implements to be passed on as a parameter, so that it can decorate
 * on top of that, in this case by providing a Transparency to the shape.
 *
 * This is like having String as a member variable and decorating it with getNumberofVowels functionality.
 *
 * You can build "a square", "a circle", "a red square", or "a blue circle" and
 * pass them into this constructor and decorate them with "50% Transparency" so you can get a "Transparent shape" or
 * "Transparent colored shape". This is the CRUX of RECURSIVE COMPOSTION. One of the coolest feature of
 * decorator pattern.
 */
public class TransparentShape implements Shape {
    private Shape shape;
    private int transparency;

    public TransparentShape() {
    }

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has a transparency of "+transparency+"%." ;
    }
}
