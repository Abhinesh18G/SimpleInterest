package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSimpleInterest() {
        assertEquals(200.0, App.calculateSI(1000, 5, 2), 0.01);
    }

    @Test
    public void testZeroInterest() {
        assertEquals(0.0, App.calculateSI(1000, 0, 2), 0.01);
    }
}
