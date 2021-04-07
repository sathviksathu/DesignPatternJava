package com.java.design.patterns.proxy.dynamic;

public class Person implements Human {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println(name+ " is talking");
    }

    @Override
    public void walk() {
        System.out.println(name+ " is walking");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
