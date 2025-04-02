package java_regex.basic_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username = ");
        String s= sc.nextLine();
        String regex ="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            System.out.println(s+" is Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
