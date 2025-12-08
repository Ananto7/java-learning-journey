package com.learning.java.fundamentals07;

public class Main {
    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        // switch old version
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, 4, 5");
                break;
            default:
                System.out.println("Value is not 1 or 2");
        }

        // switch new version
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Was a 3, 4, 5");
            default -> System.out.println("Value is not 1 or 2");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter."  );
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

}
