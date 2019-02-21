package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class MatchingCharTest {

    MatchingChar matchingChar;

    @Before
    public void setUp() throws Exception {
        matchingChar = new MatchingChar();
    }

    @After
    public void tearDown() throws Exception {
        matchingChar = null;
    }

    @Test
    public void matchChar1() {
        assertEquals( "Capital Letter", matchingChar.MatchChar('A') );
    }
    @Test
    public void matchChar2() {
        assertEquals( "Special Symbol", matchingChar.MatchChar('-') );
    }
    @Test
    public void matchChar3() {
        assertEquals( "A Digit", matchingChar.MatchChar('9') );
    }

}