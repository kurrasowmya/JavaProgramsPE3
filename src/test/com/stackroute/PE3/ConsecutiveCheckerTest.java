package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckerTest {
    ConsecutiveChecker ob = new ConsecutiveChecker();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestNonConsecutiveChecker() {
        String res = ob.consecutiveChecker(23456372);
        assertEquals("23456372 doesn't contains consecutive numbers", res);
    }

    @Test
    public void TestConsecutiveChecker() {
        String res = ob.consecutiveChecker(9876543);
        assertEquals("9876543 contains consecutive numbers", res);
    }
}
