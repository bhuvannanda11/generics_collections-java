package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class convertTempTest {
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, convertTemp.convertToFahrenheit((0)), 0.01);
        assertEquals(98.6, convertTemp.convertToFahrenheit((37)), 0.01);
        assertEquals(212.0, convertTemp.convertToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, convertTemp.convertToCelsius(32), 0.01);
        assertEquals(37.0, convertTemp.convertToCelsius(98.6), 0.01);
        assertEquals(100.0, convertTemp.convertToCelsius(212), 0.01);
    }

}