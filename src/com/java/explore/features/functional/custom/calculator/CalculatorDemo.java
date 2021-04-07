package com.java.explore.features.functional.custom.calculator;

public class CalculatorDemo {
    //Using plain old lambdas
    static Calculator addCalc = (a,b) -> a + b;
    static Calculator subCalc = (a,b) -> a - b;
    static Calculator multCalc = (a,b) -> a * b;

    public static void main(String[] args) {
        System.out.println("This is Demo of custom functional interface using just lambdas");
        System.out.println("Addition: 30 + 20 = "+ addCalc.op(20,30));
        System.out.println("Substraction: 30 - 20 = "+ subCalc.op(30,20));
        System.out.println("Multiplication: 30 * 20 = "+ multCalc.op(20,30));
    }
}
