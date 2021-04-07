package com.java.design.patterns.patterns.proxy.virtual;

public class Demo {
    public static void printConsoleText(){
        System.out.println();
        System.out.println("*******EVENT*******");
        System.out.println("User has clicked on the book");
        System.out.println("*******EVENT*******");
        System.out.println();
    }

    public static void main(String[] args) {
        ProxyBook proxyBook = new ProxyBook("The Alchemist", "Paulo Cohelo", true);
        proxyBook.showInfo();
        printConsoleText();
        Book book = proxyBook.click(proxyBook);
        book.showInfo();
    }
}
