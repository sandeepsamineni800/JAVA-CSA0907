import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        String patientId = sc.nextLine();

        System.out.println("\nDepartments:");
        System.out.println("1. Cardiology");
        System.out.println("2. Neurology");
        System.out.println("3. Orthopedics");

        System.out.print("Select Department: ");
        int department = sc.nextInt();
        sc.nextLine();

        String doctor = "";

        if (department == 1) {
            System.out.println("Doctors: Dr. Ravi, Dr. Kumar");
        } else if (department == 2) {
            System.out.println("Doctors: Dr. Suresh, Dr. Priya");
        } else if (department == 3) {
            System.out.println("Doctors: Dr. Arun, Dr. Manoj");
        } else {
            System.out.println("Invalid Department");
            return;
        }

        System.out.print("Enter Doctor Name: ");
        doctor = sc.nextLine();

        System.out.println("\nTime Slots:");
        System.out.println("1. 10:00 AM");
        System.out.println("2. 11:00 AM");
        System.out.println("3. 2:00 PM");

        System.out.print("Select Time Slot: ");
        int slot = sc.nextInt();

        String time = "";

        if (slot == 1)
            time = "10:00 AM";
        else if (slot == 2)
            time = "11:00 AM";
        else if (slot == 3)
            time = "2:00 PM";
        else {
            System.out.println("Invalid Time Slot");
            return;
        }

        System.out.println("\nAppointment Booked Successfully!");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor: " + doctor);
        System.out.println("Time: " + time);

        sc.close();
    }
}
