import java.io.IOException;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class wordFrequencyCount {
    public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Prashant\\Documents\\example.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        reader.close();
        return wordCountMap;
    }

    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\Himanshi\\Documents\\example.txt";
            Map<String, Integer> wordCount = countWordFrequency(filePath);
            System.out.println(wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}