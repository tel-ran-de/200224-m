package org.example;

import org.junit.jupiter.api.Test;

import static org.example.GetMaxClass.findMax;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxClassTest {

    @Test
    void findMaxNotEmptyResultTest() {
        int[] arr = {0, -5, 7};
        assertNotNull(findMax(arr));
    }

    @Test
    void findMaxExpectResultTest() {
        int[] arr = {0, -5, 7};
        int max = 7;
        assertEquals(max, findMax(arr));
    }

    @Test
    void findMaxNotEmptyArrayTest() {
        assertNotNull(new int[]{0, -5, 7});
    }

    @Test
    void findMaxEmptyArrayTest() {
        int [] arr = null;
        assertNull(arr);
    }
}