package com.learning.java.java.fundamentals08;

public class MainPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (original != 0) {
            reverse = (reverse * 10) + (original % 10);
            original /= 10;
        }

        return reverse == number;
    }

}
