// Main.java

public class Main {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account myAccount = new Account(12345, 1000.0);

        // Perform transactions
        Transaction.performTransaction(myAccount, 500.0);

        // Display the final account information
        System.out.println("Final account information:");
        myAccount.display();

        // Create a bank
        Bank bank = new Bank();

        // Add accounts to the bank
        bank.addAccount(myAccount);
        bank.addAccount(new Account(67890, 1500.0));

        // Display all accounts in the bank
        bank.displayAllAccounts();
    }
}
