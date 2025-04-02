package java_regex.advance_regex;

import java.util.Scanner;

public class validateCreditCardNumber {

        public static boolean isValidCreditCard(String card) {
            return card.matches("^4\\d{15}$") || card.matches("^5[1-5]\\d{14}$");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Credit Card Number = ");
            String card = sc.next();
            System.out.println(isValidCreditCard(card) ? "Valid Card" : "Invalid Card");
        }
    }

