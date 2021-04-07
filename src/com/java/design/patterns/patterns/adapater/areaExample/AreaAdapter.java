package com.java.design.patterns.patterns.adapater.areaExample;

public class AreaAdapter implements AreaInterface {

    //Has the 3rd party AreaService instance.
    private AreaService areaService;

    //Constructor which takes an instance of AreaService.
    public AreaAdapter(AreaService areaService) {
        this.areaService = areaService;
    }

    /**
     * Functionality by implementing the Interface which client understands. This will
     * be the place, where we can adapt the AreaService's calls to client calls. Basically
     * the place where all the conversion and compatibility adjustments happen.
     */

    @Override
    public double getArea() {
        int area = areaService.getArea();
        /**Adapting here to the only format that client knows**/
        System.out.println("Area in sqkm calculated by 3rd Party service: "+area);
        return area*(0.386102);
    }
}
