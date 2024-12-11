package com.assignment_NumberPrograms;

import java.util.Scanner;

public class BouncyNumber {

    // Function to check if a number is bouncy
    public static boolean isBouncy(int number) {
        // Convert number to string to easily extract digits
        String numStr = Integer.toString(number);

        // Flags to check if number is increasing or decreasing
        boolean increasing = false;
        boolean decreasing = false;

        // Loop through the digits of the number
        for (int i = 1; i < numStr.length(); i++) {
            // Check if current digit is greater than previous digit
            if (numStr.charAt(i) > numStr.charAt(i - 1)) {
                increasing = true;
            }
            // Check if current digit is less than previous digit
            else if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                decreasing = true;
            }

            // If both increasing and decreasing flags are true, the number is bouncy
            if (increasing && decreasing) {
                return true;
            }
        }

        // If the number is either strictly increasing or strictly decreasing, it's not bouncy
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is bouncy
        if (isBouncy(number)) {
            System.out.println(number + " is a Bouncy Number.");
        } else {
            System.out.println(number + " is not a Bouncy Number.");
        }

        scanner.close();
    }
}

