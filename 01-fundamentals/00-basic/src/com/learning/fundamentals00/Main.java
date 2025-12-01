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
    }
}
