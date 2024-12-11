package com.spooPractice;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("VOWEL");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
