package com.java.design.patterns.factory.plain.point;

/** Factory Method/Class Creational pattern
 *  As it is already established, constructor is not the best way to create object
 *  especially when you have different flavours that can be created. One major limitation
 *  of constructor is, you can't really have a overloaded constructor with same parameters,that is, to say:
 *
 *  Cartesian point
 *  public point(double x, double y){
 *      this.x = x;
 *      this.y = y;
 *  }
 *  Polar point
 *  public point(double rho, double theta){
 *        this.x = rho*Math.cos(theta);
 *        this.y = rho*Math.sin(theta);
 *  }
 *
 *  This is where Factory pattern comes in, where it can take in the similar parameters, required for
 *  object construction, but construct in an entirely different manner.
 */

public class Point {
    double x;
    double y;
    //Marking constructor as private, so that all are forced to use
    //the corresponding "Factory methods" to instantiate different flavor
    //of points
    private Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /** THIS IS THE ALL IMPORTANT FACTORY CLASS, WHICH IS ESSENCE OF THIS PATTERN
     * Reason for static inner class is that, this is the only way, we can access
     * the private constructor.
     */

    public static class Factory{
        public static Point newCartesianPoint(double x, double y){
            return new Point(x,y);
        }
        public static Point newPolarPoint(double rho, double thetha){
            return new Point(rho*Math.cos(thetha), rho*Math.sin(thetha));
        }
    }
}

