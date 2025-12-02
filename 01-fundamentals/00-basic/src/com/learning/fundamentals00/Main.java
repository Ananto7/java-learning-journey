package com.learning.fundamentals00;

public class Main {
    public static void main(String[] args) {
        // floating point challenge

        // 1 pound is equal to 0.45359237 of a kilogram
        int numberOfPound = 2;
        double resultOfKilogram = (double) numberOfPound * 0.45359237;
        System.out.println("The kilogram is " + resultOfKilogram);

        // char challenge

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;

        System.out.println("My values are " + mySimpleChar + " and " + myUnicodeChar + " and " + myDecimalChar);

        // ternary operator

        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen" ? false : true;

        // precedence operator challenge

        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double myFirstResult = (myFirstDouble + mySecondDouble) * 100.00;
        double mySecondResult = myFirstResult % 40.00;
        boolean myFirstBoolean =  mySecondResult == 0.00 ? true : false;
        System.out.println("Result My First Boolean " + myFirstBoolean);

        if (!myFirstBoolean) {
            System.out.println("got some remainder");
        }

        // Increment & Decrement

        int number = 0;
        System.out.println(number++); // post increment -> ketika code dijalankan hasil tetap 0 karna belum di tambah hasil nya 0.
        System.out.println("Hasil Post Increment " + number);
        int numberTwo = 0;
        System.out.println(++numberTwo); // pre increment -> ketika code belum dijalankan akan ditambah terlebih dahulu baru di jalankan hasil nya 1.
        System.out.println("Hasil Pre Increment " + numberTwo);

        // Comparison Operator

        // < <= > >= == !=
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

        // Strings

        String firstString = "learning";
        String secondString = "code";
        String thirdString = firstString + secondString; // Concat -> menggabungkan 2 variable string jika tipe data int dan literal string di concat akan menjadi String.
        System.out.println(thirdString.toUpperCase()); // method uppercase digunakan untuk membuat kalimat menjadi besar semua.
        System.out.println(thirdString.toLowerCase()); // method lowercase digunakan untuk membuat kalimat menjadi kecil semua.
        System.out.println(thirdString.substring(0, 8)); // untuk memotong kalimat berdasarkan index dimulai dari 0.
        System.out.println(" ".isEmpty()); // untuk menentukan hasil berupa boolean jika kalimat kosong atau tidak.
        System.out.println(" ".isBlank()); // untuk menentukan hasil berupa boolean jika kalimat kosong atau tidak.
        System.out.println(" a ".trim()); // untuk menghapus spasi dalam kalimat.

    }
}
