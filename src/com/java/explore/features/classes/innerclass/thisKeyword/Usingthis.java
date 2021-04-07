package com.java.explore.features.classes.innerclass.thisKeyword;

public class Usingthis {
    private int x;
    private int y;
    private int a;
    private int b;

    //Using this keyword with a field in constructor
    public Usingthis(int notx, int noty, int a, int b) {
        x = notx;
        y = noty;
        this.a = a;
        this.b = b;
    }

    //Using this keyword with constructor
    public Usingthis(int notx, int noty){
        this(notx,noty,2,3);
    }

    public void instanceMethod(){
        System.out.println(""+x);
        System.out.println(""+y);
        System.out.println(""+this.a);
        System.out.println(" "+this.b);

    }
    /**
     * If you make the above method static, that is
     * public static void instanceMethod(){
     *     ..
     * }
     * then usage of this keyword throws error.
     */
}
