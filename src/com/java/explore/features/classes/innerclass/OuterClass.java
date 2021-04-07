package com.java.explore.features.classes.innerclass;

public class OuterClass {

    private String privString;
    private static final String privStaticFinalString = "PRIV_STATIC_FINAL_STRING";
    private static String privStaticString = "PRIV_STATIC_STRING";
    public String pubString;
    public static String pubStaticString = "PUB_STATIC_STRING";

    public OuterClass(String privString, String pubString) {
        this.privString = privString;
        this.pubString = pubString;
    }

    public void runPrivateInnerClassDemo(){
        //Creating instance of private inner class
        PrivateInnerClass privInnerClass = new PrivateInnerClass();
        //and then checking it's access
        privInnerClass.checkForAccess();
        //and then modifying them
        privInnerClass.modify();
    }

    public void runPublicInnerClassDemo(){
        //Creating instance of private inner class
        PublicInnerClass pubInnerClass = new PublicInnerClass();
        //and then checking it's access
        pubInnerClass.checkForAccess();
        //and then modifying them
        pubInnerClass.modify();
    }

    //private inner class
    private class PrivateInnerClass {
        public void checkForAccess() {
            System.out.println("Private string accessed: "+privString);
            System.out.println("Private static string accessed: "+privStaticString);
            System.out.println("private static final string accessed: "+ privStaticFinalString);
            System.out.println("Public string accessed: "+pubString);
        }

        public void modify() {
            privString =privString+"_modified";
            pubString = pubString+"_modified";
            checkForAccess();
        }
    }

    public class PublicInnerClass{
        public void checkForAccess() {
            System.out.println("Private string accessed: "+privString);
            System.out.println("Private static string accessed: "+privStaticString);
            System.out.println("private static final string accessed: "+ privStaticFinalString);
            System.out.println("Public string accessed: "+pubString);
        }

        public void modify() {
            privString =privString+"_modified";
            pubString = pubString+"_modified";
            checkForAccess();
        }
    }

    /**
     * Static nested classes
     * These are always accessed using the enclosing class name, outside of the class
     *  InnerClassDemo.PublicStaticInnerClas
     *
     *  Thus, enforcing a kind of "naming space" kinda construct and making it more informative
     *
     *  An instance of static nested class, can exist without an instance of OuterClass
     *  as can be seen in Demo.java
     */
    public static class PublicStaticInnerClass{
        //Creating instance of enclosing class
        OuterClass outerClass = new OuterClass("sathu","sush");
        public void checkForAccess() {
            //Cannot access non static members of enclosing class directly
            /*System.out.println("Private string accessed: "+privString);
            System.out.println("Public string accessed: "+pubString);
            */

            //Can access static members of enclosing class
            //Both final and non-final
            System.out.println("Private static non-final string accessed: "+privStaticString);
            System.out.println("private static final string accessed: "+ privStaticFinalString);
            System.out.println("Public static non-final string accessed: "+pubStaticString);

            //can access non-static members of enclosing class
            //via the instance variable of enclosing class
            System.out.println("Private non-static variable accessed via instance variable: "+ outerClass.privString);
            System.out.println("Public non-static variable accessed via instance variable:  "+ outerClass.privString);
        }

        public void modify() {
            //Cannot access non static members of enclosing class
            //privString =privString+"_modified";
            //pubString = pubString+"_modified";
            pubStaticString = pubStaticString+"_modified";
            checkForAccess();
        }
    }

}
