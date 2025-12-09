package com.learning.java.java.fundamentals08;

public class WhileLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        int j = 1;
        boolean isReady = false;
        while (isReady) {
            if (j > 5) {
                break;
            }
            System.out.println("j = " + j);
            j++;
        }

        do {
            if (j > 5) {
                break;
            }
            System.out.println("j = " + j);
            j++;
            isReady = (j > 5);
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number = number + 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println("number = " + number);
        }
    }
}
