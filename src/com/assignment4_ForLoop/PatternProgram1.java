//Write a Java program to print Floyd's Triangle.
//
//Test Data
//Input number of rows : 5
//Expected Output :
//
//Input number of rows :  5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
package com.assignment4_ForLoop;

public class PatternProgram1 {
    public static void main(String[] args) {
        int row=5,col=5;
        int num=1;
        for(int i=1;i<=row;i++)
        {
            for (int j=1; j<=i;j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();

        }
    }
}
