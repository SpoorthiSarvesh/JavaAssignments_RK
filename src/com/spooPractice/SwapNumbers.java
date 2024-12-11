package com.spooPractice;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number");
        int num2= sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The Numbers after getting swapped: "+ num1+" "+ num2);
    }
}
