package com.java.problems.cache;

import org.junit.platform.commons.util.LruCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //intialize a cache
        //whenever user query comes, check first in cache
        //if cache hit: fetch from cache
        //if cache miss: fetch from disk
        LRUCache<Integer,Person> lruCache = new LRUCache();

        List<Person> persons = createPersons();

        System.out.println("=====Testing first time entries====\n");
        for(Person person: persons){
            lruCache.put(person.getId(),person);
        }

        System.out.println("=====Testing size====\n");
        System.out.println("CacheSize: "+lruCache.size()+"\n");
        System.out.println("Persons: "+persons.size()+"\n");


        System.out.println("=====Testing duplicate entries=====\n");
        for(int i = persons.size()-1; i>=0; i--){
            lruCache.put(persons.get(i).getId(),persons.get(i));
        }

        System.out.println("=====Testing get on entry which is not there=====\n");
        lruCache.get(5);

        System.out.println("=====Testing get on entry which is already mru=====\n");
        lruCache.get(1);

        System.out.println("=====Testing get on entry which is lru=====\n");
        lruCache.get(3);

        System.out.println("=====Testing get on entry which is intermediate=====\n");
        lruCache.get(4);


    }

    private static List<Person> createPersons() {
        List<Person> persons= new ArrayList<>();
        persons.add(new Person(1,"sathu","sathu.sathvik@gmail.com"));
        persons.add(new Person(2,"sush","susmitha.m20@gmail.com"));
        persons.add(new Person(3,"Virat","viratKohli@gmail.com"));
        persons.add(new Person(4,"anushka","anushka@gmail.com"));
        return persons;
    }
}
