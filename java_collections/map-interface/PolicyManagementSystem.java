import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyHolderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) obj;
        return Objects.equals(policyNumber, that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(InsurancePolicy o) {
        return this.expiryDate.compareTo(o.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy No: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate + ", Type: " + coverageType + ", Premium: $" + premiumAmount;
    }
}


public class PolicyManagementSystem {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<InsurancePolicy> getAllPolicies() {
        return hashSetPolicies;
    }

    public Set<InsurancePolicy> getPoliciesExpiringSoon() {
        Set<InsurancePolicy> expiringPolicies = new TreeSet<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        Date thresholdDate = calendar.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    public Set<InsurancePolicy> getPoliciesByCoverageType(String coverageType) {
        Set<InsurancePolicy> filteredPolicies = new HashSet<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public Set<InsurancePolicy> findDuplicatePolicies() {
        Set<String> uniquePolicyNumbers = new HashSet<>();
        Set<InsurancePolicy> duplicatePolicies = new HashSet<>();

        for (InsurancePolicy policy : hashSetPolicies) {
            if (!uniquePolicyNumbers.add(policy.getPolicyNumber())) {
                duplicatePolicies.add(policy);
            }
        }
        return duplicatePolicies;
    }

    public void comparePerformance() {
        int size = 10000;
        List<InsurancePolicy> testPolicies = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            testPolicies.add(new InsurancePolicy(
                    "P" + i, "Holder" + i, new Date(System.currentTimeMillis() + (i * 100000)), "Health", 500.0 + i
            ));
        }

        long start, end;

        // HashSet Performance
        start = System.nanoTime();
        Set<InsurancePolicy> hashSet = new HashSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        // LinkedHashSet Performance
        start = System.nanoTime();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        // TreeSet Performance
        start = System.nanoTime();
        Set<InsurancePolicy> treeSet = new TreeSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        // Search Performance
        InsurancePolicy searchPolicy = testPolicies.get(size / 2);
        start = System.nanoTime();
        hashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.JANUARY, 15);
        InsurancePolicy p1 = new InsurancePolicy("P101", "Alice", cal.getTime(), "Health", 1200);

        cal.set(2024, Calendar.APRIL, 10);
        InsurancePolicy p2 = new InsurancePolicy("P102", "Bob", cal.getTime(), "Auto", 800);

        cal.set(2024, Calendar.MAY, 5);
        InsurancePolicy p3 = new InsurancePolicy("P103", "Charlie", cal.getTime(), "Home", 1500);

        cal.set(2024, Calendar.MARCH, 20);
        InsurancePolicy p4 = new InsurancePolicy("P104", "Dave", cal.getTime(), "Health", 950);

        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);

        // Display all unique policies
        System.out.println("\nAll Policies:");
        system.getAllPolicies().forEach(System.out::println);

        // Policies expiring soon
        System.out.println("\nPolicies Expiring Soon:");
        system.getPoliciesExpiringSoon().forEach(System.out::println);

        // Get policies by coverage type
        System.out.println("\nHealth Insurance Policies:");
        system.getPoliciesByCoverageType("Health").forEach(System.out::println);

        // Find duplicate policies
        System.out.println("\nDuplicate Policies:");
        system.findDuplicatePolicies().forEach(System.out::println);

        // Performance Comparison
        System.out.println("\nPerformance Comparison:");
        system.comparePerformance();
    }
}