import entitites.Account;
import entitites.Bank;
import entitites.Client;
import entitites.SavingsAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank("Santander");

        bank.addSavingsAccount(new Client("Marta de La Reina"));
        bank.addSavingsAccount(new Client("Fina Velro"));
        bank.addCheckingAccount(new Client("Carmen Reyes"));
        bank.addCheckingAccount(new Client("Luz Borell"));
        bank.addCheckingAccount(new Client("J.R Ewing"));
        bank.addSavingsAccount(new Client("Miss Ellie"));

        System.out.println("=== Welcome to " + bank.getName() + " ===\n");

        System.out.print("Enter Accoount Number: ");
        int accN = sc.nextInt();

        boolean exit = true;
        while (exit) {
            System.out.println("\nSELECT:\n" +
                    "1 - Deposit\n" +
                    "2 - Withdraw\n" +
                    "3 - Transfer\n" +
                    "4 - Print Balance\n" +
                    "5 - Exit");


            int selection = sc.nextInt();

            switch (selection) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    bank.getAccount(accN).deposit(amount);
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    bank.getAccount(accN).withdraw(amount);
                }
                case 3 -> {
                    System.out.print("Enter recipient account: \n");
                    int recAccount = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    bank.getAccount(accN).transfer(amount, bank.getAccount(recAccount));
                }
                case 4 -> {
                    bank.getAccount(accN).printBalance();
                }
                case 5 -> {
                    exit = false;
                }
                default -> {
                    System.out.println("Option Not Found, Try Again");
                }
            }

        }

        
    }
}