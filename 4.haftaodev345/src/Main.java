//Abstract class, başka sınıflar tarafından miras alınmak (extend edilmek) amacıyla oluşturulan bir sınıftır.
//Interface-Tamamen soyut bir yapıdır, içindeki tüm metotlar default olarak abstract ve public olarak kabul edilir.

abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}

interface ElectricVehicle {
    void chargeBattery();
}

class Car extends Vehicle implements ElectricVehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " is starting.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(brand + " is charging its battery.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla");
        tesla.start();
        tesla.chargeBattery();
        tesla.stop();
    }
}
