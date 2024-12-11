//6) Tech Number in Java
package com.assignment_NumberPrograms;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }
    }

    // Method to check if a number is a Tech Number
    public static boolean isTechNumber(int number) {
        String numStr = String.valueOf(number);

        // A Tech Number must have an even number of digits
        if (numStr.length() % 2 != 0) {
            return false;
        }

        int mid = numStr.length() / 2;

        // Split the number into two halves
        int firstHalf = Integer.parseInt(numStr.substring(0, mid));
        int secondHalf = Integer.parseInt(numStr.substring(mid));

        // Calculate the sum of the halves and its square
        int sum = firstHalf + secondHalf;
        return sum * sum == number;
    }
}
