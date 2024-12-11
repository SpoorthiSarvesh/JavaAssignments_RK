//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant
package com.assignment3_DecisionMaking_Switch;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        String input= sc.nextLine();
        if(input.length()==1 && Character.isLetter(input.charAt(0)))
        {
        char ch=Character.toLowerCase(input.charAt(0));
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Input letter is Vowel.");
                    break;
                default:
                    System.out.println("Input letter is Consonant.");
                    break;
            }
        } else {
            System.out.println("Error: Please enter a single alphabet character.");
        }


    }
}
