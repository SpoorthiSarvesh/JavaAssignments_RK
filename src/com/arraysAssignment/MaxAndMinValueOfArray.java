//10. Write a Java program to find the maximum and minimum value of an array
package com.arraysAssignment;

import java.util.Arrays;

public class MaxAndMinValueOfArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 5, 40, 15};
        // Initialize max and min with the first element of the array
//        int max = num[0];
//        int min = num[0];
//        // Loop through the array to find the max and min values
//        for (int i = 1; i < num.length; i++) {
//            if (num[i] > max) {
//                max = num[i];  // Update max if a larger value is found
//            }
//            if (num[i] < min) {
//                min = num[i];  // Update min if a smaller value is found
//            }
//        }
//        // Print the results
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]+ " ");
        }
        int max=num[num.length-1];
        int min=num[0];
        System.out.println(max);
        System.out.println(min);
    }
}
