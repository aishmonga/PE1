package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionCheckTJTest {

    ConditionCheckTJ cTJ ;

    @Before
    public void setUp() throws Exception {

        cTJ = new ConditionCheckTJ();

    }

    @After
    public void tearDown() throws Exception {

        cTJ = null;

    }

    @Test
    public void tomJerry1() {
        assertEquals("Tom" , cTJ.TomJerry( 21 ));
    }

    @Test
    public void tomJerry2(){
        assertEquals("Jerry" ,cTJ.TomJerry( 22 ));
    }

    @Test
    public void tomJerry3(){
        assertEquals("! TomJerry" ,cTJ.TomJerry( 2 ));
    }
}