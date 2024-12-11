//Java Program to Display Alternate Prime Numbers
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class DisplayAlternativePrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }

    // Function to display alternate prime numbers
    public static void displayAlternatePrimes(int n) {
        int count = 0; // To count how many primes we've found
        int num = 2;   // Start checking from 2 (the first prime number)
        int printedCount = 0;  // To track how many alternate primes have been printed

        // Find and print alternate primes
        while (count < n) {
            if (isPrime(num)) {
                count++;  // Found a prime number
                if (count % 2 == 1) {  // If it's an odd count, print the prime (alternate)
                    System.out.print(num + " ");
                    printedCount++;
                }
            }
            num++; // Check the next number
        }
        System.out.println("\nTotal alternate primes printed: " + printedCount);
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for how many prime numbers they want
        System.out.print("Enter the number of primes to display alternate primes: ");
        int n = scanner.nextInt();

        // Display alternate primes
        System.out.print("Alternate prime numbers: ");
        displayAlternatePrimes(n);

        // Close the scanner
        scanner.close();
    }
}
