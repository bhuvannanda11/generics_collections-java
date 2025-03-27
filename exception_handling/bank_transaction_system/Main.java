package exception_handling.bank_transaction_system;

public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account("Aman Aggarwal", 123);
        try{
            account.deposit(1000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            account.withdraw(1500);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
