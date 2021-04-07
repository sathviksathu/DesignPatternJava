package com.java.design.patterns.patterns.singleTon;

/**
 * This is particularly an un-intuitive and confusing pattern which behaves like
 * a singleton. The implementation on first look doesn't give any hints of being singleton, but it is.
 *
 * HOW TO IMPLEMENT
 * 1) Write a class, going by normal rules, as if it were a plain old Java class.
 * 2) Change the member variables to static, that's it BAM!!, we have a "sigleton" like behavior.
 *
 * BOTTOM LINE: It behaves as a singleton for the purposes of data storage.
 */
public class Monostate {
    //Make the variables static
    private static String name;
    private static int value;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Monostate.name = name;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Monostate.value = value;
    }

    @Override
    public String toString() {
        return "Monostate{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        /**======DEMO=========**/
        Monostate ms1 = new Monostate();
        Monostate.setName("sathu");
        Monostate.setValue(25);
        System.out.println("Instance 1: "+ ms1);
        Monostate ms2 = new Monostate();
        System.out.println("Instance 2: "+ ms2);
        System.out.println("As you can see here, ms2 already has it's variables");
        System.out.println("initialized, since both ms1 and ms2 point to same data storage");
    }
}

/**
 * This pattern results in some strange scenrios, as programmer can go ahead and make
 * as many instances as possible, however all the instances will be mapped
 * only to same storage space. Some instance variable changing at one place
 * essentially changes all variables, as they essentially point at same storage
 */
/**
 * It's a confusing pattern and not meant for usage in a collaborative
 * and maintainable code environment.
 */
