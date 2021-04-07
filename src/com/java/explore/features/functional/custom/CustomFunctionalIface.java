package com.java.explore.features.functional.custom;

public class CustomFunctionalIface {
    public static void main(String[] args) {
        GreetingFunction greeting = (message) -> System.out.println("Hello "+message.toString());
        greeting.sayMessage(1);
    }

    //The lambda expression which is used to instantiate the GreetingFunction object of greeting
    //infers the type of "message" arg to lambda expression from the interface's abstract method of
    //void sayMessage(Integer message) and hence infers that "message" as Integer.

    @FunctionalInterface
    private interface GreetingFunction{
         void sayMessage(Integer message);

        /**
         * Uncommenting below line produces error.
         * Compiler message: Functional Interfaces cannot have more than one abstract method.
         *
         * Detailed yet beautiful message can be seen down.
         */

        //void sayMessageInFrench(String message);

        /**
         * Uncommenting the below line, highlghts abstract as redundant
         * Compiler message: Modifier 'abstract' is redundant for interface methods.
         */
        //abstract void sayAbstractMessage(String message);
    }

    /**
     * An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface
     * as defined by the Java Language Specification. Conceptually, a functional interface has exactly one abstract method.
     * Since default methods have an implementation, they are not abstract. If an interface declares an abstract method overriding one of the public methods of java.lang.Object,
     * that also does not count toward the interface's abstract method count
     * since any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
     *
     *
     * Note that instances of functional interfaces can be created with lambda expressions, method references, or constructor references.
     *
     *
     * If a type is annotated with this annotation type, compilers are required to generate an error message unless:
     *
     * 1. The type is an interface type and not an annotation type, enum, or class.
     * 2. The annotated type satisfies the requirements of a functional interface.
     *
     * However, the compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterface annotation is present on the interface declaration.
     */
}
