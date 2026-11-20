import java.util.*;

class Patient {
    String name;
    int severity;
    long arrival;

    Patient(String name, int severity, long arrival) {
        this.name = name;
        this.severity = severity;
        this.arrival = arrival;
    }

    public String toString() {
        return name + "(S" + severity + ")";
    }
}

public class Task6 {

    PriorityQueue<Patient> queue =
        new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity)
            .thenComparingLong(p -> p.arrival)
        );

    long counter = 0;

    void admit(String name, int severity) {
        queue.add(new Patient(name, severity, counter++));
    }

    Patient next() {
        return queue.poll();
    }

    public static void main(String[] args) {

        Task6 er = new Task6();

        er.admit("Ravi", 3);
        er.admit("Meena", 1);
        er.admit("John", 3);
        er.admit("Asha", 5);
        er.admit("Kumar", 1);
        er.admit("Lata", 2);
        er.admit("Rahul", 4);
        er.admit("Priya", 2);

        System.out.println("Patient Treatment Order:");

        Patient p;

        while ((p = er.next()) != null) {
            System.out.print(p + " ");
        }
    }
}
