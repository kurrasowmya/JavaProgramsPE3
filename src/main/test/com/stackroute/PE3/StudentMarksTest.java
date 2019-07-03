package com.stackroute.PE3;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;

    @Before
    public void setUp() throws Exception {
        obj=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void givenmarksandnumbermatchesSoitreturnsone() {
        int[] marks={12,56,83,45,36};
        int res=obj.checkMarks(5,marks);
        assertEquals(1,res);
    }
    @Test
    public void givenmarksexceedsTheRangeSoitShouldReturnZero() {
        int[] marks={36,1065,56};
        int res=obj.checkMarks(3,marks);
        assertNotEquals(1,res);
    }
}