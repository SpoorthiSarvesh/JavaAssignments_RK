
//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class PrintGreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3=sc.nextInt();
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("Num1 is greater");
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("Num2 is greater");

        }
        else {
            System.out.println("Num3 is greater");
        }
    }
}
