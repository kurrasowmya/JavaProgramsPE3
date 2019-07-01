package com.stackroute.PE3;

public class ChessBoard {
        public String chessBoardPattern()
        {
            String[][] outp=new String[8][8];
            //return null;
            String output="";
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if((i+j)%2==0)
                    {
                        outp[i][j]="WW|";
                    }
                    else
                    {
                        outp[i][j]="BB|";
                    }
                }
            }
            System.out.println("---------CHESS BOARD-----------");
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    System.out.print(outp[i][j]);
                    output=output+outp[i][j];
                }
                System.out.println();
                output=output+"\n";
            }

            return output;
        }
    }

