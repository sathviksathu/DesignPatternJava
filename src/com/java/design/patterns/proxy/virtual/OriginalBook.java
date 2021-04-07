package com.java.design.patterns.proxy.virtual;

public class OriginalBook implements Book {

    private String name;
    private String author;
    private boolean isAvailable;
    private String description;
    private String rating;


    public OriginalBook(String name, String author, boolean isAvailable, String description, String rating) {
        this.name = name;
        this.author = author;
        this.isAvailable = isAvailable;
        this.description = description;
        this.rating = rating;
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
        return "OriginalBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
}
