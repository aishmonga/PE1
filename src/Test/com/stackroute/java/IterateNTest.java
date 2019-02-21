package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterateNTest {


    IterateN iterateN ;

    @Before
    public void setUp() throws Exception {
        iterateN = new IterateN();
    }

    @After
    public void tearDown() throws Exception {
        iterateN = null;
    }

    @Test
    public void seriesfunc1() {
        assertEquals("1 2 2" ,iterateN.Seriesfunc(2));
    }
    @Test
    public void seriesfunc2() {
        assertEquals("1" ,iterateN.Seriesfunc(1));
    }
    @Test
    public void seriesfunc3() {
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5" ,iterateN.Seriesfunc(5 ));
    }
}