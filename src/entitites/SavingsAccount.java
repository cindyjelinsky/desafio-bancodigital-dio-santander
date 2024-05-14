package entitites;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

   @Override
   public void printBalance(){
       System.out.println("===Savings Account Balance===");
       super.printInfo();
   }


}
