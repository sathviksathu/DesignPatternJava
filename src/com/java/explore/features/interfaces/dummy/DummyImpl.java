package com.java.explore.features.interfaces.dummy;

public class DummyImpl implements DummyInterface
{
    @Override
    public void method() {
        System.out.println("This is implementation of interface in class");
    }
    public void methodOutOfInterface(){
        System.out.println("This is implementation of method out of interface");
    }
}
