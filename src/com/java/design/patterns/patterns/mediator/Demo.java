package com.java.design.patterns.patterns.mediator;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
       ChatRoom room = new ChatRoom("Demo");
       Person sathu = new Person("Sathu");
       Person sush = new Person("Sush");
       Person virat = new Person("Virat");
       Person anushka = new Person("Anushka");

       room.requestToJoin(Arrays.asList(sathu, sush, virat, anushka));

       /* Sathu broadcasting Hi to everyone, where the broadcast is delegated
          to the mediator chatRoom, though sathu doesn't know about the existence
          of other users
       */
       sathu.broadcast("Hi");
       sush.viewChatLog();
       virat.viewChatLog();
       anushka.viewChatLog();

       sathu.personalMsg(sush.userName, "Hi babes");
       sush.viewChatLog();
    }
}
