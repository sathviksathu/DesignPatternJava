package com.java.design.patterns.vending.machine.patterns.decorator.notifier;

public class SMSNotifier implements Notifier {
    private Notifier notifier;

    public SMSNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String notifyUsers() {
        return notifier.notifyUsers()+ ",SMS ";
    }
}
