package com.java.design.patterns.vending.machine.patterns.builder;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person){
        this.person = person;
    }

    public PersonJobBuilder worksAt(String company){
        person.company = company;
        return this;
    }

    public PersonJobBuilder AsA(String position){
        person.position = position;
        return this;
    }

    public PersonJobBuilder forSalaryOf(String salary){
        person.salary = salary;
        return this;
    }
}
