package com.java.design.patterns.patterns.adapater.areaExample;

/**
 * A useful service class, which you can’t change
 * (often 3rd-party, legacy or with lots of existing dependencies).
 */
public class AreaService {
    //This takes width and height in Kms.
    private int width;
    private int height;

    //Constructor taking width and height in Kms
    public AreaService(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * The area calculated is thus, in sqkm and not sqft as the client understands
     * this calls for the need of an adapter, which would adapt this present class
     * to what client understands.
     */
    public int getArea(){
        System.out.println("Calculating Area in service...");
        return width*height;
    }
}
