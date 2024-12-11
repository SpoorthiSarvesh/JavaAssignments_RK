
//15. Write a Java program to print current date and time in the specified format.
//
//Sample Output:
//
//Current Date and Time :
//June 19, 2017
//        3:13 pm
//N.B. : The current date and time will change according to your system date and time.
package com.stringsAssignment.Set2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        // Create a Date object to get the current date and time
        Date now = new Date();

        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time and print it
        String formattedDate = dateFormat.format(now);
        System.out.println("Current date and time: " + formattedDate);
    }
}
