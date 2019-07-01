package com.stackroute.PE3;

public class VowelRemover {
    public String vowelRemover(String input)
    {
        String output="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            {
                continue;
            }
            output=output+input.charAt(i);
        }
        return output;
    }
}

