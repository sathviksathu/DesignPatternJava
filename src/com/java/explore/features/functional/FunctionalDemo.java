package com.java.explore.features.functional;

import java.util.function.*;

public class FunctionalDemo {
    public static void main(String[] args) {
        System.out.println("===This is Predicate usage===");
        //Using the test method of Predicate
        Predicate<String> stringLen = (s) -> s.length() < 5;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 5");
        System.out.println(stringLen.negate().test("Apples")+"- Apples is not less than 5");

        System.out.println("===This is Consumer usage===");
        //Using the accept method of Consumer
        Consumer<String> consumeString = (consStr) -> System.out.println(consStr.toLowerCase());
        consumeString.accept("SATHUU");

        System.out.println("===This is Supplier usage===");
        //Using the get method of Consumer
        Supplier<String> stringSupplier = () -> "Java is fun";
        System.out.println(stringSupplier.get());

        System.out.println("===This is Function usage===");
        //Using the apply method of Consumer
        Function<String,Integer> converter = (funcStr) -> funcStr.length();
        System.out.println(converter.apply("Sathu"));

        System.out.println("===This is Binary Operator usage===");
        //Using the apply method of Binary operator
        BinaryOperator<String> addStrings = ( a, b) ->  a.concat(" "+b);
        System.out.println(addStrings.apply("sathvik","sathu"));

        System.out.println("===This is Unary Operator usage==");
        //Using the apply method of Unary operator
        UnaryOperator<String> unaryString = (a) -> a.toUpperCase();
        System.out.println("The uppercase of the sathu is "+ unaryString.apply("sathu"));

        /**
         * Another thing to notice, is that none of the arguments in
         * lambda expressions, have their types defined, this is because it is inferred
         * Since the Functional interfaces like BinaryOperator expect a String as result
         * lambda expression somewhat intelligently infers the types of input/outputs.
         */
    }


}
