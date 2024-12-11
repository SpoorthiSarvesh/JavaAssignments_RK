//8) Keith Number in Java
package com.assignment_NumberPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isKeithNumber(number)) {
            System.out.println(number + " is a Keith Number.");
        } else {
            System.out.println(number + " is not a Keith Number.");
        }
    }

    public static boolean isKeithNumber(int number) {
        // Convert number to digits and store in a list
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = number;
        while (temp > 0) {
            digits.add(0, temp % 10); // Extract digits from the right
            temp /= 10;
        }

        // Initialize the sequence with the digits
        ArrayList<Integer> sequence = new ArrayList<>(digits);

        // Generate the sequence until it exceeds or equals the number
        while (true) {
            int nextTerm = 0;

            // Calculate the next term as the sum of the last n terms
            for (int i = sequence.size() - digits.size(); i < sequence.size(); i++) {
                nextTerm += sequence.get(i);
            }

            if (nextTerm == number) {
                return true; // Keith Number
            } else if (nextTerm > number) {
                return false; // Exceeded the number
            }

            // Add the next term to the sequence
            sequence.add(nextTerm);
        }
    }
}
