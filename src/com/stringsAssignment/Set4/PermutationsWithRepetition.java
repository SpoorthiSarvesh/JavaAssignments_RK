//35. Write a Java program to print all permutations of a given string with repetition.
//
//Sample Output:
//
//The given string is: PQR
//The permuted strings are:
//PPP
//        PPQ
//PPR
//...
//RRP
//        RRQ
//RRR
package com.stringsAssignment.Set4;

public class PermutationsWithRepetition {

    public static void main(String[] args) {
        String input = "PQR";
        System.out.println("The given string is: " + input);

        System.out.println("The permutations with repetition are:");
        printPermutations(input, "");
    }

    // Recursive method to generate permutations with repetition
    public static void printPermutations(String str, String prefix) {
        // Base case: when the prefix length equals the original string length
        if (prefix.length() == str.length()) {
            System.out.println(prefix);
            return;
        }

        // Recursive step: Add each character in the string to the prefix
        for (int i = 0; i < str.length(); i++) {
            printPermutations(str, prefix + str.charAt(i));
        }
    }
}

