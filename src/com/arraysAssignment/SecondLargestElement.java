//Write a Java program to find the second largest element in an array.
package com.arraysAssignment;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers={10,4,7,89,34};
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
        int secondLargest=numbers[numbers.length-2];
        System.out.println("Second Largest number is "+ secondLargest);
    }
}

