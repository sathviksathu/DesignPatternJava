package com.java.design.patterns.vending.machine.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {

    private List<ViewPort> viewPorts = new ArrayList<>();
    private int width;
    private int height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewPort(ViewPort viewPort){
        this.viewPorts.add(viewPort);
    }

    public void render(){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                for(ViewPort vp : viewPorts){
                    System.out.println(vp.charAt(x,y));
                }
                System.out.println() ;
            }
        }

    }
}
