package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exceptionalHandlingTest {

    @Test
    void testDivideByZero() {
        exceptionalHandling calculator = new exceptionalHandling();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

}