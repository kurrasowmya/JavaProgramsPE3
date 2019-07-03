package com.stackroute.PE3;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover obj;

    @Before
    public void setUp() throws Exception {
        obj=new VowelRemover();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStringisconsideredAndVowelsAreRemoved(){
        String res=obj.vowelRemover("java");
        assertEquals("jv",res);
    }
    @Test
    public void givenStringWithSpaceIsConsideredAndVowelsAreRemoved(){
        String res=obj.vowelRemover("all well");
        assertEquals("ll wll",res);
    }
    @Test
    public void GivenStringwithAllVowelsIsconsideredAndNullStringIsReturned(){
        String res=obj.vowelRemover("aeiou");
        assertNotEquals(null,res);
    }
}