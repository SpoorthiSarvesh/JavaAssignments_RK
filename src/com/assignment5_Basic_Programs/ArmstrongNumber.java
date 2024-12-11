
//write java programe for Armstrong Number ?
package com.assignment5_Basic_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();  // Count the number of digits
        int sum = 0;

        // Calculate sum of each digit raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            sum += Math.pow(digit, numberOfDigits);  // Add the digit raised to the power of number of digits
            num /= 10;  // Remove the last digit
        }

        // If sum equals the original number, it's an Armstrong number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is Armstrong and display the result
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
