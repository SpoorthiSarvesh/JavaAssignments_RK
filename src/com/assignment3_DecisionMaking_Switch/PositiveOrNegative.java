//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//
//        Test Data
//Input number: 35
//Expected Output :
//Number is positive
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }

    }
}
