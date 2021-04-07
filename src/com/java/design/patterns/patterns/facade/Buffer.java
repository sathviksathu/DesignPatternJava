package com.java.design.patterns.patterns.facade;

/**
 * This is not necessary for knowing about Facade pattern, just explaining a
 * subsystem of our application and showing its complexities. It's these very complexities
 * that Facade pattern hopes to hide and provide simplified interface to the end-client.
 *
 * Buffer basically is a 1-D representation of any 2-D data structure.
 * Hence it has an array of characters, and also has a sense of linewidth,
 * which facilitates the 1-d conversion of any 2-D structure
 */
public class Buffer {
    private char[] characters;
    private int lineWidth;

    public Buffer(int lineHeight, int lineWidth) {
        this.lineWidth = lineHeight;
        characters = new char[lineWidth*lineHeight];
    }

    public char charAt(int x, int y){
        return characters[y*lineWidth+x];
    }
}
