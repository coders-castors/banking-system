// Account.java

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
