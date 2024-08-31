package com.tushar;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest
{
    Library library = new Library();

    @Test
    public void testAddBook() {

    //1. test case for add book
        Book validBook = new Book("9781612680194", "Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997);
        library.addBook(validBook);

    //2. test case for add book with null value
        Exception exception = assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
        assertEquals("Book should not be null", exception.getMessage());

    //3. test case for adding a book with duplicate ISBN
        Book duplicateBook = new Book("9781612680194", "Another Book", "Another Author", 2020);
        Exception duplicateException = assertThrows(IllegalStateException.class, () -> library.addBook(duplicateBook));
        assertEquals("Book with this ISBN already exists in the library", duplicateException.getMessage());

    }

    @Test
    public void testBorrowBook() {

        Book book = new Book("9780446574724", "Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997);
        library.addBook(book);

    //1. Borrowing book here
        library.borrowBook(book.getISBN());

    //2.Attempt to borrow the same book again
        IllegalStateException exception1 = assertThrows(IllegalStateException.class, () -> library.borrowBook(book.getISBN()));
        assertEquals("Book is already borrowed", exception1.getMessage());


    }


}
