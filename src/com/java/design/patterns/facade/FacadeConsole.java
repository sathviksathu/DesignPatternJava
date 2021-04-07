package com.java.design.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeConsole {
    private List<ViewPort> viewPorts = new ArrayList<>();
    private int width;
    private int height;

    public FacadeConsole(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewPort(ViewPort viewPort){
        this.viewPorts.add(viewPort);
    }

    /**This is the factory method added to original Console class
     * which brings the "Facade"ness to the client-side code. Just check
     * how simple it is for client now to create what he wants.
     *
     * @param width of buffer, viewport and console
     * @param height of buffer, viewport and console
     * @return Facade console
     */
    public static FacadeConsole newConsole(int width, int height){
        Buffer buffer = new Buffer(width,height);
        ViewPort vp = new ViewPort(buffer,width,height,0,0);
        FacadeConsole console = new FacadeConsole(width,height);
        console.addViewPort(vp);
        return console;
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
