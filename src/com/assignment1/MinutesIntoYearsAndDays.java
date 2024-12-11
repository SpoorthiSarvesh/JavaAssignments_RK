//4. Write a Java program to convert minutes into years and days.
//
//        Test Data
//Input the number of minutes: 3456789
//Expected Output :
//        3456789 minutes is approximately 6 years and 210 days
package com.assignment1;

import java.util.Scanner;

public class MinutesIntoYearsAndDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        int minutes=sc.nextInt();
        int years=(minutes)/525600;
        int days=(minutes)/1440;
        System.out.println(minutes+" minutes is approximately "+years+" years "+days+" days.");
    }
}
