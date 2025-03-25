import java.util.*;
public class highestKeyValue {
    public static String findMaxKey(Map<String, Integer> map) {
        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("A", 10);
        sampleMap.put("B", 20);
        sampleMap.put("C", 15);

        String maxKey = findMaxKey(sampleMap);
        System.out.println("Key with maximum value: " + maxKey);
    }
}