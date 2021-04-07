package com.java.design.patterns.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String userName;
    private List<String> chatLog = new ArrayList<>();

    public ChatRoom chatRoom;

    public Person(String userName) {
        this.userName = userName;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void receiveMsg(String sender, String message){
        String s = sender + ":" + "'" + message + "'";
        System.out.println("["+ userName + "'s Chat session]: "+ s);
        chatLog.add(s);
    }

    public void broadcast(String message){
        if(chatRoom!= null)
            chatRoom.broadcast(userName, message);
    }

    public void personalMsg(String to, String message){
        if(chatRoom!= null)
            chatRoom.message(userName, to, message);
    }

    public void viewChatLog(){
        for(String message: chatLog){
            System.out.println(message);
        }
    }
}

