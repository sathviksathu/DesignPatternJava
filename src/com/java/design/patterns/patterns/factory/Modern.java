package com.java.design.patterns.patterns.factory;

public class Modern extends Architecture {
    private Modern() {
        //Marking constructor private to force user to use factory classes.
    }

    public static Modern createModern(){
        return new Modern();
    }

    @Override
    public String getType() {
        return "Modern";
    }
}
