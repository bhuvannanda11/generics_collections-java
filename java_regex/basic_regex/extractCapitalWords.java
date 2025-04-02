package java_regex.basic_regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractCapitalWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence = ");
        String str = sc.nextLine();
        String regex ="[A-Z]+[a-z]{1,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println("Capital Letter Found = "+m.group());
        }
    }
}
