package java_regex.advance_regex;

import java.util.Scanner;
public class validateIP {
    public static boolean isValidIP(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ip.matches(regex);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the IP Address = ");
            String ip = sc.next();
            System.out.println(isValidIP(ip) ? "Valid IP" : "Invalid IP");
    }
}


