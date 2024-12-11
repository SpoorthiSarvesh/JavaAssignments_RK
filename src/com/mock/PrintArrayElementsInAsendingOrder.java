package com.mock;

import java.util.Arrays;

public class PrintArrayElementsInAsendingOrder {
    public static void main(String[] args) {
        int[] num={5,8,9,1,9,2};
        System.out.println("Intial Elements of an array");
        System.out.println("---------------------------");
        for(int i=0;i< num.length;i++)
        {
            System.out.print(num[i]+ "   ");
        }
        Arrays.sort(num);
        System.out.println();
        System.out.println("Ascending order of array elements");
        System.out.println("------------------------");
        for(int i=0;i< num.length;i++)
        {
            System.out.print(num[i]+"   ");
        }
    }
}
