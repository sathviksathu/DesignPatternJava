package com.java.explore.features.functional.collections;

import java.util.*;
import java.util.function.Predicate;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sathu","sush","virat", "anushka");

        //way to sort prior to Java 8 lambdas
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        //If you can observe, the comparator seems to be single method interface
        //Now all your functional programming neurons must fire, indicating possible conversion.

        /**
         * Let's attempt to refactor the old way using lambdas
         */

        //First we will try lambdas
        Collections.sort(names,(String a, String b) -> {
            return a.compareTo(b);
        });

        //Second, we will get rid of types, and leave it for compiler to infer
        Collections.sort(names, (a,b)->a.compareTo(b));

        //Third. we can refactor it further to use the method reference as lambda
        Collections.sort(names,String::compareTo);


        //removeIf illustration over a Collection
        List<String> namesList = new ArrayList<>();
        namesList.add("sathu");
        namesList.add("sush");
        namesList.add("virat");
        namesList.add("anushka");
        System.out.println("Before removing names starting with s");
        System.out.println(namesList.toString());


        Predicate<String> startsWithS = (name) -> name.startsWith("s");
        Predicate<String> endsWithU = (name) -> name.endsWith("u");
        namesList.removeIf(startsWithS.and(endsWithU));
        System.out.println("After removing names starting with s");
        System.out.println(namesList.toString());

    }
}
