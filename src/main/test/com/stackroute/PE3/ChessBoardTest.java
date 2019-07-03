package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard obj = new ChessBoard();


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @Test
    public void givenNumberofChecksvalueisTakenAndthepatternStringIsreturned() {
        String res = obj.chessBoardPattern(8);
        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n", res);

    }

    @Test
    public void givennumberIsZeroAndItShoulsReturn() {
        String res = obj.chessBoardPattern(0);
        assertNotEquals("WW", res);
    }
}
