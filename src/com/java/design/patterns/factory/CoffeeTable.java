package com.java.design.patterns.factory;

public class CoffeeTable extends Furniture{
    private CoffeeTable() {
        //Marking constructor private to force user to use factory classes.
    }

    public static CoffeeTable createCoffeeTable(){
        return new CoffeeTable();
    }

    @Override
    public String getType() {
        return "CoffeeTable";
    }
}
