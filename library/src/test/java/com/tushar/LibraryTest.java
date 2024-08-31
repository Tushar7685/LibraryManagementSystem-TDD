package com.tushar;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LibraryTest
{
    Library library = new Library();

    @Test
    public void testAddBook() {

    // test case for add book
        Book validBook = new Book("9781612680194", "Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997);
        library.addBook(validBook);
}
}