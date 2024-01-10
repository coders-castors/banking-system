// Bank.java

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts in the Bank:");
        for (Account account : accounts) {
            account.display();
        }
    }
}
