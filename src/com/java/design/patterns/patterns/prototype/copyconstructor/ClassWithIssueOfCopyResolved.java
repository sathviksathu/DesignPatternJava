package com.java.design.patterns.patterns.prototype.copyconstructor;

public class ClassWithIssueOfCopyResolved {
    public static void main(String[] args) {

       Person john = new Person(new String[]{"john","smith"}, new Address("London street",123));
       System.out.println("====John before copying====");
       System.out.println(john);
       //Let's now make use of copy constructor, of our now able person and address classes
       //to actually make a good useable clone of john
       Person jane = new Person(john);
        jane.setNames(new String[]{"jane", "austin"});
        jane.getAddress().setHouseNumber(124);
        System.out.println("====John and Jane after copying====");
        System.out.println(jane);
        System.out.println(john);

        /**
         * As you can see, the copy constructor allows you to safely clone one object from other
         * so that you can make subsequent customizations on a base prototype. Allowing for
         * quick creation of several objects having very minor differences. Only the incremental
         * changes need to be accounter for. This is the crux of Prototype pattern.
         */
    }
}
