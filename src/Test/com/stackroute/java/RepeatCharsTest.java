    package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharsTest {

    RepeatChars repeatChars;

    @Before
    public void setUp() throws Exception {
        repeatChars = new RepeatChars();
    }

    @After
    public void tearDown() throws Exception {
        repeatChars = null;
    }

    @Test
    public void repeatFunc1() {

        assertEquals("aishyhyhy" , repeatChars.repeatFunc("aishy" , 2));

    }
    @Test
    public void repeatFunc2() {

        assertEquals("lalala" , repeatChars.repeatFunc("la" , 2));

    }
    @Test
    public void repeatFunc3() {

        assertEquals("happyppyppyppy" , repeatChars.repeatFunc("happy" , 3));

    }
}