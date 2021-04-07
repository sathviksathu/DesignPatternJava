package com.java.design.patterns.vending.machine.patterns.decorator.shapes;

public class Demo {
    public static void main(String[] args) {

        // Just a square of side 10 right?, nothing special
        Square square = new Square(10);
        System.out.println(square.info());

        /**
         * Just wait, here's where things get interesting.
         * You have a colored shape constructor which has a circle constructor(which resolves to a shape),
         * with green color in it.
         * This is Recursive composition in action.
         * You have just decorated a circle with green color.
         */
        ColoredShape coloredCircle = new ColoredShape(new Circle(5),"green");
        System.out.println(coloredCircle.info());

        /**
         * Let's take things a step higher. You have transparent shape constrcutor which has,
         * a colored shape constructor which has
         * a square shape constrcutor, with red color
         * with 50% transparency.
         *
         * It's a 2 step decorator, you put square shape in red color and then u put in transparent shape
         * to get 50% transparency!!. BOOM, let that sink in.
         */
        TransparentShape transparentColoredSquare = new TransparentShape(
                new ColoredShape(new Square(10),"red"), 50);
        System.out.println(transparentColoredSquare.info());

    }
}
