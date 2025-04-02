package org.example;

public class passwordValidator {
    public static boolean strength(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}
