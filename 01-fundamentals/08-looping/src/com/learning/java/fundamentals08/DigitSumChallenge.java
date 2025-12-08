package com.learning.java.fundamentals08;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Result : " + 1234 / 10);
        System.out.println("Sum = " + sumDigits(1234));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;

        if (number == 0) return 0;

        int digit = 0;
        while (number > 0) {
             digit += number % 10;
             number /= 10;
        }
        return digit;
    }
}
