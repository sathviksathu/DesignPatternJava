package com.java.explore.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Book> books = createBooks();

        //Using Streams to calculate total number of pages in all books
        int totalNumberOfPages = books.stream().collect(Collectors.summingInt(Book::getNoOfPages));
        System.out.println("The total number of pages: "+totalNumberOfPages);

        //Using streams to extract a list of author names of all books
        List<String> authors = books.stream().map(Book::getAuthor).collect(Collectors.toList());

        System.out.println("Names of all authors: ");
        //Using streams to print all author names
        authors.stream().forEach((author)->System.out.println(author));

        System.out.println("Names of all  containing 'a': ");
        //Using streams to print all author names containing 'a
        authors.stream().filter((name)->name.contains("a")).forEach((author)->System.out.println(author));

        System.out.println("Names of all  containing 'a' and 'l': ");
        //Using streams to print all author names containing 'a' and 'l'
        Predicate<String> aFilter = (name) -> name.contains("a");
        Predicate<String> eFilter = (name) -> name.contains("l");
        Consumer<String> printer = (name) -> System.out.println(name);
        authors.stream().filter(aFilter.and(eFilter)).forEach((author) -> printer.accept(author));

    }

    private static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Ikigai","Hector Garcia",143));
        books.add(new Book("Zen","Shunmyo",224));
        books.add(new Book("Atomic Habits","James Clear",288));
        return books;
    }
}
