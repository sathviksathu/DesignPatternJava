package com.java.explore.features.interfaces.dummy;

public class DummyDemo {

    public static void main(String[] args) {


        /**
         * Creating an instance of concrete implementation of interface
         * concrete implementation: {@link DummyImpl}
         * interface :{@link DummyInterface}
         */
        DummyImpl dummyImpl = new DummyImpl();

        /**
         * You cannot create new instances of DummyInterfaces without actually implementing
         * the abstract methods inside of the interfaces
         */
        DummyInterface dummyInterfaceInstance = new DummyInterface() {
            @Override
            public void method() {
                System.out.println("Direct instance can be created only by providing it's implementation");
            }
        };

        /**
         * This is polymorphism at play. That is to say, concrete implementations
         * of interface can be assigned to both interface and concrete implementation instances
         *
         */
        DummyInterface dummyInterface = dummyImpl;

        /**
         * Concrete implementations will have access to all the methods of interface
         * as well as those in concrete implementation class
         */
        //From interface
        dummyImpl.method();
        // Method only in implementation and not in interface
        dummyImpl.methodOutOfInterface();

        /**
         * However, when we assign concrete implementation instance to interface type,
         * it basically gets typecasted into interface and loses out on it's out-of-interface
         * method access.
         */
        //From interface
        dummyInterface.method();
        // Method in concrete implementation and not in interface, cannot be accessed.
        //Uncommenting below line would throw error.
        //dummyInterface.methoodOutOfInterface();

    }
}
