package exception_handling.custom_exception;

import java.util.Scanner;


public class AgeValidator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            validateAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else System.out.println("Access Granted");
    }
}
