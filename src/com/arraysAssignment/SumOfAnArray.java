//2. Write a Java program to sum values of an array.
        package com.arraysAssignment;

public class SumOfAnArray {
        public static void main(String[] args) {
                int[] num={2,7,8,9};
                int sum=0;
                for(int i=0;i<num.length;i++)
                {
                        sum=sum+num[i];
                }
                System.out.println("sum values of an array : "+ sum);
        }
}
