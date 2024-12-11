//1.write java program for Fibonacci series
//        Ex:
//        In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
package com.assignment5_Basic_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms");
        int n= sc.nextInt();
        int first=0;
        int second=1;
        if(n>=0)
        {
            System.out.print(first);
        }
        if(n>=1)
        {
            System.out.print("," +second);
        }
        for(int i=3;i<=n;i++)
        {
            int nextTerm=first+second;
            System.out.print(","+ nextTerm);
            first=second;
            second=nextTerm;
        }
    }
}
