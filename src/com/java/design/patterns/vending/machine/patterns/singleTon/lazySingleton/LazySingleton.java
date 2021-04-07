package com.java.design.patterns.vending.machine.patterns.singleTon.lazySingleton;

/**
 * LAZY INSTANTIAION
 * Sometimes, you want a singleton instance to initialize only when someone calls
 * "getInstance". You would prefer for the singleton instance to not hang around just like
 * that, since the creation of application(through static instantiaion) and for the entire
 * timeline of application.
 *
 * This is where lazy instantiation comes in, Basically the idea is to intialie the instance only
 * when someone calls "getInstance" method as illustrated below.
 */
public class LazySingleton {
    //Observe that, the instance can no longer be final, as we are not initializing it here.
    //private static final LazySingleton mInstance;

    //Instance variable
    private static LazySingleton mInstance;

    //Constructor marked private, rule-of-thumb for singleton classes.
    private LazySingleton() {
    }

    //Having a static getter which checks if the instance has been intialized.
    public static LazySingleton getInstance() {
        if (mInstance == null) {
            //create the instance, only if it is null.
            mInstance = new LazySingleton();
        }
        return mInstance;
    }
    /** =====PROBLEM======
     * However, this style of lazy instantiation calls for a few problems.
     * It introduces race condtions. i.e
     * If you have several threads accessing getInstance method, and performing null check(yes,your fate is that bad)
     * at the sametime, you could end up in a situation, where you have 2 singleton instances.
     * ====SOLUTION=======
     *
     * 1) You can add keyword "synchronized" infront of getInstance() method. This will indicate compiler
     *    to not allow more than one thread to enter the block simultaneously ensuring thread safety. However,
     *    it comes at cost of performance implications.(implemented in LazySingletonSync.class)
     *
     * 2) Double-checked locking - In this method, you don't add keyword "synchronized" infront of getInstance
     *            method as such, instead you check if the instance is null, then and only then you synchronize
     *            the block and check again, before creation of the instance. This will ensure thread safety while
     *            also saving you most of the performance.(implemented in LazySingletonDoubleCheck.class)
     *
     *
     *
     */
}
