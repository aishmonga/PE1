package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumTest {

    GuessNum guessNum;

    @Before
    public void setUp() throws Exception {
        guessNum = new GuessNum();
    }

    @After
    public void tearDown() throws Exception {
        guessNum = null;
    }

    @Test
    public void guessFunc1() {
        assertEquals("input matches the originalNum" , guessNum.GuessFunc(20));
    }
    @Test
    public void guessFunc2() {
        assertEquals("input is more than originalNum" , guessNum.GuessFunc(21));
    }
    @Test
    public void guessFunc3() {
        assertEquals("input is less than originalNum" , guessNum.GuessFunc(19));
    }
}