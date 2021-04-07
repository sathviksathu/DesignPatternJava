package com.java.misc.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog implements Search{
    private int totalBooks;
    private List<Book> books;
    private Map<String, Book> bookTitles;
    private Map<String, List<Book>> bookAuthors;
    private Map<String, List<Book>> bookCategories;

    public Catalog() {
        books = new ArrayList<>();
        bookTitles = new HashMap<>();
        bookCategories = new HashMap<>();
        bookAuthors = new HashMap<>();
        totalBooks = 0;
    }

    @Override
    public Book searchByTitle(String bookTitle) {
        return bookTitles.get(bookTitle);
    }

    @Override
    public List<Book> searchByAuthor(String authorName) {
        return bookAuthors.get(authorName);
    }

    @Override
    public List<Book> searchByCategory(String category) {
        return bookCategories.get(category);
    }

    public void addBook(Book book){
        bookTitles.put(book.getTitle(),book);
        addCategory(book,book.getCategory());
        books.add(book);
        totalBooks+=book.getNumberOfCopies();
    }

    private void addCategory(Book book, String category) {
        if(bookCategories.get(category) == null){
            List<Book> books = new ArrayList<>();
            books.add(book);
            bookCategories.put(category,books);
        }else{
            bookCategories.get(category).add(book);
        }
    }

}
