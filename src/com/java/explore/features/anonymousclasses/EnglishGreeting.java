package com.java.explore.features.anonymousclasses;

public class EnglishGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String sayHelloTo(String name) {
        return "Hello"+" "+name;
    }
}
