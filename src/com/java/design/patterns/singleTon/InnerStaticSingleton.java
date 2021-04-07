package com.java.design.patterns.singleTon;

/**
 * This is the most elegant and simple solution which takes care of all possible singleton
 * creation problems
 * 1) Lazy instantiation
 * 2) Thread safety
 * 3) Doesn't use synchronized keyword, so no effect on performance.
 *
 * All this happens through a inner static class
 * I am not sure how it works though!!
 */
public class InnerStaticSingleton {

    //constuctor made private, rule-of-thumb for singleton classes
    private InnerStaticSingleton(){

    }

    //Having the private static final instance declared inside a inner static class
    private static class Impl {
        //Creating an instance inside a inner static class
        private static final InnerStaticSingleton mInstance = new InnerStaticSingleton();
    }

    //Exposing the created instance through public getter.
    public InnerStaticSingleton getInstance(){
        return Impl.mInstance;
    }
}
