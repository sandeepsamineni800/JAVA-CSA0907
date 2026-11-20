class ParkingSlot {

    private int slotNo;
    private boolean occupied;

    ParkingSlot(int slotNo) {
        setSlotNo(slotNo);
        occupied = false;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        if (slotNo > 0) {
            this.slotNo = slotNo;
        } else {
            throw new IllegalArgumentException("Invalid slot number");
        }
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void parkVehicle() {
        if (!occupied) {
            occupied = true;
            System.out.println("Vehicle Parked");
        } else {
            System.out.println("Slot Already Occupied");
        }
    }

    public void releaseSlot() {
        occupied = false;
        System.out.println("Slot Released");
    }
}

public class task10 {

    public static void main(String[] args) {

        ParkingSlot s = new ParkingSlot(101);

        System.out.println("Slot Number: " + s.getSlotNo());

        s.parkVehicle();

        System.out.println("Occupied: " + s.isOccupied());

        s.releaseSlot();

        System.out.println("Occupied: " + s.isOccupied());

        try {
            s.setSlotNo(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
