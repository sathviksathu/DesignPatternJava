package com.java.design.patterns.adapater.areaExample;

public class CostCalculator {

    public static void main(String[] args) {

        //Third-party or non-modifiable service, which takes dimensions in km
        AreaService areaService = new AreaService(10,12);

        //The Adapter we have defined, which takes in the service, and seemlessly returns
        //the area in the format that client knows(sqft).
        AreaAdapter areaAdapter = new AreaAdapter(areaService);

        //This call which happens in adapter,initially calls the getArea() call of AreaService
        //and then adapts it to the format that client knows.
        double area = areaAdapter.getArea();

        System.out.println("Area in sqft: "+ area);
        System.out.println("Cost for the area: "+getCostPerSqFt(area));

    }

    /**This is the function, which takes area in sqft, something which is not provided  by
     * our third party AreaService. Hence we have AreaAdapter as a wrapper, which returns in
     * expected format
     * @param area in sqft
     * @return cost for the given area
     */
    public static double getCostPerSqFt(double area){
        return area*10;
    }
}
