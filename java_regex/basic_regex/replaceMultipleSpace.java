package java_regex.basic_regex;

import java.util.Scanner;

public class replaceMultipleSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence = ");
        String input = sc.nextLine();


        String output = input.replaceAll("\\s+", " ");


        System.out.println("Original sentence = " + input);
        System.out.println("Processed Sentence =  " + output);
    }
}
