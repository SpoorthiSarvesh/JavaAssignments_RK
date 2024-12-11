//5) Sunny Number in Java
package com.assignment_NumberPrograms;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSunnyNumber(number)) {
            System.out.println(number + " is a Sunny Number.");
        } else {
            System.out.println(number + " is not a Sunny Number.");
        }
    }

    // Method to check if a number is a Sunny Number
    public static boolean isSunnyNumber(int number) {
        int nextNumber = number + 1;

        // Calculate the square root of the next number
        double sqrt = Math.sqrt(nextNumber);

        // Check if the square root is an integer
        return (sqrt == Math.floor(sqrt));
    }
}
