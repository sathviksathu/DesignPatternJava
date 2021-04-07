package com.java.design.patterns.singleTon.lazySingleton;

public class LazySingletonSync {
    //Instance variable
    private static LazySingletonSync mInstance;

    //Constructor marked private, rule-of-thumb for singleton classes.
    private LazySingletonSync() {
    }

    //Having a static getter which checks if the instance has been intialized.
    //observe the synchronized keyword, which ensures thread saftey
    //But comes at cost of performance.
    public static synchronized LazySingletonSync getInstance() {
        if (mInstance == null) {
            //create the instance, only if it is null.
            mInstance = new LazySingletonSync();
        }
        return mInstance;
    }

}
