package java_regex.basic_regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateHexColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex color code");
        String regex = "^#[0-9A-Fa-f]{6}$";
        String s = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
