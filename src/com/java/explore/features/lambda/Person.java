package com.java.explore.features.lambda;

public class Person {
    public enum Sex{
        MALE,
        FEMALE
    }
    private String name;
    private String emailAddress;
    private Sex gender;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String emailAddress, Sex gender, int age) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void printPerson(){
        System.out.println("Name: "+this.name+" Email: "+this.emailAddress+
                           " Gender: "+this.gender.toString()+" Age: "+this.age+"\n");
    }
}
