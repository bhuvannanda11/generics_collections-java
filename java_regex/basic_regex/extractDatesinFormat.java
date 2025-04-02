package java_regex.basic_regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//JUST TO CHECK THE DATE FORMAT AND IT NOT LOGICALLY FORMATTED DATE
public class extractDatesinFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence = ");
        String str = sc.nextLine();
        String regex ="\\b\\d{2}/\\b\\d{2}/\\b\\d{4}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println("Date Found = "+m.group());
        }
    }
}
