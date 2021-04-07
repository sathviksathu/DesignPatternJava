package com.java.design.patterns.patterns.factory;

public class FurnitureFactory {

    public Furniture getFurniture(FurnitureType furniture){
        switch (furniture){
            case SOFA:
                return Sofa.createSofa();
            case CHAIR:
                return Chair.createChair();
            case COFFEETABLE:
                return CoffeeTable.createCoffeeTable();
            default:
                return Sofa.createSofa();
        }
    }

}

