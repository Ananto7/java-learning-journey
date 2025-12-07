package com.learning.challenge;

import java.util.Scanner;

public class DiagonalStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        printSquareStar(star);
    }

    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Input Star");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1) || (i == n) || (j == 1) || (j == n) || (i == j) || (i + j == n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
