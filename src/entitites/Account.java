package entitites;

import interfaces.AccountInt;

public abstract class Account implements AccountInt {

    private static final int BRANCH = 688;
    private static int ACCOUNT_NUMBER = 1;

    protected int branch;
    protected Integer accNumber;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.branch = Account.BRANCH;
        this.accNumber = ACCOUNT_NUMBER++;
        this.client = client;
    }


    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Not enough funds");
        }
    }

    @Override
    public void transfer(double amount, AccountInt accountInt) {
        if (this.balance >= amount) {
            withdraw(amount);
            accountInt.deposit(amount);
        } else {
            System.out.println("Not enough funds");
        }

    }


    public int getBranch() {
        return branch;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }


    protected void printInfo() {
        System.out.println("Account Holder: " + this.client.getName() + "\n"
                + "Branch: " + this.branch + "\n"
                + "Account Number: " + this.accNumber + "\n"
                + "Balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "branch= " + branch +
                ", accNumber= " + accNumber +
                ", client= " + client.getName() +
                '}';
    }
}
