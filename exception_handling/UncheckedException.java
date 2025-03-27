package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a/b;
            System.out.println("result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("An error occurred while trying to divide " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("An error occurred while trying to divide by " + e.getMessage());
        }
    }
}
