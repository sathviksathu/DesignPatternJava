package com.java.design.patterns.patterns.builder;

public class Person {
    //address
    public String street, city, postalcode;

    //employment
    public String company, position, salary;

    @Override
    public String toString() {
        return "Person: {"+
                "{address: "+
                " Street: "+street+
                " city: "+city+
                " postalCode: "+postalcode+
                " },"+
                "{Employment: "+
                " company: "+company+
                " position: "+position+
                " salary: "+salary+
                " }"+
                "}";
    }
}
