
//Java Program to Find Square Root of a Number Without sqrt Method
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to find the square root: ");
        double number = scanner.nextDouble();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Cannot find the square root of a negative number.");
        } else {
            // Calculate the square root using Math.sqrt()
            double squareRoot = Math.sqrt(number);
            System.out.printf("The square root of %.2f is %.6f\n", number, squareRoot);
        }

        // Close the scanner
        scanner.close();
    }
}
