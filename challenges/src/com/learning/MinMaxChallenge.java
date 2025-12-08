package com.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean isFirst = true;

        while (true) {
            System.out.print("Enter Number: ");
            try {
                int input = sc.nextInt();

                if (isFirst) {
                    min = input;
                    max = input;
                    isFirst = false;
                }

                if (input < min) min = input;
                if (input > max) max = input;

            } catch (InputMismatchException e) {
                System.out.println("Non Number. Exit Loop.");
                break;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
