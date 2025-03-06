package OOP;

public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager(1,"Esra Dereli",30000, "IE",12);
        Developer developer= new Developer(2, "Selim Özer", 25000,"SE","C# Developer");

        System.out.println("Manager Information:");
        manager.displayInfo();
        System.out.println("--------------------------");
        System.out.println("Developer Information: ");
        developer.displayInfo();
    }
}
