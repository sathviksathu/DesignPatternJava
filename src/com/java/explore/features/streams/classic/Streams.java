package com.java.explore.features.streams.classic;

import com.java.explore.features.interfaces.dummy.DummyImpl;
import com.java.explore.features.interfaces.dummy.DummyInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * Stream operations are either intermediate or terminal.
 * Intermediate operations return a stream so we can chain
 * multiple intermediate operations without using semicolons.
 * Terminal operations are either void or return a non-stream result.
 *
 * List<String> myList =
 *     Arrays.asList("a1", "a2", "b1", "c2", "c1");
 *
 * myList
 *     .stream()
 *     .filter(s -> s.startsWith("c"))
 *     .map(String::toUpperCase)
 *     .sorted()
 *     .forEach(System.out::println);
 *
 * In the above example filter, map and sorted are intermediate operations whereas forEach is a terminal operation.
 */
public class Streams {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 1; i < 6; i++ ){
            numbers.add(i);
        }
        List<Integer> squares = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("====numbers====");
        numbers.stream().forEach(x -> System.out.println(" "+x.toString()));
        System.out.println("====squares=====");
        squares.stream().forEach(y -> System.out.println(" "+y.toString()));

        List<String> designPattens = new ArrayList<>();
        designPattens.add("Builder");
        designPattens.add("Singleton");
        designPattens.add("Factory");
        designPattens.add("Decorator");
        System.out.println("====design patterns====");
        designPattens.stream().forEach(s->System.out.println(" "+s));
        System.out.println("====Design Patterns sorted====");
        designPattens.stream().sorted().forEach(s->System.out.println(" "+s));
        System.out.println("====Design Patterns Filtered====");
        designPattens.
                stream().
                sorted().
                filter(s->s.contains("i")).
                forEach(s->System.out.println(" "+s));

        /**
         * #Processing Order IS VERTICAL and NOT HORIZONTAL#
         * Let's dive deeper into how stream operations are processed under the hood.
         * An important characteristic of intermediate operations is laziness.
         * Look at this sample where a terminal operation is missing:
         */
        System.out.println("==Output without terminal operation");
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });
        System.out.println("==simply doesn't exist==");
        /**
         * When executing this code snippet, nothing is printed to the console.
         * That is because intermediate operations will only be executed when a terminal operation is present.
         */
        System.out.println("==Output with terminal operation");
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
        System.out.println("==simply exists because of terminal operation==");
        /**
         * The order of the result might be surprising.
         * A naive approach would be to execute the operations horizontally one after another on all elements of the stream.
         * But instead each element moves along the chain vertically.
         * This neccessitates that lambda functions passed to filter() must be stateless and non-interfering,
         * that is, they should not change the underlying source of the stream
         * The first string "d2" passes filter then forEach, only then the second string "a2" is processed.
         */
        //For more information check
       //Link https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/





    }

    /**
     * Collections vs Java Streams
     * Java Streams are more concerned about the computation
     * Collections are more concerned about the Storage
     * Collections are in-memory structures, that is, they have a block of memory assigned to them
     * Streams on other hands are just views operating on the underlying stream source(Collections, Arrays,Generators etc)
     * Stream Pipeline = stream source + intermediate ops + terminal ops
     * operations are also defined to be either stateless or stateful
     * filter and map are mostly statless in that they dont need to see other elements from the stream to perform
     * their ops, however sorted(), distinct() are stateful in that, they buffer the stream until they see end-of-stream to compute the result and pass on to next stage.
     */
}
