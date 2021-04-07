package com.java.design.patterns.vending.machine.patterns.proxy.protection;


public class Car {
    public Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    protected String drive(){
        return ("vroom vroom");
    }
}
