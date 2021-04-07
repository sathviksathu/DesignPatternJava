package com.java.design.patterns.patterns.decorator.notifier;

public class MailNotifier implements Notifier {
    private String notification;

    public MailNotifier(String notification) {
        this.notification = notification;
    }

    @Override
    public String notifyUsers() {
        return "You have been notified that \n"+notification + "\nin your Mail ";
    }
}
