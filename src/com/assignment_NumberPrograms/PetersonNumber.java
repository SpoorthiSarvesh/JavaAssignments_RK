package com.assignment_NumberPrograms;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPeterson(number)) {
            System.out.println(number + " is a Peterson Number.");
        } else {
            System.out.println(number + " is not a Peterson Number.");
        }
    }

    // Method to check if a number is a Peterson Number
    public static boolean isPeterson(int number) {
        int sum = 0, temp = number;

        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit
            sum += factorial(digit);  // Add factorial of the digit to the sum
            temp /= 10;  // Remove the last digit
        }

        return sum == number;  // Check if the sum equals the original number
    }

    // Method to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

