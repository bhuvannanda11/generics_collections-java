package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dateFormatterTest {
    @Test
    void testValidDateFormatting() {
        assertEquals("25-03-2024", dateFormatter.formatDate("2024-03-25"));
        assertEquals("01-01-2020", dateFormatter.formatDate("2020-01-01"));
    }

    @Test
    void testInvalidDateFormatting() {
        assertEquals("Invalid Date", dateFormatter.formatDate("2024-13-01")); // Invalid month
        assertEquals("Invalid Date", dateFormatter.formatDate("abc-def-ghi")); // Non-numeric date
    }

}