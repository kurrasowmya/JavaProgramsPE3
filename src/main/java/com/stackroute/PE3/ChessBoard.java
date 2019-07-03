package com.stackroute.PE3;

public class ChessBoard {
        public String chessBoardPattern(int n)
        {
            String[][] str=new String[n][n];
            //initialize the empty String
            String output="";
            //Check number greater than zero or not
            if(n>0) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        //check sum divides by zero or not
                        if ((i + j) % 2 == 0) {
                            str[i][j] = "WW|";
                        } else {
                            str[i][j] = "BB|";
                        }
                    }
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        //add the element to the output
                        output = output + str[i][j];
                    }
                    System.out.println();
                    output = output + "\n";
                }
                //return output
                return output;
            }
            else
                return null;
        }
    }

