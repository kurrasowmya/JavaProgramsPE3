package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard ob=new ChessBoard();


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }



        @Test
        public void chessBoardPattern() {
            String res=ob.chessBoardPattern();
            assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n",res);

        }
    }
