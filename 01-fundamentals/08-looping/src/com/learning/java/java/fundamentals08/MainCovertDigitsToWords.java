package com.learning.java.java.fundamentals08;

public class MainCovertDigitsToWords {
    public static void main(String[] args) {
        numberToWords(123);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            System.out.println(
                    switch (reverseNumber % 10) {
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        default -> "Zero";
                    });
            reverseNumber /= 10;
        }
    }

    public static int reverse(int number) {
        StringBuilder forward = new StringBuilder("" + Math.abs(number));
        StringBuilder reverse = forward.reverse();
        int result = Integer.parseInt(reverse.toString());
        return (number < 0) ? result * -1 : result;
    }

    public static int getDigitCount(int number) {
        return (number < 0) ? -1 : ("" + number).length();
    }
}
