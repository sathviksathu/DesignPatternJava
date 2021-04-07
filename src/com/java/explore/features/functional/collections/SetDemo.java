package com.java.explore.features.functional.collections;

import com.java.explore.features.streams.Book;

import java.util.*;

public class SetDemo {
    private static Book ikigai;
    private static Book zen;
    private static Book atomicHabits;
    private static List<Book> dupBooks;
    public static void main(String[] args) {

        createBooks();
        //List is an ordered collection which preserves the order of entries
        List<Book> dupBooks = Arrays.asList(ikigai,zen,atomicHabits,ikigai,atomicHabits,zen);
        System.out.println("Before removing duplicates");
        System.out.println(dupBooks.toString());

        //Set is a collection whose main aim is to filter out the duplicates
        //Using set to remove the dups
        Set<Book> noDupBooks = new HashSet<>(dupBooks);
        System.out.println("After removing duplicates");
        System.out.println(noDupBooks.toString());

        //Another important thing about sets is it automatically sorts
        Set<Integer> noDupsSortedNumbers = new HashSet<>(Arrays.asList(4,3,3,2,1,2,1,4));
        System.out.println("Sorted and No Duplicates of Array: 4,3,3,2,1,2,1,4");
        System.out.println(noDupsSortedNumbers.toString());

    }

    private static void createBooks() {
        ikigai = new Book("Ikigai","Hector Garcia", 222);
        zen = new Book("Zen", "Shumyo", 227);
        atomicHabits = new Book("Atomic Habits", "James Clear", 234);
    }
}
