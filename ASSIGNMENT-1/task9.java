abstract class Vehicle {

    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    abstract double calculateFee();
}

interface Chargeable {

    double chargingFee(int units);

    default void chargingDetails() {
        System.out.println("Vehicle supports charging");
    }

    static void displayMessage() {
        System.out.println("EV Charging Facility");
    }
}

class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee() {
        return 30;
    }
}

class ElectricCar extends Vehicle implements Chargeable {

    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee() {
        return 30;
    }

    @Override
    public double chargingFee(int units) {
        return units * 12;
    }
}

public class task9 {

    public static void main(String[] args) {

        Car c = new Car("TN01AB1111");
        ElectricCar e = new ElectricCar("TN02EV2222");

        System.out.println("Car Fee: Rs " + c.calculateFee());

        System.out.println("Electric Car Fee: Rs "
                + e.calculateFee());

        System.out.println("Charging Fee: Rs "
                + e.chargingFee(10));

        e.chargingDetails();

        Chargeable.displayMessage();
    }
}
