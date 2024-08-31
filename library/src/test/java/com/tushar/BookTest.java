package com.tushar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testISBNisNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book(null, "Rich Dad Poor Dad", "Robert T. Kiyosaki", 2011));
        assertEquals("ISBN should not be null or empty", exception.getMessage());
    }

    @Test
    public void testTitleIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9781612680194", null, "Robert T. Kiyosaki", 2011));
        assertEquals("Title should not be null or empty", exception.getMessage());
    }

    @Test
    public void testAuthorIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9781612680194", "Rich Dad Poor Dad", "", 2011));
        assertEquals("Author should not be null or empty", exception.getMessage());
    }

    @Test
    public void testPublicationYearIsNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9781612680194", "Rich Dad Poor Dad", "Robert T. Kiyosaki", -2011));
        assertEquals("Publication year should be a positive integer", exception.getMessage());
    }

}
