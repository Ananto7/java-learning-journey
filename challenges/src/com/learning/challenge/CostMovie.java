package com.learning.challenge;

import java.util.Scanner;

public class CostMovie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Movie Ticket Calculator ===");
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Age can't be negative");
            input.close();
            return;
        }

        System.out.print("Enter Movie Time (morning/afternoon/evening): ");
        input.nextLine();
        String time = input.next().toLowerCase().trim();

        if (!time.equals("morning") && !time.equals("afternoon") && !time.equals("evening")) {
            System.out.println("Invalid Time");
            input.close();
            return;
        }

        double basePrice = getBasePrice(age);

        System.out.printf("Base price: $%.2f\n", basePrice);
        if (time.equals("morning")) {
            System.out.printf("Morning discount: $%.2f\n", getDiscount(basePrice));
        }  else if (time.equals("evening")) {
            System.out.printf("Evening surcharge: $%.2f\n", getSurcharge(basePrice));
        }
        System.out.printf("Final Price: $%.2f\n", calculateFinalPrice(basePrice, time));

        input.close();
    }

    public static double getBasePrice(int age) {
        if (age < 12) return 5.00;
        if (age <= 64) return 10.00;
        return 7.00;
    }

    public static double getDiscount(double basePrice) {
        return basePrice * 0.2;
    }

    public static double getSurcharge(double basePrice) {
        return basePrice * 0.1;
    }

    public static double calculateFinalPrice(double basePrice, String time) {
        if (time.equals("morning")) return basePrice - (basePrice * 0.2);
        if (time.equals("evening")) return basePrice + (basePrice * 0.1);
        return basePrice;
    }
}
