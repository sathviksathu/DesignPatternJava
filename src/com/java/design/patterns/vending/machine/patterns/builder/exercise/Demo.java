package com.java.design.patterns.vending.machine.patterns.builder.exercise;

public class Demo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder();
        Code code = cb
                .classBuilder()
                .withClassName("Person")
                .variableBuilder()
                .addField("String", "name")
                .addField("int","age")
                .build();
        System.out.println(code);
    }
}
