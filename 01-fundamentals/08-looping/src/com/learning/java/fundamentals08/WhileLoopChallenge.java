package com.learning.java.fundamentals08;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int counterEvenNumber = 0;
        int counterOddNumber = 0;

//        while (number <= finishNumber) {
//            number++;
//            if (!(isEvenNumber(number))) {
//                counterOddNumber++;
//                continue;
//            }
//            System.out.println("EvenNumber = " + number);
//            counterEvenNumber++;
//            if (counterEvenNumber == 5) break;
//        }
//        System.out.println("counterOddNumber = " + counterOddNumber);
//        System.out.println("counterEvenNumber = " + counterEvenNumber);

        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                System.out.println("EvenNumber = " + number);
                counterEvenNumber++;
                if (counterEvenNumber == 5) break;
            } else {
                counterOddNumber++;
            }
            number++;
        }
        System.out.println("counterOddNumber = " + counterOddNumber);
        System.out.println("counterEvenNumber = " + counterEvenNumber);


        // the second while is more predictable, consistent and simpler
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
