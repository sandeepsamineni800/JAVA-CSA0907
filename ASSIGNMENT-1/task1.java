class Vehicle {
    String regNo;
    String type;

    Vehicle(String regNo, String type) {
        this.regNo = regNo;
        this.type = type;
    }

    void display() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Vehicle Type: " + type);
    }
}

class ParkingSlot {
    int slotNo;
    boolean occupied;

    ParkingSlot(int slotNo) {
        this.slotNo = slotNo;
        occupied = false;
    }
}

class ParkingTicket {
    int ticketNo;
    String entryTime;

    ParkingTicket(int ticketNo, String entryTime) {
        this.ticketNo = ticketNo;
        this.entryTime = entryTime;
    }
}

public class task1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("TN01AB1111", "Car");
        ParkingSlot s = new ParkingSlot(1);
        ParkingTicket t = new ParkingTicket(101, "10:30 AM");

        v.display();
        System.out.println("Slot Number: " + s.slotNo);
        System.out.println("Slot Occupied: " + s.occupied);
        System.out.println("Ticket Number: " + t.ticketNo);
        System.out.println("Entry Time: " + t.entryTime);
    }
}
