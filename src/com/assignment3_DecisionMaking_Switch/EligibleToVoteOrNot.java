//Write a program to check whether a person is eligible to vote or Not using switch statement
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class EligibleToVoteOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        int i = 1;
        switch (age>=18? 1: 0){
            case 1:
                System.out.println("Eligible");
                break;
            default:
                System.out.println("Not Eligible");
                break;



        }

    }
}
