package com.java.design.patterns.prototype.copyThroughSerialization;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

    private String[] names;
    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
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
