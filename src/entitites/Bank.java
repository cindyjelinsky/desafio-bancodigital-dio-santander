package entitites;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;


    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Account> getAccounts() {

       return accounts;
    }


    public void addSavingsAccount(Client client) {
        accounts.add(new SavingsAccount(client));
    }

    public void addCheckingAccount(Client client) {

        accounts.add(new CheckingAccount(client));
    }

    public Account getAccount(int accountNumber) {
        Account accountResult = null;
        for (Account acc : accounts) {
            if (acc.getAccNumber() == accountNumber) {
                accountResult = acc;
                break;
            }

        }
        return accountResult;
    }
}
