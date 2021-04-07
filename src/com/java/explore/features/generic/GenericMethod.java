package com.java.explore.features.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    static Character[] charArray = {'h','e','l','l','o'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true,false,true};

    public static List arrayToList(Object[] array, List<Object> list){
        for(Object obj : array){
            list.add(obj);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray,new ArrayList<>());
        List<Character> intList = arrayToList(intArray,new ArrayList<>());
        List<Character> boolList = arrayToList(boolArray,new ArrayList<>());

    }
}
