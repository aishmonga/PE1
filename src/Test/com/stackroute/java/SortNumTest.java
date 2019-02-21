package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumTest {

    SortNum sortNum;

    @Before
    public void setUp() throws Exception {
        sortNum = new SortNum();
    }

    @After
    public void tearDown() throws Exception {
        sortNum = null;
    }

    @Test
    public void sortFunc1() {
        assertEquals(false,sortNum.SortFunc("11112"));
    }
    @Test
    public void sortFunc2() {
        assertEquals(false,sortNum.SortFunc("12315"));
    }

    @Test
    public void sortFunc3() {
        assertEquals(true,sortNum.SortFunc("44444444"));
    }

}