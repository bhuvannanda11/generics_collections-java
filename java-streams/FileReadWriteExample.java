import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // Path to the source file
        String destinationFilePath = "destination.txt"; // Path to the destination file

        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourceFilePath);
            return; // Exit the program if the source file does not exist
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            // Read data from the source file and write to the destination file
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath);

        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
