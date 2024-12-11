package com.mock;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("number before swapped num1: "+ num1);
        System.out.println("number before swapped num2: "+ num2);
        System.out.println("----------------------------------");
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("number after swapped num1: "+ num1);
        System.out.println("number after swapped num2: "+ num2);

    }
}
