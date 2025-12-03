package com.learning.fundamentals08;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
//        boolean isResult = isPrime(3);
//        System.out.println("isResult = " + isResult);

        int count = 0;
        for (int i = 800; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 3) break;
            }
        }
        System.out.println("count = " + count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
//        System.out.println("Prime number: " + Math.sqrt(number));
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
//                System.out.println("Not prime: " + i);
                return false;
            }
        }
        System.out.println("Prime number: " + number);
        return true;
    }
}
