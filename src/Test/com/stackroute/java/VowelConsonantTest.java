package com.stackroute.java;

import com.stackroute.java.VowelConsonant;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vc ;

    @Before
    public void setUp() throws Exception {
        vc = new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vc = null;
    }

    @Test
    public void vowelCons1() {
        assertEquals("Vowel Consonant Vowel Consonant" , vc.vowelCons("asih"));
    }

    @Test
    public void vowelCons2() {
        assertEquals("Vowel Consonant" , vc.vowelCons("ab"));
    }
    @Test
    public void vowelCons3() {
        assertEquals("Consonant Vowel Consonant" , vc.vowelCons("cat"));
    }

}