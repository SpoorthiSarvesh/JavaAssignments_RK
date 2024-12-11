package com.assignment_NumberPrograms;

import java.util.Scanner;

public class SphenicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSphenic(number)) {
            System.out.println(number + " is a Sphenic Number.");
        } else {
            System.out.println(number + " is not a Sphenic Number.");
        }
    }

    // Function to check if the number is a Sphenic Number
    public static boolean isSphenic(int num) {
        // To store distinct prime factors
        int count = 0;

        // Check for factor of 2
        if (num % 2 == 0) {
            count++;
            while (num % 2 == 0) {
                num /= 2;
            }
        }

        // Check for odd prime factors from 3 upwards
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                count++;
                while (num % i == 0) {
                    num /= i;
                }
            }
        }

        // If remaining number is greater than 2, it is a prime factor
        if (num > 2) {
            count++;
        }

        // A Sphenic number must have exactly 3 distinct prime factors
        return count == 3;
    }
}

