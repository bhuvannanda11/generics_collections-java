import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt user for input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = reader.readLine();

            // Save the information to a file
            saveToFile(name, age, favoriteLanguage);

            System.out.println("Information saved successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }

    private static void saveToFile(String name, String age, String favoriteLanguage) {
        String filePath = "user_info.txt"; // File where information will be saved

        try (FileWriter writer = new FileWriter(filePath, true)) { // Append mode
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");
            writer.write("-------------------------------------\n"); // Separator for multiple entries
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file: " + e.getMessage());
        }
    }
}
