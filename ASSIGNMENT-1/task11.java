import java.util.HashMap;

abstract class Vehicle {

    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    abstract double calculateFee(int minutes);
}

class TwoWheeler extends Vehicle {

    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return ((minutes + 59) / 60) * 10;
    }
}

class Car extends Vehicle {

    Car(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return ((minutes + 59) / 60) * 30;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    double calculateFee(int minutes) {
        return ((minutes + 59) / 60) * 30;
    }
}

class ParkingTicket {

    Vehicle vehicle;
    int floor;
    int slot;

    ParkingTicket(Vehicle vehicle, int floor, int slot) {
        this.vehicle = vehicle;
        this.floor = floor;
        this.slot = slot;
    }
}

class ParkingFacility {

    String[][] slots;

    HashMap<String, ParkingTicket> tickets =
            new HashMap<String, ParkingTicket>();

    ParkingFacility(int[] sizes) {

        slots = new String[sizes.length][];

        for (int i = 0; i < sizes.length; i++) {
            slots[i] = new String[sizes[i]];
        }
    }

    void park(Vehicle v) {

        if (tickets.containsKey(v.regNo)) {
            System.out.println("Duplicate Registration");
            return;
        }

        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {

                if (slots[i][j] == null) {

                    slots[i][j] = v.regNo;

                    tickets.put(v.regNo,
                            new ParkingTicket(v, i, j));

                    System.out.println(v.regNo
                            + " Parked at Floor " + i
                            + " Slot " + j);

                    return;
                }
            }
        }

        System.out.println("Parking Full");
    }

    void exit(String regNo, int minutes) {

        ParkingTicket t = tickets.get(regNo);

        if (t == null) {
            System.out.println("Vehicle Not Found");
            return;
        }

        double fee = t.vehicle.calculateFee(minutes);

        System.out.println(regNo + " Parking Fee: Rs " + fee);

        slots[t.floor][t.slot] = null;
        tickets.remove(regNo);

        System.out.println("Slot Released");
    }
}

public class task11 {

    public static void main(String[] args) {

        ParkingFacility p =
                new ParkingFacility(new int[]{2, 2});

        p.park(new TwoWheeler("TN01A1"));
        p.park(new Car("TN02B2"));
        p.park(new ElectricCar("TN03C3"));

        p.park(new Car("TN02B2"));

        p.exit("TN01A1", 60);
        p.exit("TN02B2", 120);
        p.exit("TN03C3", 0);

        p.exit("TN05D5", 60);

        System.out.println("Remaining Vehicles: "
                + p.tickets.size());
    }
}
