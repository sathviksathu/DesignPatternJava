package com.java.design.patterns.vending.machine.patterns.prototype.copyThroughSerialization;

import org.apache.commons.lang3.SerializationUtils;

public class ClassWithIssueOfCopyResolved {
    public static void main(String[] args) {

       Person john = new Person(new String[]{"john","smith"}, new Address("London street",123));
        System.out.println("====John before copying====");
       System.out.println(john);
        /**
         * Problem with usage of copy constructor is that, each field of the object
         * has to be manually intialized from the object being cloned. Imagine a class
         * having 20 fields. having field-by-field copy of 20 variables, wont look cool right?
         * That's where copy-through-serializtion comes in, where we use some seriously cool
         * SerializaitonUtils() class methods, to help us achieve the same result as copy constuctor
         * is having. For this it is important for the Class to implement "serializable" interface.
         */
        Person jane = (Person) SerializationUtils.clone(john);
        jane.setNames(new String[]{"jane", "austin"});
        jane.getAddress().setHouseNumber(124);
        System.out.println("====John and Jane after copying====");
        System.out.println(jane);
        System.out.println(john);
    }
}
