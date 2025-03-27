package exception_handling.bank_transaction_system;

public class Account {
    String accountHolderName;
    int accountNumber;
    double balance;

    public Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws IllegalArgumentException{
        if(amount<=0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        balance += amount;
        System.out.println(amount + " rupees successfully deposited in your account");
    }

    public void withdraw(double amount)throws Exception{
        if (amount<0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        if(balance<amount){
            throw new InsufficientBalanceException("Insufficient Amount!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
