package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddIntTest {

    AddInt add ;

    @Before
    public void setUp() throws Exception {
        add = new AddInt();
    }

    @After
    public void tearDown() throws Exception {
        add = null;
    }

    @Test
    public void addfunc1() {
        assertEquals(2 ,add.addfunc("1 1") );
    }
    @Test
    public void addfunc2() {
        assertEquals(22 ,add.addfunc("1 1  20") );
    }
    @Test
    public void addfunc3() {
        assertEquals(62 ,add.addfunc("1 1 10 20 30 ") );
    }
}