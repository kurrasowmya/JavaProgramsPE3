package com.stackroute.PE3;

public class StudentMarks {
    public int checkMarks(int n,int[] marks)
    {
        int i;
        //Iterate until we reach n value
        for( i=0;i<n;i++)
        {
            //check whether marks in range 0 to 100
            if(marks[i]<0||marks[i]>100)
            {
                return 0;
            }
        }
        //return one if i equals count
        if(i==n)
        {
            return 1;
        }
        return 0;
    }
}
