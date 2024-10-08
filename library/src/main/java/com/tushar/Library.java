package com.tushar;

import java.util.*;

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
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }

        if (borrowedBooks.containsKey(isbn)) {
            throw new IllegalStateException("Book is already borrowed");
        }

        Book book = bookInventory.get(isbn);

        if (book == null) {
            throw new IllegalArgumentException("Book not found");
        }

        bookInventory.remove(isbn);
        borrowedBooks.put(isbn, book);
    }

    public void returnBook(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }

        Book book = borrowedBooks.get(isbn);

        if (book == null) {
            throw new IllegalArgumentException("Book was not borrowed");
        }

        borrowedBooks.remove(isbn);
        bookInventory.put(isbn, book);
    }


    public List<Book> viewAvailableBooks() {

        List<Book> availableBooks = new ArrayList<>(bookInventory.values());

        for (Book book : availableBooks) {
            System.out.println("ISBN: " + book.getISBN() + ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
        }
        return availableBooks;
    }
    }
