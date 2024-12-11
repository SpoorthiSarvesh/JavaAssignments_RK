//Write a Java program to display n terms of natural numbers and their sum.
//Test Data
//Input the number: 2
//Expected Output :
//Input number:
//        2
//The first n natural numbers are :
//        2
//        1
//        2
//The Sum of Natural Number upto n terms :
//        23
package com.assignment4_ForLoop;

import java.util.Scanner;

public class NaturalNumbersAndTheirSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Number");
        int num=sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        //sum+=i;
        System.out.println("The Sum of "+ num +"natural numbers is "+sum);
    }
}
