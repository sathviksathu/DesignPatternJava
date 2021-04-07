package com.java.design.patterns.vending.machine.patterns.prototype.motivation;

public class ClassWithIssueOfCopy {
    public static void main(String[] args) {

       Person john = new Person(new String[]{"john","smith"}, new Address("London street",123));
        System.out.println("====John before copying====");
       System.out.println(john);
       //Suppose now you want to create a person, who lives in next house, say houseNumber 124, that's almost same
       //as above person john, with just name and one field of address different. So you may think of something like
       //this would do the trick.
        Person jane = john;
        jane.setNames(new String[]{"jane", "austin"});
        jane.getAddress().setHouseNumber(124);
        System.out.println("====John and Jane after copying====");
        System.out.println(jane);
        System.out.println(john);

        /**
         * As you can see, the copy is infact deep copy, where not just fields but even the references
         * are copied. Any change you perform to derivative object applies on parent object as well
         * implying some undesirable effects.
         *
         */
    }
}
