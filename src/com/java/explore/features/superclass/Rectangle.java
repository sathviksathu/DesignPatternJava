package com.java.explore.features.superclass;

import java.util.function.Function;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public String desc =" Drawing a Rectangle with dimensions: ";
    //Usage of functional interfaces.
    private Function<String,String> upperCaseConverter = (s) -> s.toUpperCase();


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        //This is the method from superclass, the subclass has access to all parent
        //class's protected or public members
        this.getDesc();
        /**
         * Uncommenting the below line will throw an error.
         * since the privGetDesc() has a private access in the parent class.
         */
        //this.privGetDesc();
    }

    @Override
    public void draw() {
        System.out.println( desc+ " width: "+this.width+" height: "+this.height);
    }


    //Just a side-show of functional interfaces.
    public void drawFunctional() {
        System.out.println(upperCaseConverter.apply(desc)+this.width+" height "+this.height);
    }

    @Override
    public void scale(int scaleFactor) {
        this.width*=scaleFactor;
        this.height*=scaleFactor;
    }

    public void rectangleOnlyMethod(){
        System.out.println("This is a method defined in rectangle only");
    }

}
