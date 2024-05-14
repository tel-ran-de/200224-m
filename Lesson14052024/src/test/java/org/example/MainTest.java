package org.example;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.example.Main.getNumbers;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @BeforeAll
    static void initBeforeAll() {
        System.out.println("Befor");
    }

    @AfterAll
    static void initAfterAll() {
        System.out.println("After");
    }

    @BeforeEach
    void initBeforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    void initAfterEach() {
        System.out.println("After Each");
    }

    @Test
    void getNumbersAssertNotEqualsTest() {
        int[] arr = {1, 2, 3};
        assertNotEquals(arr, getNumbers());
    }

    @Test
    void getNumbersAssertArrayEqualsTest() {
        int[] arr = {1, 2, 3};
        assertArrayEquals(arr, getNumbers());
    }

//    @Test
//    void getNumbersCheckNullTest() {
//        int[] arr = null;
//        assertNull(arr);
//    }

    @Test
    void getNumbersCheckNotNullTest() {
        assertNotNull(getNumbers());
    }
}