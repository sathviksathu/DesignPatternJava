package com.java.misc.library;

import java.util.Date;

public class BookItem {
    private Date borrowed;
    private Date dueDate;
    private BookStatus bookStatus;
    private Book book;
    private int numberOfAvailableCopies;


    public BookItem(String barcode, Date borrowed, Date dueDate, BookStatus bookStatus,Book book) {
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.bookStatus = bookStatus;
        this.book = book;
    }
    public BookItem(Book book){
        this.book = book;
        this.bookStatus = BookStatus.AVAILABLE;
        this.numberOfAvailableCopies = book.getNumberOfCopies();
    }

    public Date getBorrowedData() {
        return borrowed;
    }

    public void setBorrowedDate(Date borrowed) {
        this.borrowed = borrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
