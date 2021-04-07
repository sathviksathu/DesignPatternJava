package com.java.explore.features.staticls;

public class InnerStaticClassDemo {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
    }
}
