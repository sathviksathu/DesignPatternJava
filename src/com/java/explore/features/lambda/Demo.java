package com.java.explore.features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 28;
    public static void main(String[] args) {
        List<Person> persons = createPersons();

        System.out.println("===Using standalone methods===");
        /**Using standalone method**/
        printPersonOlderThan(persons);

        System.out.println("===Using local class===");
        /** Using implementation of {@link CheckPerson} interface through local
         * class of {@link CheckPersonEligibleForSelectiveService}
         */
        printElligiblePersons(persons, new CheckPersonEligibleForSelectiveService());

        System.out.println("===Using anonymous class===");
        /**Since the {@link CheckPerson} is rather a simple interface, we can use
         * anonymous class to do away with local class like {@link CheckPersonEligibleForSelectiveService}
         */
        printElligiblePersons(persons, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() > MIN_AGE
                        && p.getAge() < MAX_AGE;
            }
        });

        System.out.println("===Using lambda expression to implement local interface===");
        /** we can do away with the anonymous class also, by replacing
         * it with lambda expression
         */
        printElligiblePersons(persons,
                (person) -> person.getGender() == Person.Sex.MALE
                             && person.getAge() > MIN_AGE
                             && person.getAge() < MAX_AGE);

        System.out.println("===Using JDK standard functional interface===");
        /**
         * We are using Predicate instead of any local class/interface
         */
        printElligiblePersonsPredicate(persons,
                (person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() > MIN_AGE
                        && person.getAge() < MAX_AGE));

    }



    private static List<Person> createPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sathu","sathu.sathvik@gmail.com",Person.Sex.MALE,24));
        personList.add(new Person("Sush","susmitha.m20@gmail.com",Person.Sex.FEMALE,22));
        personList.add(new Person("Virat","virat@gmail.com",Person.Sex.MALE,27));
        personList.add(new Person("Anushka","anushka@gmail.com",Person.Sex.FEMALE,31));
        return personList;
    }

    /**
     * The following method prints members that are older than a specified age:
     * @param persons collection having all persons
     */
    public static void printPersonOlderThan(List<Person> persons){
        for(Person person: persons){
            if(person.getGender()== Person.Sex.MALE && person.getAge() > MIN_AGE && person.getAge() < MAX_AGE){
                person.printPerson();
            }
        }
    }

    /**
     *  Here we are using implementation of interface {@link CheckPerson} to search for specific criteria
     * @param persons collection of persons
     * @param tester implementation of interface {@link CheckPerson}
     */
    public static void printElligiblePersons(List<Person> persons, CheckPerson tester){
        for(Person person: persons){
            if(tester.test(person)){
                person.printPerson();
            }
        }
    }

    /**
     * Here we are using JDK's very own funtional interface Predicate to do the same deed as above
     * @param persons collection of persons
     * @param tester predicate functional interface.
     */
    public static void printElligiblePersonsPredicate(List<Person>persons, Predicate<Person> tester){
        for(Person person: persons){
            if(tester.test(person)){
                person.printPerson();
            }
        }
    }
}
