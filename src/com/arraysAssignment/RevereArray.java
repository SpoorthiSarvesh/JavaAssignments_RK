
//11. Write a Java program to reverse an array of integer values.
package com.arraysAssignment;

public class RevereArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        // Reverse the array using a simple for loop
        System.out.println("Reversed Array:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
