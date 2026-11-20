class ParkingTicket {

    private int ticketNo;
    private String vehicleNo;
    private String entryTime;

    static int count = 100;

    ParkingTicket() {
        this("UNKNOWN", "Not Recorded");
    }

    ParkingTicket(String vehicleNo) {
        this(vehicleNo, "10:00 AM");
    }

    ParkingTicket(String vehicleNo, String entryTime) {
        this.ticketNo = ++count;
        this.vehicleNo = vehicleNo;
        this.entryTime = entryTime;
    }

    ParkingTicket(ParkingTicket t) {
        this(t.vehicleNo, t.entryTime);
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Entry Time: " + entryTime);
    }
}

public class Task4 {
    public static void main(String[] args) {

        ParkingTicket t1 = new ParkingTicket();
        ParkingTicket t2 = new ParkingTicket("TN01AB1111");
        ParkingTicket t3 = new ParkingTicket("TN02CD2222", "11:30 AM");
        ParkingTicket t4 = new ParkingTicket(t3);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
    }
}
