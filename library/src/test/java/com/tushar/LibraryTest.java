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


    }
}
