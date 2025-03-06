package OOP;
public class Employee {
private int id;
private String name;
private double salary;
private String department;


    public Employee(int id, String name, double salary, String department){
    this.id= id;
    this.name= name;
    this.salary= salary;
    this.department= department;
}

public double calculateBonus(){
    return 0;
}

public void displayInfo() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: "+ salary);
    System.out.println("Department: "+ department);
    System.out.println("Bonus: "+ calculateBonus());
}

public double getSalary() {
    return salary;
    }
}


