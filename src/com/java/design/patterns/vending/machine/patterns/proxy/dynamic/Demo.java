package com.java.design.patterns.vending.machine.patterns.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Demo {
    public static Human getProxyPerson(Person person, Class itf){
        return (Human) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class[] {itf},
                new LoggingHandler(person)
        );
    }
    public static void main(String[] args) {
        System.out.println("Instantiated directly using original ");
        Person sathvik = new Person("sathvik");
        sathvik.talk();
        sathvik.talk();
        sathvik.walk();
        System.out.println(sathvik);

        System.out.println("**********************************************");
        System.out.println();
        System.out.println("Instantiated using proxy to the orignal class");
        Human  ravi = getProxyPerson(sathvik, Human.class);
        ravi.walk();
        ravi.talk();
        ravi.walk();
        System.out.println(ravi);
    }
}
