package com.assignment4_ForLoop;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j>=i)

                    System.out.print("*");
                    else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
