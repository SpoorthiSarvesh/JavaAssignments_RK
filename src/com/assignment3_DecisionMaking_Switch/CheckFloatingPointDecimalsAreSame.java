//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class CheckFloatingPointDecimalsAreSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Floating point Number");
        float num1= sc.nextFloat();
        System.out.println("Enter 2nd Floating point Number");
        float num2= sc.nextFloat();
        num1=num1*1000;
        num2=num2*1000;
        if(num1==num2)
        {
            System.out.println("They Are Same");
        }
        else {
            System.out.println("They Are Different");
        }
    }
}
