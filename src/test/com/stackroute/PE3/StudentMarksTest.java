package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks ob=new StudentMarks();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checsValidkMarks() {
        int[] marks={12,43,32,87};
        int res=ob.checkMarks(4,marks);
        assertEquals(1,res);
    }
    @Test
    public void checsInalidkMarks() {
        int[] marks={123,43,32,87};
        int res=ob.checkMarks(4,marks);
        assertEquals(0,res);
    }
}