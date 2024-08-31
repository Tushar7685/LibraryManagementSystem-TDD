package com.tushar;

import java.util.HashMap;
import java.util.Map;

public class Library
{
    private final Map<String, Book> bookInventory;

    public Library() {
        this.bookInventory = new HashMap<>();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book should not be null");
        }

        String isbn = book.getISBN();
        if (bookInventory.containsKey(isbn)) {
            throw new IllegalStateException("Book with this ISBN already exists in the library");
        }

        bookInventory.put(isbn, book);
    }

}
