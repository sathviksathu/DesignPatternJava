package com.java.explore.features.streams.primitives;

import java.util.stream.IntStream;

public class PrimitiveDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,111);

        intStream.forEach(System.out::println);

        //find avg of numbers squared
        Double avg = intStream.map((number) -> number*number)
                              .average()
                              .getAsDouble();

        System.out.println(avg);



    }

}
