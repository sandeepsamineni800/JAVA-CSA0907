class Vehicle {

    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    double calculateFee() {
        return 20;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + regNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Vehicle))
            return false;

        Vehicle v = (Vehicle) obj;
        return regNo.equals(v.regNo);
    }

    @Override
    public int hashCode() {
        return regNo.hashCode();
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

class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee() {
        return 10;
    }
}

public class task7 {
    public static void main(String[] args) {

        Vehicle v1 = new Car("TN01AB1111");
        Vehicle v2 = new TwoWheeler("TN02CD2222");
        Vehicle v3 = new Car("TN01AB1111");

        System.out.println(v1);
        System.out.println("Car Fee: Rs " + v1.calculateFee());

        System.out.println(v2);
        System.out.println("Two Wheeler Fee: Rs " + v2.calculateFee());

        System.out.println("Same Registration: " + v1.equals(v3));

        System.out.println("Hash Codes Equal: "
                + (v1.hashCode() == v3.hashCode()));
    }
}
