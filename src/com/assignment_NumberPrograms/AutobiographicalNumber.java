package com.assignment_NumberPrograms;

import java.util.Scanner;

public class AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutobiographicalNumber(number)) {
            System.out.println(number + " is an Autobiographical Number.");
        } else {
            System.out.println(number + " is not an Autobiographical Number.");
        }
    }

    public static boolean isAutobiographicalNumber(int number) {
        String numStr = String.valueOf(number);
        int length = numStr.length();

        // Create an array to count the frequency of digits
        int[] count = new int[10];

        // Count the frequency of each digit
        for (int i = 0; i < length; i++) {
            count[numStr.charAt(i) - '0']++;
        }

        // Check if the number is autobiographical
        for (int i = 0; i < length; i++) {
            if (count[i] != numStr.charAt(i) - '0') {
                return false;
            }
        }

        return true;
    }
}
