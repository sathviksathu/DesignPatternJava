package com.java.explore.features.functional;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class MethodLambda {

    public static void main(String[] args) {
        System.out.println("===This is example of using plain old lambdas===");
        //Plain old lambda function
        IntFunction<String> intToStringUsingLambda = (num) -> Integer.toString(num);
        System.out.println(intToStringUsingLambda.apply(5));

        //static method reference using ::
        System.out.println("===This is example of using static method as lambdas===");
        IntFunction<String> intToStringMethod = Integer::toString;
        System.out.println(intToStringMethod.apply(5));

        System.out.println("===This is example of using constructor method as lambdas===");
        //Lambdas made using a constructor
        Function<String,BigInteger> intToStringConstructor = BigInteger::new;
        System.out.println(intToStringConstructor.apply("123456789"));

        System.out.println("===This is example of using instance method as lambdas===");
        //Lambdas made from instance method
        Consumer<String> printer = System.out::println;
        printer.accept("Coming to you directly from lambda");

        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Sathu"));
    }

}
