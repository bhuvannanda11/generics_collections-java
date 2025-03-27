package exception_handling;

import java.util.Scanner;

public class ThrowVsThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextInt();
        double rate = scanner.nextInt();
        int years = scanner.nextInt();
        try {
            double interest = simpleInterest(amount, rate, years);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static double simpleInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        else{
            return amount*rate*years;
        }
    }
}
