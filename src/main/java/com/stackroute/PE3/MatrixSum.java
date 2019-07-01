package com.stackroute.PE3;

public class MatrixSum {
    public String matrixSum(int row,int column,int[][] matrix1, int[][] matrix2)
    {
        int i,j,sum=0;
        String output="";
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                sum=sum+matrix1[i][j]+matrix2[i][j];
                output=output+sum+ " ";
            }
            output=output+"\n";
            sum=0;
        }
        return output;
    }
}
