//2) write java program for Prime Number
//ex: Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
package com.assignment5_Basic_Programs;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit to display prime numbers: ");
        int limit = scanner.nextInt();
        System.out.println("Prime numbers up to " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                System.out.print(num + " ");
            }

        }
    }
}
