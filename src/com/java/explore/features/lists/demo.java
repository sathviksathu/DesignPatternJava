package com.java.explore.features.lists;

import java.util.ArrayList;
import java.util.List;

public class demo {

    public static void main(String[] args) {
        Person person1 = new Person(1,"sathvik");
        Person person2 = new Person(2,"sush");
        Person person3 = new Person(3,"virat");
        Person person4 = new Person(4,"anushka");

        List<Person> personList1 = new ArrayList<>();
        personList1.add(person1);
        personList1.add(person2);
        personList1.add(person3);
        personList1.add(person4);

        for(Person person: personList1){
            System.out.println("Name: "+person.getName());
        }

        List<Person> personList2 = new ArrayList<>();
        personList2.add(person1);
        personList2.add(person2);
        personList2.add(person3);
        personList2.add(person4);

        for(Person person: personList2){
          person.setName("sathu");
        }

        for(Person person: personList1){
            System.out.println("Name: "+person.getName());
        }



    }
}

