package com.java.design.patterns.vending.machine.patterns.decorator.notifier;

public class FacebookNotifier implements Notifier {
    private Notifier notifier;

    public FacebookNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String notifyUsers() {
        return notifier.notifyUsers() +" ,Facebook ";
    }
}
