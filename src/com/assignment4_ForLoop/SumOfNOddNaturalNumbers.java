//Write a Java program that displays the sum of n odd natural numbers.
//
//        Test Data
//Input number of terms is: 5
//Expected Output :
//
//The odd numbers are :
//        1
//        3
//        5
//        7
//        9
//The Sum of odd Natural Number upto 5 terms is: 25
package com.assignment4_ForLoop;

import java.util.Scanner;

public class SumOfNOddNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number ");
        int numberCount= sc.nextInt();
        int sum=0;
        int oddnumber=1;
        for(int i=1;i<=numberCount;i++)
        {
            System.out.println(oddnumber);
            sum+=oddnumber;
            oddnumber+=2;
        }
        System.out.println("Sum of odd numbers is "+sum);
    }
}
