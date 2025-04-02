package java_regex.basic_regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter License Plate Number to Validate = ");
        String s = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
