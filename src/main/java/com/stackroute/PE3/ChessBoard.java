package com.stackroute.PE3;

public class ChessBoard {
        public String chessBoardPattern(int n)
        {
            String[][] outp=new String[n][n];
            //return null;
            String output="";
            if(n>0) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((i + j) % 2 == 0) {
                            outp[i][j] = "WW|";
                        } else {
                            outp[i][j] = "BB|";
                        }
                    }
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(outp[i][j]);
                        output = output + outp[i][j];
                    }
                    System.out.println();
                    output = output + "\n";
                }

                return output;
            }
            else
                return null;
        }
    }

