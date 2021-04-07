package com.java.design.patterns.factory.plain.plan;

public class PlanDemo {
    public static void main(String[] args) {
        //Few variables needed for Demo
        final int MINUTES = 5;
        PlanType planType;

        System.out.println("=====FACTORY PATTERN DEMO======");
        //Creating instance of PlanFactory
        PlanFactory planFactory = new PlanFactory();

        System.out.println("====CREATING DOMESTIC PLAN=====");
        planType = PlanType.DOMESTIC;
        Plan domesticPlan = planFactory.getPlan(planType);
        domesticPlan.calculateBill(MINUTES);

        System.out.println("====CREATING ROAMING PLAN=====");
        planType = PlanType.ROAMING;
        Plan roamingPlan = planFactory.getPlan(planType);
        roamingPlan.calculateBill(MINUTES);
        RoamingPlan plan = new RoamingPlan();

        System.out.println("=====CREATING INTERNATONAL PLAN=====");
        planType = PlanType.INTERNATIONAL;
        Plan internationalPlan = planFactory.getPlan(planType);
        internationalPlan.calculateBill(MINUTES);
    }
}
