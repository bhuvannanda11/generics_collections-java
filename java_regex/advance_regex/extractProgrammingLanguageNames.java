package java_regex.advance_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractProgrammingLanguageNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text = ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
