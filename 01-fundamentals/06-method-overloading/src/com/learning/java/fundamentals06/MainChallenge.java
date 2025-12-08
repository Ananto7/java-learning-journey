package com.learning.java.fundamentals06;

public class MainChallenge {
    public static void main(String[] args) {
        System.out.println("Person A height : " + convertToCentimeters(68) + " cm");
        System.out.println("Person B height : " + convertToCentimeters(5, 8) + " cm");
    }

    public static double convertToCentimeters(int inches){
        return (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches){
        // return convertToCentimeters((feet * 12) + inches); -> simple but hard to read
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);

        // why this approaching because it's more readable for someone read in future
    }
}
