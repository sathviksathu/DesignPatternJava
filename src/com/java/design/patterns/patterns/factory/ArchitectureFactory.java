package com.java.design.patterns.patterns.factory;

public class ArchitectureFactory {

    public Architecture getArchitecture(ArchitectureType architectureType){
        switch (architectureType){
            case MODERN -> Modern.createModern();
            case ARTDECO -> ArtDeco.createArtDeco();
            case VICTORIAN -> Victorian.createVictorian();
            default -> Modern.createModern();
        }
        //unreachable statement
        return ArtDeco.createArtDeco();
    }
}
