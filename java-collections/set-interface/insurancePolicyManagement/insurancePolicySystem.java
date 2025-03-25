package insurancePolicyManagement;

import java.util.*;
import java.time.*;
public class InsurancePolicySystem {
    private Set<Policy> policySet = new HashSet<>();
    private Set<Policy> orderedPolicySet = new LinkedHashSet<>();
    private Set<Policy> sortedPolicySet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        policySet.add(policy);
        orderedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies:");
        policySet.forEach(System.out::println);
    }

    public void displayExpiringPolicies() {
        LocalDate now = LocalDate.now();
        System.out.println("\nPolicies expiring within 30 days:");
        sortedPolicySet.stream()
                .filter(p -> p.getExpiryDate().isBefore(now.plusDays(30)))
                .forEach(System.out::println);
    }

    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("\nPolicies with coverage type " + coverageType + ":");
        policySet.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();

        system.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 1200.0));
        system.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(35), "Auto", 800.0));
        system.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(20), "Home", 1500.0));
        system.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 1200.0)); // Duplicate

        system.displayAllPolicies();
        system.displayExpiringPolicies();
        system.displayPoliciesByCoverage("Health");
    }

}
