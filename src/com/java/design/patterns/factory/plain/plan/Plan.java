package com.java.design.patterns.factory.plain.plan;

public abstract class Plan {
    private double rate;

    public Plan(double rate) {
        this.rate = rate;
    }

    public void calculateBill(int units){
        System.out.println("Bill: "+ (units*rate));
    }

}
