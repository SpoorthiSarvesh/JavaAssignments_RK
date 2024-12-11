//4. Write a Java program to calculate the average value of array elements.
        package com.arraysAssignment;

public class AverageValueOfArrayElements {
        public static void main(String[] args) {
                int[] num={6,4};
                int sum=0;

                for(int i=0;i<num.length;i++)
                {
                        sum=sum+num[i];
                }
                double average= (double) sum /num.length;
                System.out.println(average);
        }
}
