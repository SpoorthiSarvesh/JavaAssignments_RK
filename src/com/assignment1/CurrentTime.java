//5. Write a Java program that prints the current time in GMT.
//Test Data
//Input the time zone offset to GMT: 256
//Expected Output:
//Current time is 23:40:24
package com.assignment1;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT:");
        int offsetTime=sc.nextInt();
        ZonedDateTime currentTime=ZonedDateTime.now(ZoneOffset.UTC).plusMinutes(offsetTime);
        System.out.println(currentTime.toLocalTime());


    }
}
