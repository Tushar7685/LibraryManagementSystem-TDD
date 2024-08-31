package com.tushar;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(String isbn, String title, String author, int publicationYear) {
        validateRequiredAttributes(isbn, title, author, publicationYear);

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private void validateRequiredAttributes(String isbn, String title, String author, int publicationYear) {
        validateString(isbn, "ISBN should not be null or empty");
        validateString(title, "Title should not be null or empty");
        validateString(author, "Author should not be null or empty");
        if (publicationYear <= 0) {
            throw new IllegalArgumentException("Publication year should be a positive integer");
        }
    }

    private void validateString(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    public String getISBN() {
        return isbn;
    }
}
