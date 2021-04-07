package com.java.explore.features.streams;

import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private int noOfPages;

    public Book(String title, String author, int noOfPages) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", noOfPages=" + noOfPages +
                '}'+"\n";
    }

}
