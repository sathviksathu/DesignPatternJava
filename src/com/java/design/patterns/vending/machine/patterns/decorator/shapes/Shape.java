package com.java.design.patterns.vending.machine.patterns.decorator.shapes;

/**
 * This is the most simple, yet most astonishing part of this demo.
 * It's this interface that gives all the powers that decorator pattern can unleash.
 * It's this interface that bakes "recursive composition" goodness into your pattern.
 * By adhering to Shape, how much ever specialized a decorated object is (Transparent -> Colored -> Shape),
 * it finally is again a "Shape".
 */
public interface Shape {
    String info();
}
