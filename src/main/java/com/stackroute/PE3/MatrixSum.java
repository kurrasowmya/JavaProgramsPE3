package com.stackroute.PE3;

public class MatrixSum {
    public String matrixSum(int row,int column,int[][] matrix1, int[][] matrix2)
    {
        int i,j,sum=0;
        //Initialize the empty string
        String output="";
        //Iterate the exach element in the matrix
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                //Add the values in two matix
                sum=sum+matrix1[i][j]+matrix2[i][j];
                output=output+sum+ " ";
            }
            //Add new line to the output
            output=output+"\n";
            //Initialize sum to zero
            sum=0;
        }
        return output;
    }
}
