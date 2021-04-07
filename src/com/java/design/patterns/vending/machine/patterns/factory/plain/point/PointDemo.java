package com.java.design.patterns.vending.machine.patterns.factory.plain.point;
/*
Best indication you can get, if we need to use a Factory method/class for object
instantiation, is when, the constructor logic begins to get complicated and more
specifically, if you need some kind of switch-case or if-else based on some parameter
in the way the object is created.

This scenario should shout in your face that, we need to use Factory pattern
 */
public class PointDemo {
    public static void main(String[] args) {
        //As you can see the Point object creation happens through the
        //Factory class of the Point class, returning different representations of
        //Point class, depending on the invoked Factory class method.

        Point cartesianPoint = Point.Factory.newCartesianPoint(2, 3);
        Point polarPoint = Point.Factory.newPolarPoint(2, 3);

    }
}
/*
For example, the Point constructor could have ugly like this, have we not used factory pattern.

public Point(double X, double Y, int system){
switch(system):
    case 1:
      this.x=X;
      this.y=Y;
      break;
    case 2:
     this.x = X*Math.cos(Y);
     this.y = X*Math.sin(Y);
     break;
}

 */
