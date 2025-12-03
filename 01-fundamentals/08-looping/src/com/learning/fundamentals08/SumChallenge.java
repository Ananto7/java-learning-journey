package com.learning.fundamentals08;

public class SumChallenge {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if  ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                counter++;
                if (counter == 5) break;
            }
        }
        System.out.println("Sum of numbers is " + sum);
    }
}
