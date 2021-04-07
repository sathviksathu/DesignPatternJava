package com.java.explore.features.generic;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        //Examples without using Generics
        List names = new ArrayList();
        names.add("sathu");
        //As you can see requires an explicit cast
        String name = (String) names.get(0);
        System.out.println("Name: "+name);
        //Also allows adding heterogenous data into list
        names.add(9);
        for(Object obj : names){
            //type casting leading to ClassCastException at runtime
            String str = (String) obj;
        }

        /**
         * Above code compiles fine but throws ClassCastException at runtime because
         * we are trying to cast Object in the list to String
         * whereas one of the element is of type Integer.
         * After Java 5, we use collection classes like below.
         */


        //Example using Generics
        List<String> genericNames = new ArrayList<>();
        genericNames.add("sathu");
        String genericName = genericNames.get(0);
        System.out.println("GenericName: "+genericName);
        /**
        * Doesn't let you add any other datatype other
        * than type-defined using <>(diamond operator) during
        * intialization.*/
        //genericNames.add(9); --> throws compile time error.

        /**
         * Notice that at the time of list creation, we have specified that the type of elements in the list will be String.
         * So if we try to add any other type of object in the list, the program will throw compile-time error.
         * Also notice that in for loop, we don’t need typecasting of the element in the list,
         * hence removing the ClassCastException at runtime.
         */
    }


}
