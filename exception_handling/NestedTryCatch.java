package exception_handling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int divisor = scanner.nextInt();
        int index = scanner.nextInt();
        try{
            int dividend = array[index];
            try {
                int result = dividend/divisor;
                System.out.println(result);
            }
            catch (ArithmeticException e){
                System.out.println("cannot divide by zero");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
    }
}
