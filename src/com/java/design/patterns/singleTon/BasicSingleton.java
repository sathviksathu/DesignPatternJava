package com.java.design.patterns.singleTon;

import java.io.*;

/**
 * Most basic implementation of singleton pattern
 *
 * How can I prevent anyone from creating additional copies of this class and have all the ownership to myself.
 *
 * MAKE CONSTRUCTOR PRIVATE AGAIN!!!!
 * 1) Declare a private constructor, so that no one can call BasicSingleton bs = new BasicSingleton();
 * 2) Declare a "private static BasicSingleton bs = new BasicSingleton(); inside the class itself
 * 3) Declare a "public static BasicSingleton getInstance(){ return bs;}" getter for the instance
 *
 * BAM!! There you have the most primitive singleton, though it works!!!!
 * It has some issues which we will see in subsequent classes.
 */


class BasicSingletonClass implements Serializable {
    //private static variable of the same type declared.
    private static BasicSingletonClass mInstance = new BasicSingletonClass();
    //constructor made private
    private BasicSingletonClass() {
    }
    //public static getter of the instance created above.
    public static BasicSingletonClass getInstance() {
        return mInstance;
    }

    //TEST CODE
    private int val = 0;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    /** By enabling this method in singleton, you can avoid serialization problem described below
    protected Object readResolve(){
        return mInstance;
    }*/
}

public class BasicSingleton {
    public static void main(String[] args) throws Exception {
        //Below line will throw a compilation error since the constructor is private.
        //BasicSingleton bs = new BasicSingleton();

        //Using the public static getter to get the singleton class instance.
        BasicSingletonClass bs = BasicSingletonClass.getInstance();

        //Code to check, if the instance is working
        bs.setVal(123);
        System.out.println(bs.getVal());

        /**
         * First issue to look is in case of serialization of a singleton class.
         *
         * When you serialize/deserialize(fancy name given to writing and reading from file) an object of
         * singleton class, JVM doesn't care if your constructor is private, it's gonna go ahead and create
         * and instance copy anyways.
         */

        //First we are going to write our singleton class into file and then read from it, using
       // saveTofile() and readFromFile() methods defined below
        String filename = "singleton.bin";
        saveTofile(bs,filename);
        bs.setVal(124);
        BasicSingletonClass bs2 = readFromFile(filename);
        System.out.println("Here you can see that two instances of singleton exist");
        System.out.println(bs == bs2);
        System.out.println(bs.getVal());
        System.out.println(bs2.getVal());
    }


    public static void saveTofile(BasicSingletonClass singleton, String filename)
    throws Exception{
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){
            out.writeObject(singleton);
        }
    }

    public static BasicSingletonClass readFromFile(String filename)
        throws Exception{
        try(FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileInputStream)){
            return (BasicSingletonClass) in.readObject();
        }
    }

}



