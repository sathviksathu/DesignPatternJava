package com.java.design.patterns.vending.machine.patterns.decorator.string;

/**
 * MagicString is basically the Decorator class, which "enhances" the string functionality
 * by adding "getNumberofVowels", which otherwise is not available. This is what they call as
 * "Decorating" the string. This is Decorator pattern at its simplest.
 * Though there are many other paradigms this can be used. One important one is this.
 *
 * When you want to enhance the functionality of some final class, you wrap that object in decorator,
 * delegate all the functionality that you are satisified with the the underlying primitive type but bake
 * the functionality that you wanted into decorator class.
 */
public class Demo {
    public static void main(String[] args) {
        MagicString magicString = new MagicString("Hi Hello");
        System.out.println("The number of vowels in "+magicString.toString()+ " is "+magicString.getNumberofVowels());

    }
}
