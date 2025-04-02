package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(passwordValidator.strength("StrongPass1"));
        assertTrue(passwordValidator.strength("Hello123"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(passwordValidator.strength("short1"));       // Less than 8 chars
        assertFalse(passwordValidator.strength("nouppercase1")); // No uppercase letter
        assertFalse(passwordValidator.strength("NoDigitHere"));  // No digit
    }

}