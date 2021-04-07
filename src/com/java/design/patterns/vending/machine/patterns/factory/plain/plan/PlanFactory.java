package com.java.design.patterns.vending.machine.patterns.factory.plain.plan;

public class PlanFactory {

    public Plan getPlan(PlanType plan){
        switch (plan){
            case DOMESTIC:
                return new DomesticPlan();
            case ROAMING:
                return new RoamingPlan();
            case INTERNATIONAL:
                return new InternationalPlan();
            default:
                return new DomesticPlan();
        }
    }
}
