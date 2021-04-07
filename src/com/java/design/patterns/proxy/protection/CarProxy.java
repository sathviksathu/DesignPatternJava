package com.java.design.patterns.proxy.protection;

public class CarProxy extends Car {

    public CarProxy(Driver driver) {
       super(driver);
    }

    @Override
    protected String drive() {
        if(driver.getAge() < 18){
            return ("You are not allowed to drive");
        }
        return   super.drive();
    }
}
