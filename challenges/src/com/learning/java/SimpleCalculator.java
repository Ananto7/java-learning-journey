package com.learning.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double memory = 0.0;
        boolean hasMemory = false;
        ArrayList<String> history = new ArrayList<>();

        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: +, -, *, /, sqrt, pow");
        System.out.println("Memory: M+ (add), MR (recall), MC (clear)");
        System.out.println("HistoryA: H (show history), C (clear history)");
        System.out.println("Enter 'quit' to exit");
        System.out.println("=========================");

        while (true) {
            try {
                System.out.print("Enter first number: ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Thank you for using the calculator!");
                    break;
                } else if (input.equalsIgnoreCase("MR")) {
                    if (hasMemory) {
                        System.out.println("Memory: " + memory);
                    } else {
                        System.out.println("Memory is empty!");
                    }
                    continue;
                } else if (input.equalsIgnoreCase("MC")) {
                    memory = 0.0;
                    hasMemory = false;
                    System.out.println("Memory cleared!");
                } else if (input.equalsIgnoreCase("H")) {
                    System.out.println("=== Calculation History ===");
                    if (history.isEmpty()) {
                        System.out.println("No history found!");
                    } else {
                        for (int i = Math.max(0, history.size() - 5); i < history.size(); i++) {
                            System.out.println(history.get(i));
                        }
                    }
                    System.out.println("=========================");
                    continue;
                }

                double num1 = Double.parseDouble(input);

                System.out.print("Enter operation: ");
                String operation = sc.nextLine();

                double num2 = 0.0;
                if (!operation.equalsIgnoreCase("sqrt")) {
                    System.out.print("Enter second number:");
                    num2 = Double.parseDouble(sc.nextLine());
                }

                double result = 0.0;
                boolean validOperation = true;
                String calculation = "";

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        calculation = String.format("%.2f + %.2f = %.2f", num1, num2, result);
                        break;
                    case "-":
                        result = num1 - num2;
                        calculation = String.format("%.2f - %.2f = %.2f", num1, num2, result);
                        break;
                    case "*":
                        result = num1 * num2;
                        calculation = String.format("%.2f * %.2f = %.2f", num1, num2, result);
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                            calculation = String.format("%.2f / %.2f = %.2f", num1, num2, result);
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                            validOperation = false;
                        }
                        break;
                    case "sqrt":
                        if (num1 >= 0) {
                            result = Math.sqrt(num1);
                            calculation = String.format("√%.2f = %.2f%n", num1, result);
                        } else {
                            System.out.println("Error: Cannot calculate square root of negative number!");
                            validOperation = false;
                        }
                        break;
                    case "pow":
                        result = Math.pow(num1, num2);
                        calculation = String.format("%.2f ^ %.2f = %.2f%n", num1, num2, result);
                        break;
                    default:
                        System.out.println("Error: Invalid operation!");
                        validOperation = false;
                }

                if (validOperation) {
                    System.out.println("Result: " + calculation);
                    history.add(calculation);

                    System.out.print("Add to memory? (M+ or Enter to skip):");
                    String memoryInput = sc.nextLine();
                    if (memoryInput.equalsIgnoreCase("M+")) {
                        memory += result;
                        hasMemory = true;
                        System.out.println("Added to memory. Current memory: " + memory);
                    }
                }

                System.out.println("------------------------");

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
                System.out.println("------------------------");
            }
        }

        sc.close();
    }
}
