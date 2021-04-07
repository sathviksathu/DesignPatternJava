package com.java.explore.features.classes.innerclass.shadowing;

public class OuterClass {
    private int x = 23;
    private int y = 24;

    public class InnerClass{
        public int x = 22;
        public void doShadowTest(int x){
            System.out.println("Referencing method param as x: "+x);
            System.out.println("Referencing InnerClass variable as this.x: "+this.x);
            System.out.println("Referencing OuterClass variable as OuterClass.this.x: "+OuterClass.this.x);
            System.out.println("Referencing non-conflicting member of outer class y: "+ y);
        }
    }
}
