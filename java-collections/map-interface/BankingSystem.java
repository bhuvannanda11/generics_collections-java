import java.util.*;
public class BankingSystem{
    private Map<String, Double> accounts = new HashMap<>();
    private NavigableMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    public void processWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber + "," + amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void executeWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String[] request = withdrawalQueue.poll().split(",");
            String accountNumber = request[0];
            double amount = Double.parseDouble(request[1]);

            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Withdrawal of $" + amount + " from Account " + accountNumber + " successful.");
            } else {
                System.out.println("Insufficient balance or account not found.");
            }
        }
    }

    public void displayAccountsByBalance() {
        System.out.println("\nAccounts Sorted by Balance:");
        sortedAccounts.forEach((balance, accountNumber) ->
                System.out.println("Account: " + accountNumber + ", Balance: $" + balance));
    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.createAccount("1001", 5000.0);
        system.createAccount("1002", 3000.0);
        system.createAccount("1003", 7000.0);

        system.processWithdrawal("1001", 1000.0);
        system.processWithdrawal("1003", 500.0);

        system.executeWithdrawals();
        system.displayAccountsByBalance();



    }
}