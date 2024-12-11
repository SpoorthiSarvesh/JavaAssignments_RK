//Write a program to print remark according to the grade obtained using switch statement

package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade ");
        char grade = sc.next().charAt(0);
        grade=Character.toUpperCase(grade);
        switch (grade) {
                        case 'A':
                            System.out.println("Excellent!");
                            break;
                        case 'B':
                            System.out.println("Good job!");
                            break;
                        case 'C':
                            System.out.println("You did well.");
                            break;
                        case 'D':
                            System.out.println("You passed.");
                            break;
                        case 'F':
                            System.out.println("Failed. Better luck next time.");
                            break;
                        default:
                            System.out.println("Invalid grade. Please enter a valid grade (A, B, C, D, F).");
                    }


                }
            }



