package com.java.design.patterns.vending.machine.patterns.factory;

public class Sofa extends Furniture {
    private Sofa() {
        //Marking constructor private to force user to use factory classes.
    }

    public static Sofa createSofa(){
        return new Sofa();
    }

    @Override
    public String getType() {
        return "Sofa";
    }
}
