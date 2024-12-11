//Java Program to Check if a Given Number is Perfect Square
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect square
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if the number is a perfect square
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;  // Negative numbers can't be perfect squares
        }

        // Find the square root of the number and cast it to an integer
        int sqrt = (int) Math.sqrt(num);

        // Check if the square of the integer square root is equal to the number
        return sqrt * sqrt == num;
    }
}
