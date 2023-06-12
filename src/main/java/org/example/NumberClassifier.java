package org.example;

public class NumberClassifier {
    public static String classifyNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

