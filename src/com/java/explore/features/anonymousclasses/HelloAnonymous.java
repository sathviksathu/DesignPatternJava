package com.java.explore.features.anonymousclasses;

public class HelloAnonymous {
    public static String name = "Sathu";


    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting();

        System.out.println("=====English Greeting=====");
        System.out.println( englishGreeting.sayHello());
        System.out.println( englishGreeting.sayHelloTo(name) );

        Greeting frenchGreeting = new Greeting() {

            @Override
            public String sayHello() {
                return "Bonjour"+name;
            }

            @Override
            public String sayHelloTo(String name) {
                return "Bonjour"+" "+name;
            }
        };

        System.out.println("=====French Greeting=====");
        System.out.println( frenchGreeting.sayHello());
        System.out.println( frenchGreeting.sayHelloTo(name) );


    }
}
