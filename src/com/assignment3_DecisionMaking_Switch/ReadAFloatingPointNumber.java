//
//4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
//
//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class ReadAFloatingPointNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else {

            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }
            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1_000_000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }

    }
}
