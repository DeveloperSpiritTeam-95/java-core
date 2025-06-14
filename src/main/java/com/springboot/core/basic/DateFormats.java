package com.springboot.core.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author prabhakar, @Date 15-05-2025
 */

public class DateFormats {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDate);
        // Different date formats
        System.out.println("Different Date Formats:");
        System.out.println("1. YYYY-MM-DD: " + currentDate.format(DateTimeFormatter.ofPattern("EEEE,yyyy-MM-dd")));
        System.out.println("2. DD-MM-YYYY: " + currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("3. MM/DD/YYYY: " + currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println("4. Full Month Name DD, YYYY: " + currentDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")));
        System.out.println("5. Short Month Name DD, YYYY: " + currentDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));

        System.out.println();
        System.out.println(currentDateTime);
        // Different date-time formats
        System.out.println("Different Date-Time Formats:");
        System.out.println("1. YYYY-MM-DD HH:MM:SS: " + currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("2. DD-MM-YYYY HH:MM AM/PM: " + currentDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a")));
        System.out.println("3. MM/DD/YYYY HH:MM:SS AM/PM: " + currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a")));
        System.out.println("4. Day, Month DD, YYYY HH:MM:SS: " + currentDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss")));
        System.out.println("5. Short Day, Short Month DD, YYYY HH:MM: " + currentDateTime.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm")));
    }
}
