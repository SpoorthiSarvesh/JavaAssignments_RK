//Write a program to Check whether the number is even or odd using switch statement
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class OddOrEvenUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int remainder = num % 2;
        switch (remainder) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}



