package com.java.design.patterns.patterns.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GraphicObject is that base class of the composite pattern, which can exist as an
 * independent instance by itself(leaf node) or act as a composite object holding references
 * to other GraphicObject references (internal node) which in themselves can be either leaf node or internal node.
 *
 * Observe Line: List<GraphicObject> children = new ArrayList<>();
 * This is the piece of code that enables this object to act as a compisite object,
 * as you can store other "GraphicObject" instances as children in this variable of parent.
 * Thus giving you the "parent-child" or "Hierarchy" or "Tree-like" dimension to the class.
 *
 * Hence with this important property of composite pattern in mind, it should be obvious
 * that any problem which contains hierarchy or "An Object, which can contain Object itself"
 * scenarios, Composite pattern should be the obvious solution,
 *
 * It is the pattern, which allows you to deal An object as well as its collections in an uniform manner
 * (this will be seen in demo)
 */
public class GraphicObject {

    protected String name;
    protected String color;

    public GraphicObject() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    List<GraphicObject> children = new ArrayList<>();


    public void print(StringBuilder sb,int depth) {
        //Do whatever you want to do with present child element.
        //Here it's trying to do some pretty print, by printing number of "*" equal to
        //level at which the child is at in hierarchy.(can see in demo)
        sb.append(String.join("", Collections.nCopies(depth,"*")))
        .append(depth > 0 ? " ":"" )
        .append(color == null||color.isEmpty()  ? "":color+" " )
        .append(getName())
        .append(System.lineSeparator());
        //Iterate over its children in recursion.
        for(GraphicObject child: children){
            child.print(sb,depth+1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb,0);
        return sb.toString();
    }
}
/*
* Another important point to take note of is, having this "hiererchy" or "Tree-like" dimension,
* it should be screaming to you that, we can use recursion along with polymorphism, to reap the
* utmost benifits out of such a pattern.
*
* For example observe print() functionality above. If you want to generalize it, you can visualize something
* like:
*
* ==================================
* public void recursive_function(){
*   //Do anything you want to do with this particular GraphicObject instsance
*   sb.append()...
*   ....
*   //Iterate over it's children list and call the same function in recursion
*   for( GraphicObject child : children){
*       child.print();
*   }
* }
* ===================================
* The very line of "child.print()" inside for loop holds testament to the
* pattern's bold claim of "treating both primitive and composite objects uniformly"
*
* This is a very important functionality that the pattern brings in.
*/