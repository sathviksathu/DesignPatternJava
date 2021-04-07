package com.java.explore.features.generic.bounded;

import java.util.List;

public class GenericCanvas {
    public static void draw(Shape s){
        s.draw();
    }

    public static void drawAll(List<? extends Shape> shapes){
        for(Shape shape: shapes){
            shape.draw();
        }
    }
}
