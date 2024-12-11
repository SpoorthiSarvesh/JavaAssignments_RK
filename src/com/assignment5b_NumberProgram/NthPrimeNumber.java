
//nth Prime Number Java
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class NthPrimeNumber {
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

    // Function to find the nth prime number
    public static int findNthPrime(int n) {
        int count = 0;  // To count how many primes we've found
        int num = 2;    // Start checking from 2 (the first prime number)

        while (true) {
            if (isPrime(num)) {
                count++; // Found a prime number
                if (count == n) {
                    return num; // Return the nth prime number
                }
            }
            num++; // Check the next number
        }
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the nth prime number they want to find
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find and print the nth prime number
        int nthPrime = findNthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrime);

        // Close the scanner
        scanner.close();
    }
}
