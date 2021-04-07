package com.java.design.patterns.patterns.builder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        //This is the piecewise construction of Person object using multiple builders subclassing a
        //common parent class, so as to allow seamless switch between builders and complete the person
        //object.
        Person person = pb.
                lives()
                .atStreet("street No 6")
                .inCity("Hyderabad")
                .withPostalCode("500056")
                .works()
                .worksAt("Samsung")
                .AsA("Software Engineer")
                .forSalaryOf("100000")
                .build();
        System.out.println(person);
    }
}
