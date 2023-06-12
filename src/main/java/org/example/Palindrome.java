package org.example;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.trim();

        if (word.isEmpty()) {
            return false;
        }

        word = word.toLowerCase().replaceAll("\\s+", "");

        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }
}

