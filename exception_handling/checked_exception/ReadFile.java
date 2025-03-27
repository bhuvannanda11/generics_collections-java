package exception_handling.checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
        String filePath = "D:\\bridgelabz-workspace\\java-collections-streams\\src\\exception_handling\\checked_exception\\data.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
