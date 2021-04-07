package com.java.design.patterns.decorator.notifier;

public class Demo {
    public static void main(String[] args) {
        MailNotifier mailNotifier = new MailNotifier("You aced Decorator");
        System.out.println(mailNotifier.notifyUsers());

        SlackNotifier slackNotifier = new SlackNotifier(
                new FacebookNotifier(new MailNotifier(
                        "You aced it well!!"
                ))
        );
        System.out.println(slackNotifier.notifyUsers());

        SMSNotifier smsNotifier = new SMSNotifier(
                new FacebookNotifier(
                        new SlackNotifier(
                                new MailNotifier("You just proved it!!")
                        )
                )
        );

        System.out.println(smsNotifier.notifyUsers());
    }
}
