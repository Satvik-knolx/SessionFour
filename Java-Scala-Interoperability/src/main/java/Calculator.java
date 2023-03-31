package com.knoldus;

public class Calculator {
    public int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public int subtract(int valueOne, int valueTwo) {
        return valueOne - valueTwo;
    }

    public int multiply(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }

    public int divide(int valueOne, int valueTwo) {
        int result = 0;
        try {
            result = valueOne / valueTwo; // Attempt division
        } catch (ArithmeticException e) { // Handle ArithmeticException
            System.out.println("Cannot divide value by zero");
        }
        return result; // Return result or 0 if exception was caught
    }
}
