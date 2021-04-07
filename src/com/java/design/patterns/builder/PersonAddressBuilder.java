package com.java.design.patterns.builder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder atStreet(String street){
        person.street = street;
        return this;
    }

    public PersonAddressBuilder inCity(String city){
        person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostalCode(String postalCode){
        person.postalcode = postalCode;
        return this;
    }

}
