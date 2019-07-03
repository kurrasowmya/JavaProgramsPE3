package com.stackroute.PE3;

public class ExceptionGenerator {
    public static void main(String[] args) {
        //Negative number exception
        try{
            throw new NegativeArraySizeException("Negative Array size exception is created and handled");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        //Indexout of bounf exception
        try{
            throw new IndexOutOfBoundsException("Index out of bound exception is created and handled");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        //Null pointer exception
        try{
            throw new NullPointerException("Null Pointer Exception exception is created and handled");
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
