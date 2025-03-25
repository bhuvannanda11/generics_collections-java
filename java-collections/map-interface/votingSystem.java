import java.util.*;
public class votingSystem {
    private Map<String, Integer> voteCountMap = new HashMap<>();
    private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    private NavigableMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, voteCountMap.get(candidate));
        sortedVoteMap.put(candidate, voteCountMap.get(candidate));
    }

    public void displayResults() {
        System.out.println("Votes in the order of casting:");
        orderedVoteMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));

        System.out.println("\nVotes in sorted order:");
        sortedVoteMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));

        System.out.println("\nFinal Vote Count:");
        voteCountMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));
    }

    public static void main(String[] args) {
        votingSystem votingSystem = new votingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Carol");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResults();
    }
}