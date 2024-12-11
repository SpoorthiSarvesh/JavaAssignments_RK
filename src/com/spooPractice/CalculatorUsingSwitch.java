//Simple Calculator Using switch Statement
package com.spooPractice;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);
        double result;
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");
        }
        }

    }

