//7) Fascinating Number in Java
package com.assignment_NumberPrograms;

import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isFascinating(number)) {
            System.out.println(number + " is a Fascinating Number.");
        } else {
            System.out.println(number + " is not a Fascinating Number.");
        }
    }

    // Method to check if a number is fascinating
    public static boolean isFascinating(int number) {
        // Concatenate number, number*2, and number*3
        String concatenated = number + "" + (number * 2) + "" + (number * 3);

        // Check if the length of concatenated string is 9
        if (concatenated.length() != 9) {
            return false;
        }

        // Check if the concatenated string contains all digits from 1 to 9 exactly once
        for (char digit = '1'; digit <= '9'; digit++) {
            if (concatenated.indexOf(digit) == -1 || concatenated.lastIndexOf(digit) != concatenated.indexOf(digit)) {
                return false;
            }
        }
        return true;
    }
}

