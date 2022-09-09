package com.example.lab_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    Functions func = new Functions();
    @Test
    public void maxFunc_isCorrect()
    {
        assertEquals(3, func.maxFunc(2,3));
        assertEquals(4, func.maxFunc(4,3));
        assertEquals(5, func.maxFunc(2,5));
        assertEquals(6, func.maxFunc(6,3));
    }

    @Test
    public void minFunc_isCorrect()
    {
        assertEquals(2, func.minFunc(2,3));
        assertEquals(3, func.minFunc(4,3));
        assertEquals(2, func.minFunc(2,5));
        assertEquals(3, func.minFunc(6,3));
    }
}