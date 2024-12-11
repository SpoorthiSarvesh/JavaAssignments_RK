//1. Write a Java program to sort a numeric array and a string array.
//        Ex: {23,3,5,2,4}  ---> 2,4,5,23
//        {"Rama",Krishna"}  ...>

        package com.arraysAssignment;

import java.util.Arrays;

public class SortNumericArrayAndStringArray {
        public static void main(String[] args) {
                int[] numbers={23,3,5,2,4};
                String[] names={"Rama","Krishna"};
                System.out.println("Before sorting:");
                for(int i=0;i<numbers.length;i++)
                {
                        System.out.print(numbers[i]+ " ");
                }
                System.out.println();
                Arrays.sort(numbers);
                System.out.println("After Sorting: ");
                for(int i=0;i<numbers.length;i++)
                {
                        System.out.print(numbers[i]+" ");
                }
                System.out.println();
                System.out.println("Before sorting String Array:");
                for(int i=0;i<names.length;i++)
                {
                        System.out.print(names[i]+" ");
                }
                System.out.println();
                Arrays.sort(names);
                System.out.println("After Sorting String Array:");
                for(int i=0;i<names.length;i++)
                {
                        System.out.print(names[i]+" ");
                }
                System.out.println();

        }
}
