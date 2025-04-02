package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class userRegisTest {
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegis.registerUser("JohnDoe", "john@example.com", "SecurePass1"));
    }

    @Test
    public void testInvalidUserRegistration() {
        assertThrows(IllegalArgumentException.class, () -> userRegis.registerUser("", "john@example.com", "SecurePass1")); // Empty username
        assertThrows(IllegalArgumentException.class, () -> userRegis.registerUser("JohnDoe", "invalid-email", "SecurePass1")); // Invalid email
        assertThrows(IllegalArgumentException.class, () -> userRegis.registerUser("JohnDoe", "john@example.com", "short")); // Password too short
    }

}