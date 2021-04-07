package com.java.misc.library;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class System {
    private static Catalog catalog;

    public System() {
        this.catalog = new Catalog();
    }

    public static boolean checkoutBook(String bookName, Member member){
        if(checkNumberOfBooksIssuedToMember(member)){
            Optional<Book> book = Optional.ofNullable(catalog.searchByTitle(bookName));
            book.ifPresent(issueBook(book.get(),member));

        }
        return true;
    }

    private static Consumer<? super Book> issueBook(Book book, Member member) {
            return null;
    }

    private static boolean checkNumberOfBooksIssuedToMember(Member member) {
        return member.getTotalCheckedOutBooks() < 10;
    }

    public static void addBook(Book book){
        catalog.addBook(book);
    }

    public static Book getBook(Book book){
       return catalog.searchByTitle(book.getTitle());
    }

    public static List<Book> getAllBooksOfCategory(String category){
        return catalog.searchByCategory(category);
    }
}
