package com.java.explore.features.classes.innerclass.shadowing;

public class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.doShadowTest(21);
    }
}
