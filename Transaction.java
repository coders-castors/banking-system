// Transaction.java

public class Transaction {
    public static void performTransaction(Account account, double amount) {
        System.out.println("Performing transaction on account " + account + ":");
        account.deposit(amount);
        account.withdraw(amount / 2);
        account.display();
    }
}
