import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyComparison {
    private static final int BUFFER_SIZE = 4096; // 4 KB buffer size

    public static void main(String[] args) {
        String sourceFilePath = "largefile.txt"; // Replace with your large file path
        String unbufferedDestinationPath = "unbuffered_copy.txt";
        String bufferedDestinationPath = "buffered_copy.txt";

        // Copy using unbuffered streams
        long unbufferedTime = copyFileUnbuffered(sourceFilePath, unbufferedDestinationPath);
        System.out.println("Unbuffered copy time: " + unbufferedTime + " nanoseconds");

        // Copy using buffered streams
        long bufferedTime = copyFileBuffered(sourceFilePath, bufferedDestinationPath);
        System.out.println("Buffered copy time: " + bufferedTime + " nanoseconds");
    }

    private static long copyFileUnbuffered(String sourceFilePath, String destinationPath) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error during unbuffered file copy: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    private static long copyFileBuffered(String sourceFilePath, String destinationPath) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error during buffered file copy: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}
