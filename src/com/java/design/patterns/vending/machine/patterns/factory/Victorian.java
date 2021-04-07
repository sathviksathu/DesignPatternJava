package com.java.design.patterns.vending.machine.patterns.factory;

public class Victorian extends Architecture{
    private Victorian() {
        //Marking constructor private to force user to use factory classes.
    }

    public static Victorian createVictorian(){
        return new Victorian();
    }

    @Override
    public String getType() {
        return "Victorian";
    }
}
