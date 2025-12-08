package com.learning.java.fundamentals00;

import java.util.Scanner;

public class StringChallenge {
    public static void main(String[] args) {
        System.out.println("=== Phone Number Formatter ===");
        // Create Scanner
        Scanner scan = new Scanner(System.in);
        // Prompt and read input line
        System.out.print("Enter phone number: ");
        String phoneNumber = scan.nextLine();
        // Remove non-digit characters using regex
        String digits = phoneNumber.replaceAll("\\D", "");

        if (digits.length() != 10) {
            System.out.println("Invalid phone number");
            return;
        }

        String part1 = digits.substring(0, 3);
        String part2 = digits.substring(3, 6);
        String part3 = digits.substring(6);

        String formatted = "(" + part1 + ") " + part2 + "-" + part3;
        System.out.println(formatted);
    }
}
