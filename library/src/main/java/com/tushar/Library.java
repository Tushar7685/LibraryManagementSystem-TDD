package com.tushar;

import java.util.HashMap;
import java.util.Map;

public class Library
{
    private final Map<String, Book> bookInventory;
    private final Map<String, Book> borrowedBooks;

    public Library() {
        this.bookInventory = new HashMap<>();
        this.borrowedBooks = new HashMap<>();
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

    public void borrowBook(String isbn) {

        if (borrowedBooks.containsKey(isbn)) {
            throw new IllegalStateException("Book is already borrowed");
        }

    Book book = bookInventory.get(isbn);

        if (book == null) {
            throw new IllegalArgumentException("Book not found");
        }

    bookInventory.remove(isbn);            // Remove from inventory
    borrowedBooks.put(isbn, book);         // Add to borrowed books

}

}
