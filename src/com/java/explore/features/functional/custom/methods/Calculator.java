package com.java.explore.features.functional.custom.methods;

@FunctionalInterface
public interface Calculator {
    int op(int a, int b);

    static int plusOp(int a, int b){
        return a + b;
    }

    static int minusOp(int a, int b){
        return a - b;
    }

    static int intoOp(int a, int b){
        return a * b;
    }
}
