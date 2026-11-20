public class task2 {
    public static void main(String[] args) {

        int[] slotsPerFloor = {3, 2, 4};

        String[][] slots = new String[3][];

        for (int i = 0; i < slotsPerFloor.length; i++) {
            slots[i] = new String[slotsPerFloor[i]];
        }

        slots[0][0] = "TN01AB1111";
        slots[1][0] = "TN02CD2222";

        System.out.println("Parking Slot Details:");

        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {
                System.out.println("Floor " + i + " Slot " + j
                        + " : " + slots[i][j]);
            }
        }

        int minutes = 90;
        double rate = 30;

        double hours = Math.ceil(minutes / 60.0);
        double fee = hours * rate;

        System.out.println("Parking Duration: " + minutes);
        System.out.println("Parking Fee: Rs " + fee);
    }
}
