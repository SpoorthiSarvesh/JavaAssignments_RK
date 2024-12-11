package com.assignment_NumberPrograms;

import java.util.Scanner;

public class KrishnamurthyNumber {

    // Function to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if the number is Krishnamurthy number
    public static boolean isKrishnamurthyNumber(int number) {
        int sum = 0;
        int temp = number;

        // Loop through each digit of the number
        while (temp != 0) {
            int digit = temp % 10;  // Extract the last digit
            sum += factorial(digit); // Add the factorial of the digit to the sum
            temp /= 10;  // Remove the last digit
        }

        // Check if the sum of factorials is equal to the original number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is Krishnamurthy number
        if (isKrishnamurthyNumber(number)) {
            System.out.println(number + " is a Krishnamurthy Number.");
        } else {
            System.out.println(number + " is not a Krishnamurthy Number.");
        }

        scanner.close();
    }
}
