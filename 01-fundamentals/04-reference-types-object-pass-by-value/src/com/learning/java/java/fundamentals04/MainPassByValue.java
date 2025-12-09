package com.learning.java.java.fundamentals04;

import java.awt.*;

public class MainPassByValue {
    public static void main(String[] args) {
        // pass by value Primitives Types
        System.out.println("=========== Primitives Types ======");
        int age = 21;
        int ageCopy = increment(age);
        System.out.println("age = " + age);
        System.out.println("ageTwo = " + ageCopy);

        System.out.println("=========== References Types ======");
        // pass by value References Types / Objects

        Point pointA = new Point(10, 10);
        Point pointB = pointA;

        pointA.x = 100;

        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
    }

    public static int increment(int age) {
        return ++age;
    }
}
