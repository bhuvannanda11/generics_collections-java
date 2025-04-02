package java_regex.basic_regex;

import java.util.Scanner;

public class censorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence = ");
        String input = sc.nextLine();
        System.out.println("Enter the number of bad words = ");
        int n = sc.nextInt();
        String[] badWords = new String[n];
        System.out.println("Enter the bad words = ");
        for(int i=0;i<n;i++){
            badWords[i] = sc.next();
        }


        for (String word : badWords) {
            input = input.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println("");
        System.out.println(input);
    }
}
