package com.assignment_NumberPrograms;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        // Loop through the digits of the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;            // Add to sum
            product *= digit;        // Multiply to product
            number /= 10;            // Remove the last digit
        }

        // Check if the sum is equal to the product
        return sum == product;
    }
}
