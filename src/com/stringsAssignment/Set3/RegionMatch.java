//23. Write a Java program to find whether a region in the current string matches a region in another string.
//
//Sample Output:
//
//str1[0 - 7] == str2[28 - 35]? true
//str1[9 - 15] == str2[9 - 15]? false
        package com.stringsAssignment.Set3;

public class RegionMatch {
    public static void main(String[] args) {
        // Sample strings for comparison
        String str1 = "abcdefg";
        String str2 = "xyzabcdefg";

        // Check if regions in the strings match
        boolean match1 = str1.regionMatches(0, str2, 3, 4);  // str1[0-3] == str2[3-6]
        boolean match2 = str1.regionMatches(2, str2, 5, 3);  // str1[2-4] == str2[5-7]

        // Output the results
        System.out.println("str1[0 - 3] == str2[3 - 6]? " + match1);
        System.out.println("str1[2 - 4] == str2[5 - 7]? " + match2);
    }
}
