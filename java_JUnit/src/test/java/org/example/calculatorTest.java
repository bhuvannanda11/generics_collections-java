package java_JUnit.src.test.java.org.example;
import  org.example.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @Test
    public void testAdd() {
        org.example.calculator Calculator = new org.example.calculator();
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(-2, 1));
    }
    @Test
    public void testSubtract() {
        org.example.calculator Calculator = new org.example.calculator();
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(-3, Calculator.subtract(-2, 1));
    }
    @Test
    public void testMultiply() {
        org.example.calculator Calculator = new calculator();
        assertEquals(6, Calculator.multiply(3, 2));
        assertEquals(0, Calculator.multiply(0, 1));
    }
    @Test
    public void testDivide() {
        calculator Calculator = new calculator();
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-3, Calculator.divide(-9, 3));
    }
    @Test
    public void testDivideByZero() {
        calculator Calculator = new calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }


}