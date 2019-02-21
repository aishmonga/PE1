package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        reverseString = null;
    }

    @Test
    public void revString1() {
        assertEquals("hsia",reverseString.RevString("aish"));
    }
    @Test
    public void revString2() {
        assertEquals("ebab",reverseString.RevString("babe"));
    }
    @Test
    public void revString3() {
        assertEquals("321",reverseString.RevString("123"));
    }
}