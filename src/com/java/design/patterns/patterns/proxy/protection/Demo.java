package com.java.design.patterns.patterns.proxy.protection;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Instantiated directly using the orignal class");
        Car car = new Car(new Driver(10));
        System.out.println(car.drive());

        System.out.println("**********************************************");
        System.out.println();
        System.out.println("Instantiated using proxy to the orignal class");

        Car proxyCar = new CarProxy(new Driver(10));
        System.out.println(proxyCar.drive());
    }
}
