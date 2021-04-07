package com.java.casestudies.library;

import java.util.List;

public interface Search {
     Book searchByTitle(String bookTitle);
     List<Book> searchByAuthor(String authorName);
     List<Book> searchByCategory(String category);
}
