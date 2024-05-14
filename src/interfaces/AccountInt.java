package interfaces;

import entitites.Account;

public interface AccountInt {

   void deposit(double amount);
   void withdraw(double amount);
   void transfer(double amount, AccountInt accountInt);
   void printBalance();




}
