package com.learning.java.java.fundamentals08;

public class MainLargestPrimeChallenge {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;

        // cari faktor dari 2 sampai number
        for (int i = 2; i <= number; i++) {

            // cek apakah i adalah faktor
            if (number % i == 0) {

                // CEK PRIMA → dilakukan langsung di sini
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // jika i adalah prima → simpan sebagai kandidat largest
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }

}
