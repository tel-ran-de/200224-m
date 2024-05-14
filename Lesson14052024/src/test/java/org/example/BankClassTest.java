package org.example;

import org.junit.jupiter.api.Test;

import static org.example.BankClass.isValidAccountNumber;
import static org.junit.jupiter.api.Assertions.*;

class BankClassTest {

    @Test
    void isValidAccountNumberNullTest() {
        assertFalse(isValidAccountNumber(null));
    }

    @Test
    void isValidAccountNumberNotNullTest() {
        assertTrue(isValidAccountNumber("01234567890000"));
    }
}