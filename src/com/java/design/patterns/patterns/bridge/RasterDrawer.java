package com.java.design.patterns.patterns.bridge;

/**
 * Class that implements Drawer and defines draw functionality using
 * raster methods.
 */
public class RasterDrawer implements Drawer {
    @Override
    public String draw() {
        return "Drawing using Raster methods....";
    }
}
