package com.example.myapp;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StringTest {
    
    @Test
    public void testIsString() {
        String value = "Hello";
        assertTrue(value instanceof String);
    }
}
