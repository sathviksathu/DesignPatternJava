package com.java.design.patterns.patterns.proxy.protection;


public class Car {
    public Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    protected String drive(){
        return ("vroom vroom");
    }
}
