package com.java.design.patterns.patterns.factory;

public class Chair extends Furniture {
    private Chair() {
        //Marking constructor private to force user to use factory classes.
    }

    public static Chair createChair(){
        return new Chair();
    }

    @Override
    public String getType() {
        return "Chair";
    }
}
