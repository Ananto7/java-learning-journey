package com.learning.java.fundamentals07;

public class SwitchChallenge {
    public static void main(String[] args) {
        char charaNato = 'E';
        switch (charaNato) {
            case 'A':
                System.out.println("Able");
            case 'B':
                System.out.println("Baker");
            case 'C':
                System.out.println("Charlie");
            case 'D':
                System.out.println("Dog");
            case 'E':
                System.out.println("Easy");
                break;
//            case 'F':
//                "Fox";
//                break;
//            case 'G':
//                "George";
//                break;
//            case 'H':
//                "How";
//                break;
//            case 'I':
//                "Item";
//                break;
//            case 'J':
//                "Jig";
//                break;
//            case 'K':
//                "King";
//                break;
//            case 'L':
//                "Love";
//                break;
//            case 'M':
//                "Mike";
//                break;
//            case 'N':
//                "Nan";
//                break;
//            case 'O':
//                "Oboe";
//                break;
//            case 'P':
//                "Peter";
//                break;
//            case 'Q':
//                "Queen";
//                break;
//            case 'R':
//                "Roger";
//                break;
//            case 'S':
//                "Sugar";
//                break;
//            case 'T':
//                "Tare";
//                break;
//            case 'U':
//                "Uncle";
//                break;
//            case 'V':
//                "Victor";
//                break;
//            case 'W':
//                "William";
//                break;
//            case 'X':
//                "X-ray";
//                break;
//            case 'Y':
//                "Yoke";
//                break;
//            case 'Z':
//                "Zebra";
//                break;
            default:
                System.out.println("No Found!");
        }
        ;
    }

    public static String replacementNatoAlpha(char natoChar) {
        return switch (natoChar) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            case 'F' -> "Fox";
            case 'G' -> "George";
            case 'H' -> "How";
            case 'I' -> "Item";
            case 'J' -> "Jig";
            case 'K' -> "King";
            case 'L' -> "Love";
            case 'M' -> "Mike";
            case 'N' -> "Nan";
            case 'O' -> "Oboe";
            case 'P' -> "Peter";
            case 'Q' -> "Queen";
            case 'R' -> "Roger";
            case 'S' -> "Sugar";
            case 'T' -> "Tare";
            case 'U' -> "Uncle";
            case 'V' -> "Victor";
            case 'W' -> "William";
            case 'X' -> "X-ray";
            case 'Y' -> "Yoke";
            case 'Z' -> "Zebra";
            default -> "No Found!";
        };
    }
}
