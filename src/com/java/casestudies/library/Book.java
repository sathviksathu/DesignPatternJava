package com.java.casestudies.library;

public class Book {

    private String ISBN;
    private String title;
    private String category;
    private String publishers;
    private double price;
    private int numberOfCopies;

    public Book(String ISBN, String title, String category, String publishers, double price, int numberOfCopies) {
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.publishers = publishers;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
