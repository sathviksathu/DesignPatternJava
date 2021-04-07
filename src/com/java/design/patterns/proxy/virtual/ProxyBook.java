package com.java.design.patterns.proxy.virtual;

public class ProxyBook implements Book {
    private String name;
    private String author;
    private boolean isAvailable;

    public ProxyBook(String name, String author, boolean isAvailable) {
        this.name = name;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "ProxyBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    public Book click(ProxyBook book){
        return new OriginalBook(book.name, book.author, book.isAvailable,"This is the extra description","7.8");
    }
}
