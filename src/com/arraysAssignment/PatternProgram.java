//
//3. Write a Java program to print the following grid.
//
//Expected Output :
//
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
package com.arraysAssignment;

public class PatternProgram {
    public static void main(String[] args) {
        int row=10;int col=10;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}

