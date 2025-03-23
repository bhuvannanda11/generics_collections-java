import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Replace with actual file path

        try {
            Map<String, Integer> wordCountMap = countWords(filePath);
            displayTopWords(wordCountMap, 5); // Display top 5 frequent words
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to count words in a file
    private static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return wordCountMap;
    }

    // Method to display the top N most frequent words
    private static void displayTopWords(Map<String, Integer> wordCountMap, int topN) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort in descending order

        System.out.println("\nTop " + topN + " most frequent words:");
        for (int i = 0; i < Math.min(topN, sortedWords.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
