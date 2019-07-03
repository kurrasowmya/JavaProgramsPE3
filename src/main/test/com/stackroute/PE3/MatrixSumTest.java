package com.stackroute.PE3;

import org.junit.*;

import static org.junit.Assert.*;

public class MatrixSumTest {
    MatrixSum obj;

    @Before
    public void setUp() throws Exception {
        obj=new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenTwoMatrixtwobytwoAreAddedAndSumIsReturned() {
        int[][] Matrix1={{1,2,4},{1,2,4}};
        int[][] Matrix2={{12,2,6},{5,2,4}};

        String res=obj.matrixSum(2,3,Matrix1,Matrix2);
        assertEquals("13 17 27 \n" +
                "6 10 18 \n",res);
    }
    @Test
    public void givenTwoMatrixAreAddedandTheSumisReturned() {
        int[][] Matrix1={{1,2,4},{1,2,4},{3,5,1}};
        int[][] Matrix2={{12,2,6},{5,2,4},{4,6,1}};

        String res=obj.matrixSum(3,3,Matrix1,Matrix2);
        assertNotEquals("6 10 18 \n" +
                "7 18 20 \n",res);
    }
}