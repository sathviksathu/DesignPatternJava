package com.java.explore.features.generic.list;

public class Demo {
    public static void main(String[] args) {
        MyList<String> stringList = new MyList<>();
        stringList.add("sathu");
        System.out.println("Added a string, size: "+ stringList.getSize());
        stringList.add("sush");
        System.out.println("Added a string, size: "+ stringList.getSize());
        System.out.println("Getting second element: "+ stringList.get(1)+" which is of type: "+ stringList.get(1).getClass().getName());

        //Using MyList to generate list of integers
        MyList<Integer> integerList = new MyList<>();
        integerList.add(1);
        System.out.println("Added an integer, size: "+ integerList.getSize());
        integerList.add(2);
        System.out.println("Added an integer, size: "+ integerList.getSize());
        System.out.println("Getting second element: "+ stringList.get(1)+" which is of type: "+ integerList.get(1).getClass().getName());




    }
}
