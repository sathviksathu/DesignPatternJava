package com.java.design.patterns.vending.machine.patterns.prototype.copyconstructor;

import java.util.Arrays;

public class Person {

    private String[] names;
    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }
    /**This package has copy construcrtor**/
    public Person(Person other){
        this.names = other.getNames();
        this.address = new Address(other.getAddress());
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{Person: "
                + "{names: "
                + Arrays.toString(names)
                + "}"
                + "{address: "
                + address.toString()
                + "}"
                + "}";
    }
}
