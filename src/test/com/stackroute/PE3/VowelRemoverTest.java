package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover ob=new VowelRemover();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void vowelRemover1(){
        String res=ob.vowelRemover("India");
        assertEquals("Ind",res);
    }
    @Test
    public void vowelRemover2(){
        String res=ob.vowelRemover("United States");
        assertEquals("Untd Stts",res);
    }
    @Test
    public void vowelRemover3(){
        String res=ob.vowelRemover("Germany");
        assertEquals("Grmny",res);
    }
}