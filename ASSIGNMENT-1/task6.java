class Vehicle {

    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
        System.out.println("Vehicle Constructor");
    }

    void display() {
        System.out.println("Registration Number: " + regNo);
    }
}

class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
        System.out.println("Car Constructor");
    }
}

class ElectricCar extends Car {

    ElectricCar(String regNo) {
        super(regNo);
        System.out.println("ElectricCar Constructor");
    }
}

class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
        System.out.println("TwoWheeler Constructor");
    }
}

public class task6 {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("TN01EV1234");
        e.display();

        System.out.println();

        TwoWheeler t = new TwoWheeler("TN02TW5678");
        t.display();
    }
}

