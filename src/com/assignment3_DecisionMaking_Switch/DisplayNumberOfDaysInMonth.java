//
//7. Write a Java program to find the number of days in a month.
//
//        Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class DisplayNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNumber=sc.nextInt();
        System.out.println("Enter Year");
        int year=sc.nextInt();
        int days;
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println(monthName + " " + year + " has " + days + " days.");

    }
}

