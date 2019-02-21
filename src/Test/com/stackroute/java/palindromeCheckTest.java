package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.stackroute.java.*;

import static org.junit.Assert.*;

public class palindromeCheckTest {


    palindromeCheck pc;


    @Before
    public void setUp() throws Exception {


        pc = new  palindromeCheck ();


    }

    @After
    public void tearDown() throws Exception {

        pc = null ;

    }


    @Test
    public void pCheck1() {

        assertEquals("121 is palindrome and the sum of even numbers is less than 25" , pc.pCheck(121));

    }


    @Test
    public void pCheck2() {

        assertEquals( "This is not palindrome" , pc.pCheck(12345));

    }

//    @Test
//    public void pCheck3() {
//
//        assertEquals( "is not palindrome" , pc.pCheck(12345));
//
//    }


}