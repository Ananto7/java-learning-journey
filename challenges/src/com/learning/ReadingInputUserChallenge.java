package com.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingInputUserChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while (count <= 5) {
            System.out.print("Enter Number #" + count + ": ");
            try {
                sum += sc.nextInt();
            } catch (InputMismatchException badUserInput) {
                System.out.println("Invalid Number!. Try again.");
                sc.nextLine();
                continue;
            }
            count++;
        }
        System.out.println("Sum = " + sum);
    }
}
