package org.example;

public class stringUtility {
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
