public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest earned: " + interest);
    }
}