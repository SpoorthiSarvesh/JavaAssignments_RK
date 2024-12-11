//
//19. Write a Java program to get the index of all the characters of the alphabet.
//
//Sample Output:
//
//a  b c  d e  f  g h i  j
//=========================
//        36 10 7 40 2 16 42 1 6 20
//
//k  l  m  n  o  p q  r  s  t
//===========================
//        8 35 22 14 12 23 4 11 24 31
//
//u  v  w  x  y  z
//================
//        5 27 13 18 38 37
//Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
package com.stringsAssignment.Set2;

public class AlphabetIndex {
    public static void main(String[] args) {
        // Loop through the lowercase alphabet characters
        for (char c = 'a'; c <= 'z'; c++) {
            // Calculate the index based on ASCII values
            int index = c - 'a';
            // Print the character and its index
            System.out.println("The index of " + c + " is " + index);
        }
    }
}
