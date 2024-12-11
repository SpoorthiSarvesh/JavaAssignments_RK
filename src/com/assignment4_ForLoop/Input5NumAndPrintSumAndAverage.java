//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
//
//        Test Data
//        Input the 5 numbers : 1 2 3 4 5
//        Expected Output :
//
//        Input the 5 numbers :
//        1
//        2
//        3
//        4
//        5
//        The sum of 5 no is : 15
//        The Average is : 3.0
package com.assignment4_ForLoop;

import java.util.Scanner;

public class Input5NumAndPrintSumAndAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int inputNumberCount=5;
        System.out.println("Enter The numbers");
        for(int i=1;i<=inputNumberCount;i++)
        {
            System.out.println("Number " +i+ "  is :");
            int numbers=sc.nextInt();
            sum+=i;
        }
        System.out.println("The sum of "+ inputNumberCount+ "is "+sum);
        double average=((double) sum /inputNumberCount);
        System.out.println("The Average is "+ average);
    }
}
