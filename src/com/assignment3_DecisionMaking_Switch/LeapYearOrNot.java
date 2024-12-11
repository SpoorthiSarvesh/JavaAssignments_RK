//9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
//
//        Test Data
//Input the year: 2016
//Expected Output :
//        2016 is a leap year
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();
        if(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) )
        {
            System.out.println(year + " is a leap year");
        }
        else
            System.out.println("Not a leap year");
    }
}
