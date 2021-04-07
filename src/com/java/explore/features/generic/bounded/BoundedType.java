package com.java.explore.features.generic.bounded;

import java.util.ArrayList;
import java.util.List;

public class BoundedType {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        rectangles.addAll(createRecatangles());
        circles.addAll(createCircles());
        shapes.addAll(rectangles);
        shapes.addAll(circles);
        System.out.println("====Plain Old Canvas====");
        Canvas.drawAll(shapes);
        //As the drawAll method in Canvas is not paramtrized to
        //take List of Rectangle or Circle and hence the below lines
        //Compilation error.
        //Canvas.drawAll(rectangles);
        //Canvas.drawAll(circles);

        //However we can refactor the Canvas class to inhabit the goodness of generics
        // making use of the wildcard entries
        System.out.println("===Goodness of Generics====");
        GenericCanvas.drawAll(shapes);
        GenericCanvas.drawAll(rectangles);
        GenericCanvas.drawAll(circles);

    }

    private static List<Circle> createCircles() {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(4));
        circles.add(new Circle(5));
        return circles;
    }

    private static List<Rectangle> createRecatangles() {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10,20));
        rectangles.add(new Rectangle(20,30));
        return rectangles;
    }
}
