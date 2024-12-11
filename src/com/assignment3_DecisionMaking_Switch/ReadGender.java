//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class ReadGender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Gender");
        char gender=sc.next().charAt(0);
        gender=Character.toUpperCase(gender);
        String genderName;
        switch (gender){
            case 'M':
                genderName="Male";
                break;
                case 'F':
                    genderName="FeMale";
                    break;
            default:
                System.out.println("Enter Proper Input");
                return;


        }
        System.out.println(genderName);
    }
}
