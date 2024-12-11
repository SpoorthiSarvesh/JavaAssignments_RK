//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//        Test Data
//Input number: 3
//Expected Output :
//Wednesday
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class DisplayWeekDayName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Number");
        int number=sc.nextInt();
        String weak;
        switch (number){
            case 1:
                weak="Monday";
                break;
            case 2:
                weak="Tuesday";
                break;
            case 3:
                weak="Wednesday";
                break;
            case 4:
                weak="Thursday";
                break;
            case 5:
                weak="Friday";
                break;
            case 6:
                weak="Saturday";
                break;
            case 7:
                weak="Sunday";
                break;
            default:
                System.out.println("Enter Number Between 1-7");
                return;
        }
        System.out.println(weak);
    }
}
