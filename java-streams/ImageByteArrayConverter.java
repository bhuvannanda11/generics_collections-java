import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteArrayConverter {

    public static void main(String[] args) {
        String inputImagePath = "input.jpg";  // Replace with the actual image path
        String outputImagePath = "output.jpg"; // Output file

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Convert byte array back to image
            writeByteArrayToImage(imageBytes, outputImagePath);

            // Verify if the images are identical
            if (compareFiles(inputImagePath, outputImagePath)) {
                System.out.println("Success! The output image is identical to the input image.");
            } else {
                System.out.println("Error! The output image differs from the input image.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Convert image file to byte array
    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Write byte array back to image file
    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Compare two image files byte by byte
    private static boolean compareFiles(String file1Path, String file2Path) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(file1Path).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(file2Path).toPath());

        return Arrays.equals(file1Bytes, file2Bytes);
    }
}
