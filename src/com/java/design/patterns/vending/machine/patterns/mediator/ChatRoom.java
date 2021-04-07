package com.java.design.patterns.vending.machine.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/*
A classic example of Mediator pattern is a Chat Application
Since a Chat application essentially what a mediator is about.
The participants of the Chat application don't necessarily hold any
references to one another, rather go through common central unit like
the Chat Room, which acts as a Mediator.
 */
public class ChatRoom {

    private List<Person> participants;
    private String roomName;

    public ChatRoom(String roomName) {
        this.roomName = roomName;
        participants = new ArrayList<>();
    }

    public void requestToJoin(Person participant){
        participants.add(participant);
        participant.setChatRoom(this);
    }

    public void requestToJoin(List<Person> participantList){
        // You can perform any validations on participants
        participants.addAll(participantList);
        for(Person person: participantList){
            person.setChatRoom(this);
        }
    }

    public void broadcast(String userName, String message){

        participants.stream()
                .filter(person -> !person.userName.equals(userName))
                .forEach(person -> person.receiveMsg(userName, message));


        /*for(Person participant : participants){
            if(!participant.userName.equals(userName)) {
                participant.receiveMsg(userName, message);
            }
        }*/
    }

    public void message(String userName, String to, String message) {

        /**
         * Using streams to filter the user and send msessage
         */
        participants.stream()
                .filter(person -> person.userName.equals(to))
                .findFirst()
                .ifPresent(person -> person.receiveMsg(userName, message));

        /**
         * Using traditional for loop
         */
        /*for(Person participant : participants){
            if(participant.userName.equals(to)){
                participant.receiveMsg(userName, message);
            }
        }*/
    }
}
