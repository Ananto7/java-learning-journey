package com.learning.fundamentals00;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");

        System.out.print("Enter first number: ");
        double number = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // perform all operations

        double sum = number+number2;
        double difference = number-number2;
        double product = number*number2;
        double quotient = number/number2;
        double remainder = number%number2;
        double power = Math.pow(number,number2);
        double sqrt1 = Math.sqrt(number);
        double sqrt2 = Math.sqrt(number2);

        // display result
        System.out.println("Result");
        System.out.println(number + " + " + number2 + " = " + sum);
        System.out.println(number + " - " + number2 + " = " + difference);
        System.out.println(number + " x " + number2 + " = " + product);
        System.out.println(number + " / " + number2 + " = " + quotient);
        System.out.println(number + " % " + number2 + " = " + remainder);
        System.out.println("  " + number2 + " = " + power);
        System.out.println("√" + number + " = " + sqrt1);
        System.out.println("√" + number2 + " = " + sqrt2);

        sc.close();
    }

    public static void temperatureConverter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit: F = C × 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        // Convert to Kelvin: K = C + 273.15
        double kelvin = celsius + 273.15;

        // Display results
        System.out.println("\n=== Temperature Conversions ===");
        System.out.printf("Celsius: %.2f°C%n", celsius);
        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        sc.close();
    }

}
