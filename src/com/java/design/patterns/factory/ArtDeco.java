package com.java.design.patterns.factory;

public class ArtDeco extends Architecture{
    private ArtDeco() {
        //Marking constructor private to force user to use factory classes.
    }

    public static ArtDeco createArtDeco(){
        return new ArtDeco();
    }

    @Override
    public String getType() {
        return "ArtDeco";
    }
}
