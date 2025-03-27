package exception_handling;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        try{
            int x = array[index];
            System.out.println("Value of index " + index + ": " + x);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
}
