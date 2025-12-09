package com.learning.java.java.fundamentals04;

import java.awt.*;

public class MainReferences {
    public static void main(String[] args) {
        // Reference Types / Object
        int age = 21;
        Point pointA = new Point(10, 10);
        System.out.println("pointA = " + pointA);
        pointA.move(10, 11);
        System.out.println("pointA = " + pointA);
    }
}
