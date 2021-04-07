package com.java.design.patterns.patterns.composite;

public class Demo {
    public static void main(String[] args) {
        //graphicObject here is root node of the hierarchy
        GraphicObject graphicObject = new GraphicObject();
        graphicObject.setName("Drawing");
        //These are two direct but leaf-node children of root.
        graphicObject.children.add(new Square("Red"));
        graphicObject.children.add(new Circle("Red"));

        //This is another GraphicObject composite object which has 2 more leaf nodes
        //But it in itself is the third child to root element.
        GraphicObject group = new GraphicObject();
        group.setName("Another Drawing");
        group.children.add(new Square("Blue"));
        group.children.add(new Circle("Blue"));

        graphicObject.children.add(group);

        //All the magic in action on console.
        System.out.println(graphicObject.toString());
    }
}
