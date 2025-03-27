package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int result = a/b;
            System.out.println("result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("An error occurred while trying to divide " + e.getMessage());
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
}
