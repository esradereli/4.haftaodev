public class Main {
    public static void main(String[] args) {
        // SavingsAccount ve CheckingAccount nesneleri oluşturuluyor
        BankAccount savings = new SavingsAccount("Esra Dereli", 25000);
        BankAccount checking = new CheckingAccount("Ahmet Baser", 5000);


        System.out.println("Savings Account Details:");
        savings.displayInfo();
        savings.calculateInterest();

        System.out.println("\nChecking Account Details:");

        checking.displayInfo();
        checking.calculateInterest();
    }
}
