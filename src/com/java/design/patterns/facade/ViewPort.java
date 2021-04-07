package com.java.design.patterns.facade;

/**
 * This is yet another "complicated" subsystem of our application, which Facade pattern works
 * towards hiding the complexities.
 */
public class ViewPort {
    private Buffer buffer;
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;

    public ViewPort(Buffer buffer, int width, int height, int offsetX, int offsetY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public char charAt(int x, int y){
        return buffer.charAt(x+offsetX, y+offsetY);
    }

}
