class ParkingTicket {

    static int ticketCounter = 100;
    static int totalOccupancy = 0;

    int ticketNo;
    String vehicleNo;

    ParkingTicket(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        ticketNo = ++ticketCounter;
        totalOccupancy++;
    }

    void leaveParking() {
        totalOccupancy--;
    }

    static void displayOccupancy() {
        System.out.println("Total Occupancy: " + totalOccupancy);
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

public class task5 {
    public static void main(String[] args) {

        ParkingTicket t1 = new ParkingTicket("TN01AB1111");
        ParkingTicket t2 = new ParkingTicket("TN02CD2222");

        t1.display();
        t2.display();

        ParkingTicket.displayOccupancy();

        t1.leaveParking();

        System.out.println("After Vehicle Exit:");
        ParkingTicket.displayOccupancy();

        t1 = null;
        t2 = null;

        System.out.println("Ticket objects are eligible for garbage collection.");
    }
}
