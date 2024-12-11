//Check if a Number is Positive, Negative, or Zero
package com.spooPractice;

import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }

    }
}
