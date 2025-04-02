package java_JUnit.src.test.java.org.example;

import java_JUnit.src.main.java.org.example.bankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccountTest {
    private bankAccount account;

    @BeforeEach
    void setUp() {
        account = new bankAccount(100.00); // Initial balance: 100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(40.0));
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testWithdrawFailsForInsufficientFunds() {
        assertFalse(account.withdraw(200.0));
        assertEquals(100.0, account.getBalance()); // Balance remains unchanged
    }

}