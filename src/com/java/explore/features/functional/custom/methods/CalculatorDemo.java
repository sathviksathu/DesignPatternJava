package com.java.explore.features.functional.custom.methods;

public class CalculatorDemo {
    //Lambdas using static method references
    static Calculator addCalc = Calculator::plusOp;
    static Calculator subCalc = Calculator::minusOp;
    static Calculator multCalc = Calculator::intoOp;

    public static void main(String[] args) {
        System.out.println("This is Demo of custom functional interface using method lambdas");
        System.out.println("Addition: 30 + 20 = "+ addCalc.op(20,30));
        System.out.println("Substraction: 30 - 20 = "+ subCalc.op(30,20));
        System.out.println("Multiplication: 30 * 20 = "+ multCalc.op(20,30));
    }
}
