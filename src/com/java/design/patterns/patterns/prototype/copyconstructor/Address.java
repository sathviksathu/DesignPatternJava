package com.java.design.patterns.patterns.prototype.copyconstructor;

public class Address {
    private String streetName;
    private int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    /**This package has copy construcrtor**/
    public Address(Address other){
        this.streetName = other.streetName;
        this.houseNumber = other.houseNumber;
        //this(other.streetName, other.houseNumber);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "streetName: "
                + streetName
                +" houseNumber: "
                + houseNumber;
    }
}
