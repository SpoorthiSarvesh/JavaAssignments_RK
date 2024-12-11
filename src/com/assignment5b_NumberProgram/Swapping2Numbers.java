//Java Program to Swap Two Numbers Using Bitwise Operator
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class Swapping2Numbers
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Swap the two numbers using XOR bitwise operator
        a = a ^ b;  // Step 1: a becomes the XOR of a and b
        b = a ^ b;  // Step 2: b becomes the original value of a
        a = a ^ b;  // Step 3: a becomes the original value of b

        // Display the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        // Close the scanner
        scanner.close();
    }
}
