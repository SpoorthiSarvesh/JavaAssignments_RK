//18. Write a Java program to find the second smallest element in an array.
package com.arraysAssignment;

import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] numbers={3,67,8,1,5,9};
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
        int secondSmallest=numbers[1];
        System.out.println(secondSmallest);
    }
}
