package com.stackroute.PE3;

public class StudentMarks {
    public int checkMarks(int n,int[] marks)
    {
        int i;
        for( i=0;i<n;i++)
        {
            if(marks[i]<0||marks[i]>100)
            {
                return 0;
            }
        }
        if(i==n)
        {
            return 1;
        }
        return 0;
    }
}
