package com.java.explore.features.superclass;

public class Demo {
    public static void main(String[] args) {
        //Instantiating a subclass member and assigning it to superclass.
       Shape shape = new Rectangle(2,3);
       Rectangle rectangle = new Rectangle(10,20);
       //This works just fine
       rectangle.rectangleOnlyMethod();

        /**
         * Uncommenting the below line would throw error.
         * If you assign an object of the subclass to the reference variable of the superclass
         * then the subclass object is converted into the type of superclass and
         * this process is termed as widening (in terms of references).
         *
         * But, using this reference you can access the members of superclass only
         * if you try to access the subclass members a compile-time error will be generated.
         */
        //shape.rectangleOnlyMethod();
        //shape.publicMem

        /**
         * Uncommenting the below line would throw error.
         * You cannot assign a superclass instance to subclass variable
         */
        //Rectangle rectangle1 = new Shape();




    }
}
