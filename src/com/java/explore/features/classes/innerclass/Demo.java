package com.java.explore.features.classes.innerclass;

public class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("sathu","sush");

        /**
         * We can create an instance of PublicInnerStaticClass bypassing
         * the instantiated object of enclosing class.
         * That is to say, PublicInnerStaticClass object can be creating directly by
         * InnerClassDemo enclosing class
         */
        OuterClass.PublicStaticInnerClass pubStaticInnerClass = new OuterClass.PublicStaticInnerClass();

        /**
         * We can create an instance of PublicInnerClass by going through
         * the already instantiated object of enclosing class.
         * That is to say, PublicInnerClass object can be created using "innerClassDemo" object
         * of InnerClassDemo enclosing class
         */
        OuterClass.PublicInnerClass pubInnerClass =  outerClass.new PublicInnerClass();

        /**
         * private inner class is obviously hidden out of class,
         * just like any other private class memeber, hence you cannont
         * instantiate any variable of it
         */
        //innerClassDemo.PrivateInnerClass ;
    }

    /**
     * Apart
     */
}
