//10. Write a program to find the Maximum of Two Numbers using switch statement
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class MaxOfNumbersUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        int max;
        switch (Integer.compare(num1, num2)) {
            case 1:
                max = num1;
                break;
            case -1:
                max = num2;
                break;
            default:
                max = num1;
                break;
        }


        System.out.println("The maximum number is: " + max);
    }
}
