package com.java.design.patterns.patterns.decorator.notifier;

public class SlackNotifier implements  Notifier
{
    private Notifier notifier;

    public SlackNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String notifyUsers() {
        return notifier.notifyUsers() + " ,Slack ";
    }
}
