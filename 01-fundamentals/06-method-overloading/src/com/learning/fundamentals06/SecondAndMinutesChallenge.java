package com.learning.fundamentals06;

public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(0, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0 ) {
            return "your input (" + seconds + ") cannot input less than 1s";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int remainingSeconds) {
        if (minutes <= 0) {
            return "you cannot input minute less than 1";
        }

        if (remainingSeconds <= 0 || remainingSeconds > 59) {
            return "you cannot input seconds less than 1 or more than 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + " hours " + remainingMinutes + " minutes and " + remainingSeconds + " seconds";
    }
}
