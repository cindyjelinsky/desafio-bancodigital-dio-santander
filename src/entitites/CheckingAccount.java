package entitites;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printBalance() {
        System.out.println("===Checking Account Balance===");
        super.printInfo();
    }
}
