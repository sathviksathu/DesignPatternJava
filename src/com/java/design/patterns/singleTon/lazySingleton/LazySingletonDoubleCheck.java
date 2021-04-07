package com.java.design.patterns.singleTon.lazySingleton;

public class LazySingletonDoubleCheck {
    //Instance variable
    private static LazySingletonDoubleCheck mInstance;

    //Constructor marked private, rule-of-thumb for singleton classes.
    private LazySingletonDoubleCheck() {
    }

    //Having a static getter which checks if the instance has been intialized.
    //observe there is no synchronized check on getInstance method as such.
    public static LazySingletonDoubleCheck getInstance() {
        if (mInstance == null) {
            //Observe there is another null check, performed inside a synchronized block
            //this ensures thread saftey with negligible compromise on performance.
            synchronized (LazySingletonDoubleCheck.class){
                if(mInstance == null)
                {
                    //create the instance, only if it is null.
                    mInstance = new LazySingletonDoubleCheck();
                }
            }
        }
        return mInstance;
    }
}
