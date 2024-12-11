//21. Write a Java program to get the last index of a string within a string.
//
//Sample Output:
//
//a  b c  d  e  f  g  h i  j
//===========================
//        36 10 7 40 33 16 42 32 6 20
//
//k  l  m  n  o  p q  r  s  t
//===========================
//        8 35 22 14 41 23 4 29 24 31
//
//u  v  w  x  y  z
//=================
//        21 27 13 18 38 37
//Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
package com.stringsAssignment.Set3;

public class LastIndexOfLetters {
    public static void main(String[] args) {
        // Sample string containing all the letters of the alphabet
        String inputString = "The quick brown fox jumps over the lazy dog.";

        // Print headers for the output
        System.out.println("a  b c  d  e  f  g  h i  j");
        System.out.println("===========================");

        // Loop through letters 'a' to 'j' and find their last index in the string
        for (char c = 'a'; c <= 'j'; c++) {
            // Print the last index of each character (convert char to string for indexOf method)
            System.out.print(inputString.lastIndexOf(c) + " ");
        }

        // Print the second row of headers and the output for the next letters
        System.out.println();
        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");

        for (char c = 'k'; c <= 't'; c++) {
            // Print the last index of each character (convert char to string for indexOf method)
            System.out.print(inputString.lastIndexOf(c) + " ");
        }

        // Print the third row of headers and the output for the next letters
        System.out.println();
        System.out.println("u  v  w  x  y  z");
        System.out.println("=================");

        for (char c = 'u'; c <= 'z'; c++) {
            // Print the last index of each character (convert char to string for indexOf method)
            System.out.print(inputString.lastIndexOf(c) + " ");
        }
    }
}
