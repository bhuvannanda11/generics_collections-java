import java.io.*;

public class UpperToLowerConverter {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";  // Replace with the actual input file path
        String outputFilePath = "output.txt"; // Output file

        try {
            convertToLowercase(inputFilePath, outputFilePath);
            System.out.println("Conversion completed! Check " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Reads from input file, converts to lowercase, and writes to output file
    private static void convertToLowercase(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert line to lowercase
                writer.newLine(); // Maintain original line breaks
            }
        }
    }
}
