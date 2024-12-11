//Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
//
//        The pattern is as follows :
//
//        1
//        22
//        333
//        4444

        package com.assignment4_ForLoop;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
