package com.java.design.patterns.vending.machine.patterns.facade;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * This is using plain Console class, which is not "Facade" simplified
         * Just see the degree og ugliness in the client-side code as well as
         * the potential of blowing things up, if Buffer, Viewports are not properly initialized.
         */
        Buffer buffer = new Buffer(30,20);
        ViewPort viewPort = new ViewPort(buffer,30,20,0,0);
        Console console = new Console(30,20);
        console.addViewPort(viewPort);
        console.render();

        //=======================FACADE SHOWDOWN==========================//

        /**
         * This is the advantage you get by using the "Facade" simplified Console
         * It hides all the complexity and gives an "easy-to-use" interface to client
         * so he can sleep confidently thinking of the beautiful code he wrote.
         */
        FacadeConsole facadeConsole = FacadeConsole.newConsole(30,40);
        facadeConsole.render();

    }
}
