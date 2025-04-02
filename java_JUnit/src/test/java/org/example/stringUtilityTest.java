package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringUtilityTest {
    @Test
    void testReverse() {
        assertEquals("olleH", stringUtility.reverse("Hello"));
        assertEquals("avaJ", stringUtility.reverse("Java"));
        assertEquals("", stringUtility.reverse(""));
        assertNull(stringUtility.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtility.isPalindrome("madam"));
        assertTrue(stringUtility.isPalindrome("racecar"));
        assertTrue(stringUtility.isPalindrome("Mom")); // Case-insensitive
        assertFalse(stringUtility.isPalindrome("hello"));
        assertFalse(stringUtility.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtility.toUpperCase("hello"));
        assertEquals("JAVA", stringUtility.toUpperCase("Java"));
        assertEquals("", stringUtility.toUpperCase(""));
        assertNull(stringUtility.toUpperCase(null));
    }

}