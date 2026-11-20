import java.util.ArrayList;
import java.util.Scanner;

class Registration {
    String studentId;
    String studentName;
    String eventName;

    Registration(String id, String name, String event) {
        studentId = id;
        studentName = name;
        eventName = event;
    }
}

public class Task6 {
    static ArrayList<Registration> list = new ArrayList<>();

    static void registerStudent(String id, String name, String event) {

        for (Registration r : list) {
            if (r.studentId.equals(id) &&
                r.eventName.equalsIgnoreCase(event)) {

                System.out.println("Duplicate Registration!");
                return;
            }
        }

        list.add(new Registration(id, name, event));
        System.out.println("Registration Successful!");
    }

    static void display() {
        if (list.isEmpty()) {
            System.out.println("No Registrations Found");
            return;
        }

        System.out.println("\n--- REGISTRATION LIST ---");

        for (Registration r : list) {
            System.out.println("Student ID: " + r.studentId);
            System.out.println("Name: " + r.studentName);
            System.out.println("Event: " + r.eventName);
            System.out.println("----------------------");
        }
    }

    static void filter(String event) {
        boolean found = false;

        System.out.println("\n--- FILTERED REGISTRATIONS ---");

        for (Registration r : list) {
            if (r.eventName.equalsIgnoreCase(event)) {
                System.out.println(r.studentId + " | "
                        + r.studentName + " | "
                        + r.eventName);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No registrations for this event.");
        }
    }

    static void exportCSV() {
        System.out.println("\n--- CSV DATA ---");
        System.out.println("StudentID,StudentName,Event");

        for (Registration r : list) {
            System.out.println(r.studentId + ","
                    + r.studentName + ","
                    + r.eventName);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== CAMPUS EVENT REGISTRATION ===");
            System.out.println("1. Register Student");
            System.out.println("2. Display Registrations");
            System.out.println("3. Filter by Event");
            System.out.println("4. Export CSV");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Event Name: ");
                String event = sc.nextLine();

                if (id.isEmpty() || name.isEmpty() || event.isEmpty()) {
                    System.out.println("Invalid Input!");
                } else {
                    registerStudent(id, name, event);
                }
            }
            else if (choice == 2) {
                display();
            }
            else if (choice == 3) {
                System.out.print("Enter Event Name: ");
                String event = sc.nextLine();
                filter(event);
            }
            else if (choice == 4) {
                exportCSV();
            }
            else if (choice == 5) {
                System.out.println("Program Exited");
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}

