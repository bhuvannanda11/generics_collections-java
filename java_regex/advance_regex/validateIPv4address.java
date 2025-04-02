package java_regex.advance_regex;

import java.util.Scanner;

public class validateIPv4address {
    public static boolean validIP(String ipv4) {
        return ipv4.matches("^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP address = ");
        String ipv4 = sc.nextLine();

        if(validIP(ipv4)){
            System.out.println("Valid IP");
        }else{
            System.out.println("Invalid IP");
        }
    }
}
