package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class GCDOf2Numbers {
    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Loop until b becomes 0
        while (b != 0) {
            int temp = b;
            b = a % b;  // Update b to be the remainder of a divided by b
            a = temp;   // Update a to be the previous value of b
        }
        return a;  // When b becomes 0, a is the GCD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int gcd = findGCD(num1, num2);

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
